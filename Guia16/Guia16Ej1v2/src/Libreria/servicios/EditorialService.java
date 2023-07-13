/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicios;

import Libreria.entidades.Editorial;
import Libreria.persistencia.ControladoraPersistencia;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Dario
 */
public class EditorialService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ControladoraPersistencia conPer = new ControladoraPersistencia();

    public Editorial crearEditorial() {//String nombre, Boolean alta

        System.out.println("");

        System.out.println("Ingrese el nombre de la Editorial");
        String nombre = leer.next();
        Boolean alta = true;
        Editorial edi = new Editorial(nombre, alta);
        
        conPer.crearEditorial(edi);

        return edi;
    }

}
