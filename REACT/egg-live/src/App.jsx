import React from 'react';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import "./App.css";
import Header from "./assets/Header";
import Footer from "./assets/Footer";
import Productos from './assets/Productos';


function App() {
  return (
    <BrowserRouter>
      <Header />
      <Routes>
        <Route path='/' element={<Productos/>} />
      </Routes>
      <Footer />
    </BrowserRouter>
  );
}

export default App;
