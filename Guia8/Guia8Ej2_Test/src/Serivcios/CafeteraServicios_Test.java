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
package Serivcios;

import Entidades.Cafetera_Test;
import java.util.Scanner;

/**
 *
 * @author DarioF
 */
public class CafeteraServicios_Test {

    Scanner leer = new Scanner(System.in);

    public Cafetera_Test crearCafetera(int num) {
        System.out.println("Ingrese la capacidad maxima de la cafetera " + num + ":");
        int capacidadMax = leer.nextInt();
        System.out.println("Ingrese la cantidad actual de la cafetera " + num + ":");
        int cantidadAct = leer.nextInt();
        return new Cafetera_Test(capacidadMax, cantidadAct);
    }

//    public void setearCafetera(int set) {
//        cs.setCapacidadMaxima(set);
//    }

    public void llenarCafetera(Cafetera_Test cs) {
        cs.setCantidadActual(cs.getCapacidadMaxima());
        System.out.println("La cafetera se lleno");
    }

    public void servirTaza(Cafetera_Test cs, int taza) {
        if (cs.getCantidadActual() == 0) {
            System.out.println("La cafetera esta vacia");
        } else if (taza > cs.getCantidadActual()) {
            taza = cs.getCantidadActual();
            System.out.println("La cafetera esta vacia. La taza tiene " + cs.getCantidadActual());
            cs.setCantidadActual(0);
        } else {
            cs.setCantidadActual(cs.getCantidadActual() - taza);
            System.out.println("La taza se lleno");
        }

    }

    public void vaciarCafetera(Cafetera_Test cs) {
        cs.setCantidadActual(0);
        System.out.println("La cafetera se vacio");
    }

    public void agregarCafe(Cafetera_Test cs, int cantidad) {
        if ((cs.getCantidadActual() + cantidad) <= cs.getCapacidadMaxima()) {
            cs.setCantidadActual(cs.getCantidadActual() + cantidad);
        } else {
            System.out.println("La cantidad que quiere agregar supera la cantidad maxima");
            cs.setCantidadActual(cs.getCapacidadMaxima());
        }
    }

    public void verCantidad(Cafetera_Test cs, int numCaf) {
        System.out.println("CAFETERA " + numCaf + "    " +  cs.getCantidadActual() + "/" + cs.getCapacidadMaxima());
    }
}
