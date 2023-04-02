/*
Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
crea métodos para agregar nuevas recetas a la lista, para buscar una
receta por nombre y para obtener la lista de recetas que se pueden
preparar con los ingredientes disponibles en la cocina.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class Cocina {

    String receta [];

    public Cocina() {
    }

    public String [] nuevaReceta() {
        System.out.println("Cantidad de ingredientes:");
        Scanner leer = new Scanner(System.in);
        int cantIng = leer.nextInt();
        
        String nuevaReceta[] = new String[cantIng];
        
        for (int i = 0; i < cantIng; i++) {
            System.out.println("Ingresar el ingrediente " + i);
            nuevaReceta [i] = leer.nextLine();
        }
        return nuevaReceta;
    }
}
