let ingresoISBN = document.getElementById(id = "inputISBN");
let ingresotitulo = document.getElementById(id = "inputTitulo");
let ingresoautor = document.getElementById(id = "inputAutor");
let ingresopaginas = document.getElementById(id = "inputPaginas");



let libros = [];

class Libro {''
    constructor(ISBN, titulo, autor, paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
}

function crearLibro() {
    let ISBN = ingresoISBN.value;
    let titulo = ingresotitulo.value;
    let autor = ingresoautor.value;
    let paginas = ingresopaginas.value;
    var libro = new Libro(ISBN, titulo, autor, paginas);
    libros.push(libro);
    console.log(libro, typeof libro);
    ingresoISBN.value = "";
    ingresotitulo.value = "";
    ingresoautor.value = "";
    ingresopaginas.value = "";
}

function mostrarLibros() {
    /*
//OPCION 1
    libros.forEach((item, index) => {
        const h2 = document.createElement("h2");
        h2.id = `mostrar_h2_${index + 1}`;
        h2.innerHTML = `ISBN: ${item.ISBN} - Titulo: ${item.titulo} - Autor:  ${item.autor} - Paginas: ${item.paginas}`;
        document.body.appendChild(h2);
    });
    */

    
//OPCION2 
// Supongamos que tienes un array de elementos a mostrar
// Obtener una referencia al contenedor donde mostrarás el array
const arrayContainer = document.getElementById("array-container");

// Crear un elemento de lista no ordenada (ul)
const ul = document.createElement("ul");

// Recorrer el array y crear elementos de lista (li) para cada elemento
libros.forEach(item => {
    const li = document.createElement("li");
    li.textContent = `ISBN: ${item.ISBN} - Titulo: ${item.titulo} - Autor:  ${item.autor} - Paginas: ${item.paginas}`
    ul.appendChild(li);
});

// Agregar la lista al contenedor
arrayContainer.appendChild(ul);


}