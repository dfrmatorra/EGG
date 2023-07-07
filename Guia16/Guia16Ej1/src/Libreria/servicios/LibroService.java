/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicios;

import Libreria.entidades.Autor;
import Libreria.entidades.Editorial;
import Libreria.entidades.Libro;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Dario
 */
public class LibroService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    AutorService aus = new AutorService();
    EditorialService eds = new EditorialService();

    public Libro crearLibro() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Guia16Ej1PU");
        EntityManager em = emf.createEntityManager();
        
        System.out.println("");
        System.out.println("INGRESO DE LIBRO");
        System.out.println("----------------");
//        System.out.print("isbn: ");
//        long isbn = leer.nextLong();
//        System.out.println(isbn);
        System.out.print("Titulo: ");
        String titulo = leer.next();
        System.out.println(titulo);
        System.out.print("Año: ");
        int anio = leer.nextInt();
        System.out.println(anio);
        System.out.print("Ejemplares: ");
        int ejemplares = leer.nextInt();
        System.out.println(ejemplares);
        System.out.print("Ejemplares Prestados: ");
        int ejemplaresPrestados = leer.nextInt();
        System.out.println(ejemplaresPrestados);
        System.out.print("Ejemplares restantes: ");
        int ejemplaresRestantes = ejemplares - ejemplaresPrestados;
        System.out.println(ejemplaresRestantes);

        Autor au = aus.crearAutor();
        Editorial edit = eds.crearEditorial();
        boolean alta = true;

        Libro lib = new Libro(titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, au, edit);

        return lib;
    }

}
