package H.Dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import H.Dsvendas.dto.SaleDTO;
import H.Dsvendas.dto.SaleSuccessDTO;
import H.Dsvendas.dto.SaleSumDTO;
import H.Dsvendas.entities.Sale;
import H.Dsvendas.repositories.SaleRepository;
import H.Dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;

	@Autowired
	private SellerRepository sellerReposytory;

	@Transactional(readOnly = true) // apenas uma operacao
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerReposytory.findAll(); // usado para buscar os vendedores apenas uma vez
		Page<Sale> result = repository.findAll(pageable);
		return result.map(s -> new SaleDTO(s));
	}

	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller() {
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller() {
		return repository.successGroupedBySeller();
	}
	
}
