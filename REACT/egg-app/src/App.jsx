import { useState } from "react";
import "./App.css";
import { useEffect } from "react";

/// Uso de controlador de estado con un elemento.
// function App() {
//   const [contador1, setContador1] = useState(0);
//   let contador2 = 0;

//   console.log('renderizo')

//   function sumarContador1() {
//     setContador1(contador1 + 1);
//   }

//   function sumarContador2() {
//     console.log(contador2)
//     contador2 = contador2 + 1;
//   }

//   return (
//     <div>
//       <p>{contador1}</p>
//       <button onClick={sumarContador1}> Sumar contador 1</button>
//       <p>{contador2}</p>
//       <button onClick={sumarContador2}> Sumar contador 2</button>
//     </div>

//   )
// }

/// renderizado condicional
// function App() {
//   const [mostrar, setMostrar] = useState(false);
  
// //aca "mostrar &&" hace que corrobore si la variable mostrar es verdadero para mostrar
//   return (
//     <div>
//       <p>{mostrar && 'muestro el texto'}</p>
//       <button onClick={()=>setMostrar(!mostrar)}> Mostrar texto</button>

//     </div>

//   )
// }

function App() {
  const [contador, setContador1] = useState(0);
  const [contador2, setContador2] = useState(0);

  useEffect(() =>{
    console.log('useEffect')
  },[contador])

  

  const incrementar = () => {
    setContador1(contador + 1);
  }

  const incrementar2 = () => {
    setContador2(contador2 + 1);
  }

  return (
    <div>
      <p>Contador: {contador}</p>
      <button onClick={incrementar}> Incrementar</button>
      <p>Contador2: {contador2}</p>
      <button onClick={incrementar2}> Incrementar</button>
    </div>
  );
}

export default App;
