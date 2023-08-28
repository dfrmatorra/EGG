import React from 'react'
import "./componente.css";
import Logo from '../logo192.png';



const texto = 'footer';

const Footer = () => {
  return (
    <div className="estiloFooter">
      <p>
        Esto es un test del {texto}
      </p>
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

export default Footer
