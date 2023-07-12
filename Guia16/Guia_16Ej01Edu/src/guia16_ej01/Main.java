/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia16_ej01;

import Services.AutorService;
import Services.EditorialService;
import Services.LibroService;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        LibroService ls = new LibroService();
        AutorService as = new AutorService();
        EditorialService es = new EditorialService();

//1) Crear base de datos Librería
//2) Crear unidad de persistencia
//3) Crear entidades previamente mencionadas (excepto Préstamo)
//4) Generar las tablas con JPA
//5) Crear servicios previamente mencionados.
//6) Crear los métodos para persistir entidades en la base de datos librería

//for (int i = 0; i < 4; i++) {
// ls.crearLibroAutomatico();   
//}
//ls.crearLibroAutomatico();

//7-Crear los métodos para persistir entidades en la base de datos librería
//        System.out.println("Indique el ID del libro que desea editar");
//        int id = leer.nextInt();
//        ls.altaBajaLibroPorId(id);

//8) Búsqueda de un Autor por nombre.
//        as.buscarAutor();

//9) Búsqueda de un libro por ISBN.
//        ls.buscarPorISBN();
        
   
//10) Búsqueda de un libro por Título.
//        ls.buscarPorTitulo();

//11) Búsqueda de un libro/s por nombre de Autor.
//        ls.buscarLibroPorAutor();

//12) Búsqueda de un libro/s por nombre de Editorial.
//        ls.buscarLibroPorEditorial();

//13) Agregar las siguientes validaciones a todas las funcionalidades de la aplicación:
//• Validar campos obligatorios.
//• No ingresar datos duplicados.
        ls.crearLibro();







        
          

        
    }

}
