/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Editorial;
import HacksDPackage.Servicios;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author dudum
 */
public class EditorialService {
    
    Servicios serv = new Servicios();
    
    
     public Editorial crearEditorial() {
        
         Editorial edit = new Editorial();
         
         System.out.print("Nombre Editorial: ");
         String nombre = serv.editorial();
         System.out.println(nombre);
         serv.wait(300);
         
         edit.setAlta(true);
         edit.setNombre(nombre);
         
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("libroPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(edit);
        em.getTransaction().commit();
        em.close();
         
         return edit;
         
     
     }
    
    
}
