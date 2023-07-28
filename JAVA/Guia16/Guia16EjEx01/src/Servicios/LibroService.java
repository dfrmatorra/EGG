package Servicios;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import Persistencia.LibroDAO;
import java.util.List;
import java.util.Scanner;

public class LibroService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    LibroDAO dao = new LibroDAO();

    public Libro crearLibro(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Autor autor, Editorial editorial) {
        Libro libro = new Libro();
        try {
            libro.setIsbn(isbn);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplarePrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            dao.crearLibro(libro);
            System.out.println("Guardado con exito.");
            return libro;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        
    }

    public void darDeBaja(String nombre) {
        Libro libro = dao.buscarLibroPorNombre(nombre);
        libro.setAlta(false);
        dao.editarAlta(libro);
    }

    public void darDeAlta(String nombre) {
        Libro libro = dao.buscarLibroPorNombre(nombre);
        libro.setAlta(true);
        dao.editarAlta(libro);
    }
    
    
     public Libro buscarLibroPorNombre(String nombre) {
//        try {
            Libro libro = dao.buscarLibroPorNombre(nombre);
            return  libro;
//        } catch (Exception e) {
//            System.out.println("Hay un problema al buscar un libro por nombre");
//            return null;
//        }
    }
     
      public Libro buscarLibroPorISBN(Long isbn) {
        try {
            return dao.buscarLibroPorISBN(isbn);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
      }
      
      public List<Libro> buscarLibrosPorNombreAutor(String nombre){
        try { 
            return dao.buscarLibroPorNombreAutor(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }  
        
    }
}