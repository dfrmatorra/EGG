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

//        ls.crearLibro();

//        System.out.println("Indique el ID del libro que desea editar");
//        int id = leer.nextInt();
//        ls.altaBajaLibroPorId(id);

//            as.buscarAutor();
            ls.buscarPorISBN();
        
        
        

//          System.out.println(es.buscarPorId());
          
          

        
    }

}
