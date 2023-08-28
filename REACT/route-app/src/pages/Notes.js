import React from 'react'
import imagenOk from './ok.png';


const Notes = () => (
  <section className="About">
    <h3>Hello Here is the Notes</h3>
    return (
    <div className="col">
      <div className="card shadow-sm">
        <div className="imagenCarta">
          <img
          width="300px"
          src= {imagenOk}
          alt="Img personajes"
        />
        </div>
       
        <h3 className="m-2 text-center text-dark">

        </h3>
        <div className="card-body">
          <h1>
            Hola 
          </h1>
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
  </section>
);
export default Notes;
