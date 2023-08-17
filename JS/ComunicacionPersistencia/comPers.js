/*
async function peticion(){
    
    let response = await fetch("https://rickandmortyapi.com/api/character");
    let data = await response.json();
    return data;
}

let r = await peticion();
console.log(r);*/


const persona = {
    nombre: "Chiquito",
    apellido: "Apellido"
}

function soloNombre ({nombre= "nn"}){
    console.log(nombre);
}

soloNombre(persona);
    
    fetch("https://rickandmortyapi.com/api/character")
    .then(response => response.json())
    .then (data => {
     const {results} = data;
     console.log(results);
});

