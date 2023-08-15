/*Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
        En caso de que el valor ingresado sea 0, se debe mostrar “el número no es par ni impar”.
  */

let ingreso = document.getElementById("input");
let aceptar = document.getElementById("btn");
let resultado = document.getElementById("output");

function operacion() {
    if (parseInt(ingreso.value) === 0) {
        resultado.textContent = "El numero no es par ni impar ";
    } else if (parseInt(ingreso.value) % 2 === 0) {
        resultado.textContent = "El numero es par ";
    }
    else {
        resultado.textContent = "El numero es impar ";
    }
    ingreso.value = "";
}

function operacionTernaria() {
    let num = parseInt(ingreso.value);
    num === 0 ? resultado.textContent = `El numero ${num} no es par ni impar ` : //if
        (num % 2 === 0 ? resultado.textContent = `El numero ${num}  es par `  :   //else if
            resultado.textContent = `El numero ${num}  es impar `)              //else
    ingreso.value = "";
}
aceptar.onclick = operacionTernaria;


