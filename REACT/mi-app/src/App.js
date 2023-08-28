import "./App.css";
import "./components/public/Main";
import "./components/public/NavBar";
import "./components/public/Footer";
import NavBar from "./components/public/NavBar";
import Main from "./components/public/Main";
import Footer from "./components/public/Footer";

const titulo = "Hola Mundo";
const subTitulo = "Que tal?";

function App() {
  return (
    <div className="App">
      <NavBar />

      <Main />

      <Footer />
    </div>
  );
}

export default App;
