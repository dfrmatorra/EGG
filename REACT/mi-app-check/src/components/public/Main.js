import React from 'react'
import imagena from "../images/imagena.png"; // Importa las imágenes correctamente
import imagenb from "../images/imagenb.png";
import imagenc from "../images/imagenc.png";
import imagend from "../images/imagend.png";
import imagene from "../images/imagene.png";

const Main = () => {
  return (
    <div>
            <div id="slider" className="flexslider" style={{ opacity: 1 }}>
        <div className="image-container">
        <ul className="slides">
          <li>
            <img
              src={imagenb}
              className="image fast right delay1"
              draggable="false"
            />
          </li>
          <li>
            <img
              src={imagenc}
              className="image fast right delay3"
              draggable="false"
            />
          </li>
          <li>
            <img
              src={imagena}
              className="image fast right delay2"
              draggable="false"
            />
          </li>
          <li>
            <img
              src={imagend}
              className="image fast right delay4"
              draggable="false"
            />
          </li>
          <li>
            <img src={imagene} className="image fast right" draggable="false" />
          </li>
        </ul>
      </div>
      </div>
    </div>
  )
}

export default Main
