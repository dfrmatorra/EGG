/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Editorial;
import HacksDPackage.Servicios;
import Persistance.EditorialDAO;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author dudum
 */
public class EditorialService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Servicios serv = new Servicios();

    EditorialDAO eDAO = new EditorialDAO();

    public Editorial crearEditorial() {
        Editorial edi = new Editorial();
        System.out.print("Ingrese el Nombre de la Editorial: ");
        String nombre = serv.validarString();

        boolean alta = true;

        if (eDAO.existeEditorial(nombre)!=null) {
            System.out.println("Esta Editorial ya tiene libros en la libreria");
        } else {
            edi.setAlta(true);
            edi.setNombre(nombre);


//            EntityManagerFactory emf = Persistence.createEntityManagerFactory("libroPU");
//            EntityManager em = emf.createEntityManager();
//
//            em.getTransaction().begin();
//            em.persist(edi);
//            em.getTransaction().commit();
//            em.close();

        }
        return edi;
    }

    public Editorial crearEditorialAutomat() {

        Editorial edit = new Editorial();

        System.out.print("Nombre Editorial: ");
        String nombre = serv.editorial();
        System.out.println(nombre);
        serv.wait(300);

        edit.setAlta(true);
        edit.setNombre(nombre);
        
        eDAO.guardar(edit);

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("libroPU");
//        EntityManager em = emf.createEntityManager();
//
//        em.getTransaction().begin();
//        em.persist(edit);
//        em.getTransaction().commit();
//        em.close();

        return edit;

    }

    public Editorial buscarPorId() {

        try {
            System.out.println("Ingrese el id a buscar");
            Integer id = leer.nextInt();
            return eDAO.buscarPorId(id);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            serv.wait(500);
            return null;
        }
    }

}
