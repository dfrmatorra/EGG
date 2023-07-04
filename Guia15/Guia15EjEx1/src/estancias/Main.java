package estancias;

/*\a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de
2020 y el 31 de agosto de 2020 en Reino Unido.
c) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.
d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada
y un número de días específico.
e) Listar los datos de todos los clientes que en algún momento realizaron una estancia y la
descripción de la casa donde la realizaron.
f) Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y
ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a
la anterior
g) Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el
precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios
actualizados.
h) Obtener el número de casas que existen para cada uno de los países diferentes.
i) Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios)
que están ‘limpias’.
j) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.
 */

import estancias.entidades.Casa;
import estancias.entidades.Cliente;
import estancias.entidades.Estancia;
import estancias.servicios.CasaService;
import estancias.servicios.ClienteService;
import estancias.servicios.EstanciaService;
import estancias.servicios.FamiliaService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DarioF
 */
public class Main {

    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        EstanciaService es = new EstanciaService();

        CasaService cs = new CasaService();

        ClienteService cls = new ClienteService();

        FamiliaService fs = new FamiliaService();

        int opc;
        do {
            System.out.println("MENU");
            System.out.println("--------");
            System.out.println("1.- Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.");
            System.out.println("2.- Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de\n"
                    + "2020 y el 31 de agosto de 2020 en Reino Unido.");
            System.out.println("3.- Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.");
            System.out.println("4.- Listar los datos de todos los clientes que en algún momento realizaron una estancia y la\n"
                    + "descripción de la casa donde la realizaron.");
            System.out.println("5.- Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y\n"
                    + "ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a la anterior");
            System.out.println("6.- Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el\n"
                    + "precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios actualizados");
            System.out.println("7.- Obtener el número de casas que existen para cada uno de los países diferentes.");
            System.out.println("8.- Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios)\n"
                    + "que están ‘limpias’");
            System.out.println("9.- Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.");
            System.out.println("10.- Salir");

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("---Familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.---");
                    fs.imprimirFamilias(2);
                    System.out.println("----------");
                    break;

                case 2:
                    System.out.println("---Casas disponibles pentre el 1 de agosto de 2020 y el 31 en Reino Unido.---");
                    cs.imprimirCasas(2);
                    System.out.println("----------");
                    break;

                case 3:
                    System.out.println("---Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.---");
                    fs.imprimirFamilias(3);
                    break;

                case 4:
                    System.out.println("---clientes que en algún momento realizaron una estancia y la descripción de la casa donde la realizaron.---");
                    cls.imprimirClientes(1);
                    System.out.println("----------");
                    break;

                case 5:
                    System.out.println("---estancias que han sido reservadas por un cliente, mostrar el nombre, país y\n"
                            + "ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a la anterior---");
                    ArrayList<Estancia> estancias = new ArrayList();
                    ArrayList<Cliente> clientes = new ArrayList();
                    ArrayList<Casa> casas = new ArrayList();
                    estancias = es.listarEstancias();
                    clientes = cls.listarClientes();
                    casas = cs.listarCasas();

                    for (Estancia estancia : estancias) {
                        for (Cliente cliente : clientes) {
                            for (Casa casa : casas) {
                                if (estancia.getIdCliente() == cliente.getIdCliente()) {
                                    System.out.println(estancia.getIdEstancia() + " - " + cliente.getNombre() + " - " + cliente.getPais() + " - \n +"
                                            + cliente.getCiudad() + " - " + casa);
                                    break;
                                }
                            }
                        }

                    }
                    System.out.println("----------");
                    break;
                /*
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
                 */
                case 11:
                    break;
            }
        } while (opc != 11);

        //es.imprimirEstancias(1);
        //cs.imprimirCasas(1);
        //cls.imprimirClientes(1);
        //fs.imprimirFamilias(1);
        //fs.eliminarFamilia(7);
    }

}
