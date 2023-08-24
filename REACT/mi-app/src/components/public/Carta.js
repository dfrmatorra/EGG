import React from 'react'
import imagenOk from "../../components/ok.png";
import "./componente.css";


const personaje = 'Esto es una prueba del personaje de un API'

const Carta = () => {
  return (
    <div className="col">
      <div className="card shadow-sm">
        <div className="imagenCarta">
          <img
          width="100%"
          src= {imagenOk}
          alt="Img personajes"
        />
        </div>
       
        <h3 className="m-2 text-center text-dark">{personaje}</h3>
        <div className="card-body">
          <p className="card-text">
            This is a wider card with supporting text below as a natural lead-in
            to additional content. This content is a little bit longer.
          </p>
          <div className="d-flex justify-content-between align-items-center">
            <div className="btn-group">
              <button
                type="button"
                className="btn btn-sm btn-outline-secondary"
              >

              </button>
            </div>
          </div>
        </div>
      </div>
    </div>
      );
}

export default Carta
