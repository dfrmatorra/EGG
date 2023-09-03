import React, { useEffect, useState } from "react";
import { obtenerProductos } from "../services/productoService";

export default function Productos() {
  const [productos, setProductos] = useState([]);

  useEffect(() => {
    obtenerProductos().then(data => 
        // setProductos(data)
        console.log(data)
        );
  });

  return <div>Productos</div>;
}
