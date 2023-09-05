import React from "react"
import { Link } from "react-router-dom"
import LogoImg from '../img/logo.png'

export default function Header() {
  return (
    <header className='header'>
      <Link to={"/"}>
        <img className='logo' src={LogoImg} alt="" />
      </Link>
      <nav>
        <Link to={"/"}>Productos</Link>
        <Link to={"/"}>Favoritos</Link>
      </nav>
    </header>
  );
}
