/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Autor;
import HacksDPackage.Servicios;
import Persistance.AutorDAO;
import Persistance.DAO;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author dudum
 */
public class AutorService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Servicios serv = new Servicios();
    AutorDAO auD = new AutorDAO();

    public Autor crearAutor() {

        Autor au = new Autor();
        System.out.print("Nombre del Autor: ");
        String nombre = serv.apellidoNombre();
        System.out.println(nombre);
        serv.wait(300);
        boolean alta = true;

        au.setAlta(true);
        au.setNombre(nombre);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("libroPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(au);
        em.getTransaction().commit();
        em.close();

        return au;

    }

    public void buscarAutor() {

        try {
            System.out.println("Ingrese el nombre del autor a buscar");
            String nombre = leer.next();
            auD.buscarXNombre(nombre);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            serv.wait(500);

        }

    }

    public Autor buscarPorId() {

        try {
            System.out.println("Ingrese el id a buscar");
            Integer id = leer.nextInt();
            return auD.buscarPorId(id);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            serv.wait(500);
            return null;
        }
    }

}
