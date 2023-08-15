/*//Pedir al usuario que ingrese el valor del radio y Convertir el valor del radio a número
const radio = parseFloat(prompt("Ingresa el valor del radio:"));

// Verificar si el usuario ingresó un número válido
if (isNaN(radio)) {
  alert("Por favor, ingresa un valor válido para el radio.");
} else {
  //calcular el área y el perímetro
  const PI = Math.PI;
  const area = PI * Math.pow(radio, 2);
  const perimetro = 2 * PI * radio;

  // Mostrar los resultados por pantalla
  alert("Área de la circunferencia: " + area + "\n"
  + "Perímetro de la circunferencia: " + perimetro);
}*/


const input = document.getElementById("input");
const guardar = document.querySelector(".btn");
const resultado = document.getElementById("resultado");

guardar.addEventListener("click", () => {
  let radio = parseFloat(input.value);
  if (isNaN(radio)){
    alert("Esta vacio, ingrese un valor");
    return;
  }
  console.log("El boton fue presionado");
  input.value = "";
  console.log(radio);
  const PI = Math.PI;
  const area = PI * Math.pow(radio, 2);
  const perimetro = 2 * PI * radio;
  resultado.textContent = `El area es ${area.toFixed(2)} \n
  El preimetro es ${perimetro.toFixed(2)}`

});