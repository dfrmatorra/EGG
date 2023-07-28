/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp.servicios;

import java.util.Scanner;
import mascotaapp.Entidad.Mascota;

/**
 *
 * @author CASA
 */
public class ServicioMascota {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Mascota crearMascota() {

        System.out.println("Ingrese el nombre de la mascota");
        String nombre = leer.next();
        System.out.println("Ingrese el apodo de la mascota");
        String apodo = leer.next();
        System.out.println("Ingrese el tipo de la mascota");
        String tipo = leer.next();

        return new Mascota(nombre, apodo, tipo);
        
    }
}
