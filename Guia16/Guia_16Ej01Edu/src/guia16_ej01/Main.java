/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia16_ej01;

import Entities.Libro;
import Services.AutorService;
import Services.EditorialService;
import Services.LibreriaService;

/**
 *
 * @author dudum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LibreriaService ls = new LibreriaService();
      
        
        
        ls.crearLibro();
        
        
        
        
        
        
//        
////        for (int i = 0; i < 10; i++) {
//            
//        System.out.println("");
//        Autor au1 = aus.crearAutor();
//        Editorial ed1 = eds.crearEditorial();
//        Libro lib1 = ls.crearLibro(au1, ed1);
//        
//        
//        
//        em.getTransaction().begin();
//        em.persist(au1);
//        em.getTransaction().commit();
////        em.close();
//        
////        em = emf.createEntityManager();
//        em.getTransaction().begin();
//        em.persist(ed1);
//        em.getTransaction().commit();
////        em.close();
//        
////        em = emf.createEntityManager();
//        em.getTransaction().begin();
//        em.persist(lib1);
//        em.getTransaction().commit();
//        em.close();
    }
    
}
