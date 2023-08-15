let ingreso = document.getElementById('input');
let resultado = document.querySelector('#resultado');
let ingresar = document.getElementById("btn");
let numeros = [];

function operacion() {
    // Leer números hasta que se ingrese 0
    //ingresar.addEventListener("click", () => {
    let numero = parseFloat(ingreso.value);
    console.log(numero, typeof numero); //para chequear
    if (numero !== 0) {
        // Validar que el número ingresado sea un entero válido
        if (Number.isInteger(numero) && numero !== null) {
            numeros.push(Number(numero));
        } else {
            alert("Ingrese un número entero válido.");
            return;
        }
        console.log(numeros);//para chequear
    }
    ingreso.value = "";
    // Verificar que se haya ingresado al menos un número distinto de cero
    if (numero === 0) {
        if (numeros.length === 0) {
            alert("No se ingresaron números.");
            return;
        }
        // Calcular el máximo, mínimo y promedio de los números ingresados
        let maximo = Math.max(...numeros); // Utilizar spread operator para pasar los elementos del array como argumentos individuales
        let minimo = Math.min(...numeros); // Utilizar spread operator para pasar los elementos del array como argumentos individuales
        let suma = numeros.reduce((a, b) => a + b, 0);
        let promedio = suma / numeros.length;

        // Mostrar los resultados
        resultado = `Máximo número ingresado: ${maximo} \n
    Mínimo número ingresado: ${minimo} \n
    Promedio de los números ingresados: ${promedio}`;
        console.log("Máximo número ingresado: " + maximo);
        console.log("Mínimo número ingresado: " + minimo);
        console.log("Promedio de los números ingresados: " + promedio);
    }

}


