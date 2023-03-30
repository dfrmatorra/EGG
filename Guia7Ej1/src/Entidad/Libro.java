/*
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class Libro {

    //ATRIBUTOS
    public int isbn;
    public String titulo;
    public String autor;
    public int paginas;

    //CONSTRUCTOR VACIO
    public Libro() {
    }

    //CONSTRUCTOR CON TODOS LOS ATRIBUTOS
    public Libro(int isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;

    }



    //METODOS
    public void cargarLibro() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el ISBN:");
        isbn = leer.nextInt();
        System.out.println("Ingrese el Titulo:");
        titulo = leer.next();
        System.out.println("Ingrese el autor:");
        autor = leer.next();
        System.out.println("Ingrese la cantidad de paginas:");
        paginas = leer.nextInt();
    }

    public void mostrarLibro() {
        System.out.println("La informacion del libro es:");
        System.out.println("---------------------------");
        System.out.println("El ISBN del libro es: " + isbn);
        System.out.println("El titulo del libro es: " + titulo);
        System.out.println("El autor del libro es: " + autor);
        System.out.println("El libro tiene: " + paginas + " paginas");

    }

}
