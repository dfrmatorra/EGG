/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicios;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author DarioF
 */
public class TiendaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    HashMap<String, Float> listaMap = new HashMap();

    public void llenarMapa() {

        int respuesta = 0;
        do {
            System.out.println("MENU");
            System.out.println("1-Introducir producto:");
            System.out.println("2-Modificar producto:");
            System.out.println("3-Eliminar producto:");
            System.out.println("4-Mostrar producto:\n"
                    + "5-Salir");
            respuesta = leer.nextInt();
            switch (respuesta) {
                case 1:
                    cargarProducto();
                    break;
                case 2:
                    modificarProducto();
                    break;
                case 3:
                    eliminarProducto();
                case 4:
                    mostrarProducto();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ingrese un valor valido");
            }
        } while (respuesta != 5);
    }

    public void cargarProducto() {
        int cont = 1;
        String resp = "";
        do {
            System.out.println("Ingrese el nombre del producto " + cont);
            String producto = leer.next();
            System.out.println("Ingrese el precio del producto " + cont);
            Float precio = leer.nextFloat();
            listaMap.put(producto, precio);
            cont++;
            System.out.println("Desea continuar cargando otro producto?(s/n)");
            resp = leer.next();
        } while (!resp.equalsIgnoreCase("n"));
    }

    public void modificarProducto() {
        System.out.println("Ingrese el nombre del producto a modificar:");
        String nombre = leer.next();
        if (listaMap.containsKey(nombre)) {
            System.out.println("Ingrese el nuevo precio del producto ");
            Float precio = leer.nextFloat();
            listaMap.put(nombre, precio);
        } else {
            System.out.println("El producto no existe");
        }
    }

    public void eliminarProducto() {
        System.out.println("Ingrese el nombre del producto a eliminar:");
        String nombre = leer.next();
        if (listaMap.containsKey(nombre)) {

            listaMap.remove(nombre);
        } else {
            System.out.println("El producto no existe");
        }
    }

    public void mostrarProducto() {
        listaMap.keySet().forEach((producto) -> {
            System.out.println(producto + " " + listaMap.get(producto));
        });
    }
}
