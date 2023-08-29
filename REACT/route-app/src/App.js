import React from "react";
import "./App.css";
import { Link, BrowserRouter, Route, Routes } from "react-router-dom";
import Home from "./pages/Home";
import About from "./pages/About";
import Notes from "./pages/Notes";
import PageNotFound from "./pages/PageNotFound";
import NavBar from './components/NavBar';

const inlineStyle = {
  textDecoration: "none", // Por ejemplo, puedes añadir más estilos aquí
};

function App() {
  return (
<div>
<header class="open">
	<div id="head">
		<a href="/" id="logo" class="show"><span>ROBO</span><span>te</span><span>c</span><span>h</span></a>
	</div>
</header>

</div>
  );
}

export default App;
