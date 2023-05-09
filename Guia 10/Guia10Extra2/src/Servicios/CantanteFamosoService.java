/*
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 */
package Servicios;

import Entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author DarioF
 */
public class CantanteFamosoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<CantanteFamoso> cantantesFamosos = new ArrayList<>();

    public void crearCantante() {
        System.out.println("Ingrese el nombre del cantante famoso:");
        String nombre = leer.next();
        System.out.println("Ingrese el nombre del disco mas vendido del cantante:");
        String discoMasVentas = leer.next();
        CantanteFamoso cf = new CantanteFamoso(nombre, discoMasVentas);
        cantantesFamosos.add(cf);
    }

    public void mostrarCantante() {
        for (CantanteFamoso cantante : cantantesFamosos) {
            System.out.println(cantante.toString());
        }

    }

    public void buscarCantante() {

        Iterator<CantanteFamoso> cantanteIterator = cantantesFamosos.iterator();
        System.out.println("Ingrese el cantante a buscar y borrar:");
        String cantanteBuscado = leer.next();
        int cont = 0;
        while (cantanteIterator.hasNext()) {
            if (cantanteBuscado.equalsIgnoreCase(cantanteIterator.next().getNombre())) {
                System.out.println("El cantante esta en la lista, seguro que desea borrarlo? (s/n)");
                String respuesta = leer.next();
                if (respuesta.equalsIgnoreCase("s"))
                cantanteIterator.remove();
                System.out.println("El cantante " + cantanteBuscado + " fue borrado");
                cont++;
            }
        }
        if (cont == 0){
            System.out.println("El cantante " + cantanteBuscado + " no esta en la lista");
        }
        mostrarCantante();
    }
    

}
