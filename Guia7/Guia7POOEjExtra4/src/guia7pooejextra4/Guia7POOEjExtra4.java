/*
Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
crea métodos para agregar nuevas recetas a la lista, para buscar una
receta por nombre y para obtener la lista de recetas que se pueden
preparar con los ingredientes disponibles en la cocina.
 */
package guia7pooejextra4;

import Entidad.Cocina;

/**
 *
 * @author Dario
 */
public class Guia7POOEjExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cocina receta1 = new Cocina();
        
        receta1.nuevaReceta();
        
        Cocina receta2 = new Cocina();
        
        receta2.nuevaReceta();
    }
    
}
