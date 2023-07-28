package principal;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.servicios.FabricanteService;
import tienda.servicios.ProductoService;

/**
 *
 * @author DarioF
 */
public class Tienda {

    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ProductoService ps = new ProductoService();
        FabricanteService fs = new FabricanteService();

        int opc;
        do {
            System.out.println("MENU");
            System.out.println("--------");
            System.out.println("1.- Lista el nombre de todos los productos que hay en   la tabla producto");
            System.out.println("2.- Lista los nombres y los precios de todos los productos de la tabla producto");
            System.out.println("3.- Listar aquellos productos que su precio esté entre 120 y 202");
            System.out.println("4.- Buscar y listar todos los Portátiles de la tabla producto");
            System.out.println("5.- Listar el nombre y el precio del producto más barato");
            System.out.println("6.- Ingresar un producto a la base de datos");
            System.out.println("7.- Ingresar un fabricante a la base de datos");
            System.out.println("8.- Editar un producto con datos a elección");
            System.out.println("9.- Salir");

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("---Lista el nombre de todos los productos que hay en la tabla producto---");
                    ps.imprimirProductos(2);
                    System.out.println("----------");
                    break;
                case 2:
                    System.out.println("---Lista los nombres y los precios de todos los productos de la tabla producto---");
                    ps.imprimirProductos(3);
                    System.out.println("----------");
                    break;
                case 3:
                    System.out.println("---Listar aquellos productos que su precio esté entre 120 y 202---");
                    Collection<Producto> productos = ps.listarProductos();
                    for (Producto aux : productos) {
                        if (aux.getPrecio() >= 120 && aux.getPrecio() <= 202) {
                            System.out.println(aux.getCodigo() + " - " + "Producto: " + aux.getNombre() + " - Precio: "
                                    + aux.getPrecio());
                        }
                    }
                    break;
                case 4:
                    System.out.println("---Buscar y listar todos los Portátiles de la tabla producto---");
                    ps.imprimirProductos(4);
                    System.out.println("----------");
                    break;
                case 5:
                    System.out.println("---Listar el nombre y el precio del producto más barato---");
                    ps.imprimirProductos(5);
                    System.out.println("----------");
                    break;
                case 6:
                    System.out.println("---Ingresar un producto a la base de datos---");
                    System.out.println("Ingrese el nombre del producto");
                    String nombre = leer.next();
                    System.out.println("Ingrese el precio del producto");
                    int precio = leer.nextInt();
                    System.out.println("Ingrese el codigo de fabricante (del 1 al 9)");
                    int codigoFab = leer.nextInt();
                    ps.crearProducto(nombre, precio, codigoFab);
                    break;
                case 7:
                    System.out.println("---Ingresar un fabricante a la base de datos---");
                    fs.imprimirFabricantes();
                    System.out.println("Ingrese el nombre del fabricante");
                    String nombreF = leer.next();
                    fs.crearFabricante(nombreF);
                    fs.imprimirFabricantes();
                    break;
                case 8:
                    System.out.println("---Editar un producto con datos a elección---");
                    System.out.println("indique el codigo del producto que quiere editar");
                    int codigoEditar = leer.nextInt();
                    System.out.println("Usted va a editar el siguiente producto");
                    System.out.println(ps.buscarProductoPorCodigo(codigoEditar));
                    //ingresamos los nuevos datos
                    System.out.println("Ingrese el nombre actualizado del producto");
                    String nombre2 = leer.next();
                    System.out.println("Ingrese el precio actualizado del producto");
                    int precio2 = leer.nextInt();
                    System.out.println("Ingrese el fabricante actualizado del producto");
                    int nombreF2 = leer.nextInt();
                    Producto producto2 = new Producto(codigoEditar, nombre2, precio2, nombreF2);

                    ps.modificarProducto(codigoEditar, producto2);
                    break;
                case 9:
                    break;
            }
        } while (opc != 9);

////a) Lista el nombre de todos los productos que hay en   la tabla producto.
//        System.out.println("LISTA DE NOMBRE DE LA TABLA PRODUCTOS:");
//        ps.imprimirProductos(2);
//        System.out.println("----------");
//
////b) Lista los nombres y los precios de todos los productos de la tabla producto.
//        System.out.println("LISTA DE NOMBRE Y PRECIO DE LA TABLA PRODUCTOS:");
//        ps.imprimirProductos(3);
//        System.out.println("----------");
//
////d) Buscar y listar todos los Portátiles de la tabla producto.
//        System.out.println("LISTA DE PORTATILES DE LA TABLA PRODUCTOS:");
//        ps.imprimirProductos(4);
//        System.out.println("----------");
//
////e) Listar el nombre y el precio del producto más barato.
//        System.out.println("LISTA DE PORTATILES DE LA TABLA PRODUCTOS:");
//        ps.imprimirProductos(5);
//        System.out.println("----------");
//
////f) Ingresar un producto a la base de datos.
//        System.out.println("Ingrese el nombre del producto");
//        String nombre = leer.next();
//        System.out.println("Ingrese el precio del producto");
//        int precio = leer.nextInt();
//        System.out.println("Ingrese el codigo de fabricante (del 1 al 9)");
//        int codigoFab = leer.nextInt();
//        ps.crearProducto(nombre, precio, codigoFab);
////g) Ingresar un fabricante a la base de datos
//        System.out.println("Ingrese el nombre del fabricante");
//        String nombreF = leer.next();
//        fs.crearFabricante(nombreF);
//h) Editar un producto con datos a elección.
//        System.out.println("indique el codigo del producto que quiere editar");
//        int codigoEditar = leer.nextInt();
//        System.out.println("Usted va a editar el siguiente producto");
//        System.out.println(ps.buscarProductoPorCodigo(codigoEditar));
//        //ingresamos los nuevos datos
//        System.out.println("Ingrese el nombre actualizado del producto");
//        String nombre2 = leer.next();
//        System.out.println("Ingrese el precio actualizado del producto");
//        int precio2 = leer.nextInt();
//        System.out.println("Ingrese el fabricante actualizado del producto");
//        int nombreF2 = leer.nextInt();
//        Producto producto2 = new Producto(codigoEditar, nombre2, precio2, nombreF2);
//
//        ps.modificarProducto(codigoEditar, producto2);
//     ps.imprimirProductos();
//     ps.crearProducto("tv", 200, 1);
//     ps.eliminarProducto(12);
//     System.out.println(ps.buscarProductoPorCodigo(2));
    }

}
