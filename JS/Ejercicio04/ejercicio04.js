/*Realiza un programa que sólo permita introducir los caracteres ‘S’ y ‘N’. Si el usuario
ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.*/

const input = document.getElementById("input");
const guardar = document.querySelector(".btn");
const resultado = document.getElementById("resultado");

guardar.addEventListener("click", () => {
  let caracter = input.value;
  const longitud = caracter.length;
  if (caracter==="" || longitud !== 1 || !tieneLetras(caracter)){
    alert("Ingrese un caracter");
    input.value = "";
    return;
  }
    console.log("El boton fue presionado");
  input.value = "";
  console.log("caracter= " + caracter);
  if (esLetraEspecial(caracter)){
    resultado.textContent = `CORRECTO`;
  }else{
    resultado.textContent = `INCORRECTO`;
  }
});

function tieneLetras(caracter) {
    const letras = /[a-zA-Z]/.test(caracter);
    return letras;
  }

  function esLetraEspecial(caracter) {
    const regex = /[sSnN]/;
    console.log(regex.test(caracter));
    return regex.test(caracter);
  }