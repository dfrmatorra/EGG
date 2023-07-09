/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia16_ej01;

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
              
        
        ls.crearLibro();
        
        
        System.out.println("Indique el libreo que desea borrar");
        int id = leer.nextInt();
        ls.borrarLibro(id);
        
        

    }
    
}
