/*Escriba un programa en donde se pida la edad del usuario. Si el usuario es mayor de
edad se debe mostrar un mensaje indicándolo.*/

// Leer el numero ingresado
    do {
        numero = parseFloat(prompt("Ingrese la edad:"));

        // Validar que el número ingresado sea un entero válido
        if (Number.isInteger(numero)) {
            var edad = numero;
        } else {
            alert("Ingrese un número entero válido.");
        }
    } while (isNaN(numero));

// Función para verificar la edad
function verificarEdad() {
    // Obtener el valor del input con id "edad"
    edad = parseInt(prompt("Ingrese la edad:"));

    // Verificar si la edad es mayor o igual a 18
    if (edad >= 18) {
        // Mostrar mensaje si es mayor de edad
        alert('Eres mayor de edad.');
    } else {
        // Mostrar mensaje si es menor de edad
        alert('Eres menor de edad.');
    }
}
verificarEdad();