import React from 'react'
import "./componente.css";


const texto = 'footer';

const Footer = () => {
  return (
    <div className="estiloFooter">
      <p>
        Esto es un test del {texto}
      </p>

    </div>
  )
}

export default Footer
