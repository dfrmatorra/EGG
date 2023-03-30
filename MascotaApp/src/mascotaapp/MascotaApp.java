/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp;

import java.util.Scanner;
import mascotaapp.Entidad.Mascota;

/**
 *
 * @author CASA
 */
public class MascotaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Mascota m1 = new Mascota("Fernando Chiquito", "Chiquito", "Perro");

        m1.setNombre("Pepe Chiquito");
        
        m1.pasear(100,4);

        System.out.println(m1.toString());
    
    }

}
