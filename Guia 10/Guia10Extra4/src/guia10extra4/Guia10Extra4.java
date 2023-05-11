/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección.
Poner el código postal sin la letra, solo el numero.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al
usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap
 */
package guia10extra4;

import Servicio.CiudadService;

/**
 *
 * @author CASA
 */
public class Guia10Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CiudadService cs = new CiudadService ();
        
        cs.crearCiudades();
        cs.mostrar();
        cs.buscarCiudad();
        cs.agregarCiudad();
        cs.mostrar();
        cs.eliminarCiudad();
        cs.mostrar();
        
    }
    
    
    
}
