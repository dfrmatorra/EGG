/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;




/**
 *
 * @author CASA
 */
public class POOEJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona primeraPersona = new Persona ("Dario", "Matorra", 43, true);
        
                
        Persona segundaPersona = new Persona ("Mariano");
        
        primeraPersona.setNombre("Dario Fernando");
        
        System.out.println(primeraPersona.nombre + " " + primeraPersona.getApellido());
        
            }
    
    
}
