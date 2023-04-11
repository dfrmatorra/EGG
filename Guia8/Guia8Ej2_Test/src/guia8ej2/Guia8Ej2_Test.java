/*
Programa Nespresso. Desarrolle una clase Cafetera_Test en el paquete
Entidades con los atributos capacidadMáxima (la cantidad máxima de
café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Agregar constructor vacío y con
parámetros así como setters y getters. Crear clase CafeteraServicio en
el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
capacidad máxima.
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café
indicada.
 */
package guia8ej2;

import Entidades.Cafetera_Test;
import Serivcios.CafeteraServicios_Test;
import java.util.Scanner;

/**
 *
 * @author DarioF
 */
public class Guia8Ej2_Test {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        CafeteraServicios_Test cs = new CafeteraServicios_Test();

//        System.out.println("Ingrese la capacidad maxima de las cafeteras");
//        cs.setearCafetera(leer.nextInt());
//        int opcion = 0;
        Cafetera_Test vectorCafetera[] = new Cafetera_Test[4];
        Cafetera_Test c1 = cs.crearCafetera(1);
        Cafetera_Test c2 = cs.crearCafetera(2);
        Cafetera_Test c3 = cs.crearCafetera(3);
        Cafetera_Test c4 = cs.crearCafetera(4);
        vectorCafetera[0] = c1;
        vectorCafetera[1] = c2;
        vectorCafetera[2] = c3;
        vectorCafetera[3] = c4;
        
        String operar = "";
        do {
            System.out.println("SELECCIONE LA CAFETERA (1-2-3-4)");
            int respuesta = leer.nextInt();
            menuCafetera(cs, vectorCafetera[respuesta - 1], respuesta);
            System.out.flush();
            System.out.println("Quiere seguir operando con la cafetera digital (s/n)");
            operar = leer.next();
        } while (!operar.equalsIgnoreCase("n"));

    }

    public static void menuCafetera(CafeteraServicios_Test cs, Cafetera_Test Cafe, int numCafe) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("MENU");
            cs.verCantidad(Cafe, numCafe);
            System.out.println("-----------------------");
            System.out.println("Opcion1: Llenar cafetera.");
            System.out.println("Opcion2: Servir taza.");
            System.out.println("Opcion3: Vaciar cafetera.");
            System.out.println("Opcion4: Agregar cafe.");
            System.out.println("Opcion5: Salir");
            System.out.println("-----------------------");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cs.llenarCafetera(Cafe);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de cafe a llenar en la taza");
                    cs.servirTaza(Cafe, leer.nextInt());
                    break;
                case 3:
                    cs.vaciarCafetera(Cafe);
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de cafe:");
                    cs.agregarCafe(Cafe, leer.nextInt());
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
                    break;
            }
        } while (opcion != 5);

    }


}
