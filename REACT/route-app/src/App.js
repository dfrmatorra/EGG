import React from "react";
import "./App.css";
import { Link, BrowserRouter, Route, Routes } from "react-router-dom";
import Home from "./pages/Home";
import About from "./pages/About";
import Notes from "./pages/Notes";
import PageNotFound from "./pages/PageNotFound";

const inlineStyle = {
  textDecoration: "none", // Por ejemplo, puedes añadir más estilos aquí
};

function App() {
  return (
    <BrowserRouter>
      <header classsName='inlineStyle'>
        <Link to="/" style={inlineStyle}>
          Home
        </Link>
        <Link to="/About" style={inlineStyle}>
          About
        </Link>
        <Link to="/Notes" style={inlineStyle}>
          Notes
        </Link>
      </header>

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/About" element={<About />} />
        <Route path="/Notes" element={<Notes />} />
        <Route path="*" element={<PageNotFound />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
