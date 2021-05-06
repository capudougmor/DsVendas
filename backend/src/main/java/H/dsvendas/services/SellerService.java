package H.Dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import H.Dsvendas.dto.SellerDTO;
import H.Dsvendas.entities.Seller;
import H.Dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		return result.stream().map(s -> new SellerDTO(s)).collect(Collectors.toList());
	}
}
