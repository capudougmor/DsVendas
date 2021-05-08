import BarChart from "../../componentes/Barchart/Index"
import NavBar from "../../componentes/NavBar/Index"
import DonutChart from "../../componentes/DonutChart/Index"
import Footer from "../../componentes/Footer/Index"


function Dashboard() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h2 className="text-primary py-3">Dashboard de Vendas</h2>

        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de sucesso</h5>
            <BarChart />
          </div>

          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Todas as vendas</h5>
            <DonutChart />
          </div>
        </div>

        <div className="py-3">
          <h2 className="text-primary">Todas as vendas</h2>
        </div>

      </div>
      <Footer />
    </>
  )
}

export default Dashboard