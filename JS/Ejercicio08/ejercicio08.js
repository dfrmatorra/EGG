function calcularEstadisticas() {
    let numeros = [];
    let numero;

    // Leer números hasta que se ingrese 0
    do {
        numero = parseFloat(prompt("Ingrese un número entero (0 para finalizar):"));

        // Validar que el número ingresado sea un entero válido
        if (Number.isInteger(numero)) {
            numeros.push(numero);
        } else {
            alert("Ingrese un número entero válido.");
        }
    } while (numero !== 0);

    // Verificar que se haya ingresado al menos un número distinto de cero
    if (numeros.length === 0) {
        alert("No se ingresaron números.");
        return;
    }

    // Calcular el máximo, mínimo y promedio de los números ingresados
    let maximo = Math.max(numeros);
    let minimo = Math.min(numeros);
    let suma = numeros.reduce((a, b) => a + b, 0);
    let promedio = suma / numeros.length;

    // Mostrar los resultados
    console.log("Máximo número ingresado: " + maximo);
    console.log("Mínimo número ingresado: " + minimo);
    console.log("Promedio de los números ingresados: " + promedio);
}

// Llamamos a la función para ejecutar el programa
calcularEstadisticas();
