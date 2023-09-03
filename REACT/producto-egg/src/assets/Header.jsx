import React from "react"
import { Link } from "react-router-dom"
import LogoImg from '../img/logo.png'

export default function Header() {
  return (
    <Header className='header'>
      <Link to={"/"}>
        <img src={LogoImg} alt="" />
      </Link>
      <nav>
        <Link to={"/"}>Productos</Link>
        <Link to={"/"}>Favoritos</Link>
      </nav>
    </Header>
  );
}
