// Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.
package servicios;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class TiendaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    HashMap<String, Double> productos = new HashMap<>();

    public void menu() {
        int opcion;
        do {
            System.out.println("MENU");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Borrar todos los productos");
            System.out.println("6. Carga masiva de 20 productos");
            System.out.println("7. Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    borrarTodosLosProductos();
                case 6:
                    cargaMasiva();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (true);

    }

    public void agregarProducto() {

        do {
            System.out.println("Ingrese el nombre del producto");
            String nombre = leer.next();
            System.out.println("Ingrese el precio del producto");
            double precio = leer.nextDouble();
            productos.put(nombre, precio);
            System.out.println("Desea agregar otro producto? S/N");
        } while (!leer.next().equalsIgnoreCase("n"));

    }

    public void modificarPrecio() {
        System.out.println("Ingrese el nombre del producto a modificar");
        String nombre = leer.next();
        System.out.println("El producto que va a modificar es: " + nombre + " y su precio es: " + productos.get(nombre));
        System.out.println("Ingrese el nuevo precio");
        double precio = leer.nextDouble();
        productos.put(nombre, precio);
    }

    public void eliminarProducto() {
        System.out.println("Ingrese el nombre del producto a eliminar");
        String nombre = leer.next();
        productos.remove(nombre);
    }

    public void mostrarProductos() {
        int cont = 1;
        for (String nombre : productos.keySet()) {
            System.out.println("Producto " + cont + ": " + nombre + " / " + "$" + String.format("%.2f", productos.get(nombre) ));
            cont++;
        }
    }

    public void borrarTodosLosProductos() {
        System.out.println("Esta seguro que desea borrar todos los productos? S/N");
        if (leer.next().equalsIgnoreCase("s")) {
            productos.clear();
            System.out.println("Se han borrado todos los productos");
        }
    }

    public void cargaMasiva() {

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            productos.put(String.valueOf(i), random.nextDouble ()*1000); // mostrar dos digitos del random
        }
    }
}

