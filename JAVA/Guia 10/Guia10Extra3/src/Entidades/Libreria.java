/*
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
 */
package Entidades;

import java.util.HashSet;

/**
 *
 * @author DarioF
 */
public class Libreria {

    private HashSet<Libro> LibroBiblioteca;

    public void crearLibreria() {
        LibroBiblioteca.add(new Libro("Juan Salvador Gaviota", "Richard Bach", 10, 5));
        LibroBiblioteca.add(new Libro("Fausto", "Johhan Sebastian Goethe", 8, 4));
        LibroBiblioteca.add(new Libro("David Copperfield", "Charles Dickens", 6, 3));
        LibroBiblioteca.add(new Libro("Medico rural", "Rene Favaloro", 5, 2));
        LibroBiblioteca.add(new Libro("Los hermanos Karamasov ", "Fiodor Dostoevsky", 4, 1));
        LibroBiblioteca.add(new Libro("Facundo", "Sarmiento", 10, 5));
        LibroBiblioteca.add(new Libro("La virtudes de la guerra", "Steven Pressfield", 7, 4));
        LibroBiblioteca.add(new Libro("El ejercito perdido", "Massimo Manfredi", 4, 2));
        LibroBiblioteca.add(new Libro("El leño viviente", "Louis De Wohl", 7, 3));
        LibroBiblioteca.add(new Libro("El mendigo feliz", "Louis De Wohl", 9, 5));
    }

}
