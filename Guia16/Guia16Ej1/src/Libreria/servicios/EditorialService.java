/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicios;

import Libreria.entidades.Editorial;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Dario
 */
public Editorial class EditorialService (){

    Editorial crearEditorial() {
        
        System.out.println("");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Guia16Ej1PU");
        EntityManager em = emf.createEntityManager();
        
        System.out.println("Ingrese el ");

        return ed;
    }
    
}
