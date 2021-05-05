import NavBar from "./componentes/BavBar/Index";
import Footer from "./componentes/Footer/Index";
import DataTable from "./componentes/Table/Index";

function App() {
  return (
    <>
      <NavBar />
      <h1 className="container">
        <DataTable />
      </h1>
      <Footer />
    </>
  );
}

export default App;
