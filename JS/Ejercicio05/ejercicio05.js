/*Construir un programa que simule un menú de opciones para realizar las cuatro
operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
numéricos enteros. El usuario, además, debe especificar la operación con el primer
carácter de la operación que desea realizar: ‘S' o ‘s’ para la suma, ‘R’ o ‘r’ para la resta, ‘M’
o ‘m’ para la multiplicación y ‘D’ o ‘d’ para la división.*/


const input = document.getElementById("input");
const guardar = document.querySelector(".btn");
const resultado = document.getElementById("resultado");
const pedido = document.querySelector("span"); // Definir "pedido" en un alcance más amplio

let contador = 0;
let caracter = "";
let primerNumero;
let segundoNumero;

guardar.addEventListener("click", () => {
    if (contador === 0) {
        caracter = input.value;
        console.log(caracter);
        let longitud = caracter.length;
        if (caracter === "" || longitud !== 1 || !tieneLetras(caracter)) {
            alert("Ingrese un caracter");
            input.value = "";
            return;
        }
        else if (!esLetraEspecial(caracter)) {
            alert("Ingrese un caracter de las opciones");
            input.value = "";
            return;
        }
        input.value = "";
        pedido.innerHTML = "Ingrese el primer numero"; // Mostrar pedido
        contador++;
    }
    else if (contador === 1) {
        primerNumero = parseInt(input.value); // Definir primerNumero
        input.value = "";
        pedido.innerHTML = "Ingrese el segundo numero";
        contador++;
    } else if (contador === 2) {
        segundoNumero = parseInt(input.value); // Definir segundoNumero     
        input.value = "";
        operacion()
    }
});

function tieneLetras(caracter) {
    const letras = /[a-zA-Z]/.test(caracter);
    return letras;
}

function esLetraEspecial(caracter) {
    const regex = /[sSrRmMdD]/;
    return regex.test(caracter);
}

function operacion() {
    switch (caracter.toLowerCase()) {
        case 's':
            resultado.textContent = `El resultado de la suma es ${primerNumero + segundoNumero}`;
            break;
        case 'r':
            resultado.textContent = `El resultado de la resta es ${primerNumero - segundoNumero}`;
            break;
        case 'm':
            resultado.textContent = `El resultado de la multiplicacion es ${primerNumero * segundoNumero}`;
            break;
        case 'd':
            resultado.textContent = `El resultado de la division es ${primerNumero / segundoNumero}`;
            break;
        default:
            break;

    }
}

