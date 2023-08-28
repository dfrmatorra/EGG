import React from 'react'
import "./componente.css";
import Logo from "../logo192.png";


const logo = () => {
  return (
    <div>
      <span className='logo'>
      <img 
      className='app-logo'
      height={52}
      src= {Logo}
      alt='no carga el logo'
       />
      </span>
    </div>
  )
}

export default logo
