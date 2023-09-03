import {BrowserRouter, Route, Routes} from 'react-router-dom'
import "./App.css";
import Header from "./assets/Header";
import Footer from "./assets/Footer";


function App() {
 
  return (
    <BrowserRouter>
      <Header />
      <Routes>
        <Route path='/' element={<h1>Egg</h1>}/>

      </Routes>
      <Footer />
    </BrowserRouter>
  );
}

export default App;
