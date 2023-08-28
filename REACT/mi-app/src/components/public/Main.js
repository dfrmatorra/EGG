import React from 'react'
import Carta from './Carta';
import "./componente.css";

const main = 'main con variable';

const Main = () => {
  return (
    <div className='estiloMain'>
      <p>
        Esto es un test del {main}
      </p>
      <Carta nombre = 'Chiquito'/>
      <Carta nombre = 'Filomena'/>

    
    </div>
  )
}



export default Main
