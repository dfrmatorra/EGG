/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicios;

import Libreria.entidades.Autor;
import Libreria.persistencia.AutorJpaController;
import Libreria.persistencia.ControladoraPersistencia;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Dario
 */
public class AutorService {
    
    ControladoraPersistencia conPer = new ControladoraPersistencia ();

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Autor crearAutor() {
        System.out.println("");

        System.out.println("Ingrese el nombre del autor");
        String nombre = leer.next();
        Boolean alta = true;
        Autor autor =  new Autor(nombre, alta);

        conPer.crearAutor(autor);

        return autor;

    }
}
