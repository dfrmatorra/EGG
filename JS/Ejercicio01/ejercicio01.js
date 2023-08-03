function consultarEstadoDelDia() {
    // Solicitar al usuario que ingrese el estado del día
    var estadoDelDia = prompt("¿Cómo está el día hoy? (soleado, nublado, lloviendo)");

    // Mostrar el mensaje con el dato ingresado por el usuario
    console.log("El día de hoy está " + estadoDelDia + ".");
}

// Llamamos a la función para ejecutar el algoritmo
consultarEstadoDelDia();
