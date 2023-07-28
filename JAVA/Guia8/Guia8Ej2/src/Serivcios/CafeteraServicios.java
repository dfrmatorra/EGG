/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete
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

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author DarioF
 */
public class CafeteraServicios {

    Scanner leer = new Scanner(System.in);

    Cafetera c1 = new Cafetera();
    
    public Cafetera crearCafetera(){
        System.out.println("Ingrese la capacidad maxima de la cafetera:");
        int capacidadMax = leer.nextInt();
        System.out.println("Ingrese la cantidad actual de la cafetera:");
        int cantidadAct = leer.nextInt();
        return new Cafetera(capacidadMax, cantidadAct); 
    }
    
    public void setearCafetera(int set){
        c1.setCapacidadMaxima(set);
    }

    public void llenarCafetera() {
        c1.setCantidadActual(c1.getCapacidadMaxima());
        System.out.println("La cafetera se lleno");
    }

    public void servirTaza(int taza) {
        if (c1.getCantidadActual() == 0) {
            System.out.println("La cafetera esta vacia");
        } else if (taza > c1.getCantidadActual()) {
            taza = c1.getCantidadActual();
            System.out.println("La cafetera esta vacia. La taza tiene" + c1.getCantidadActual());
            c1.setCantidadActual(0);
        } else {
            c1.setCantidadActual(c1.getCantidadActual() - taza);
            System.out.println("La taza se lleno");
        }

    }

    public void vaciarCafetera() {
        c1.setCantidadActual(0);
        System.out.println("La cafetera se vacio");
    }
    
    public void agregarCafe(int cantidad){
        if ((c1.getCantidadActual()+cantidad)<=c1.getCapacidadMaxima()){
            c1.setCantidadActual(c1.getCantidadActual() + cantidad);  
        }else {
            System.out.println("La cantidad que quiere agregar supera la cantidad maxima");
            c1.setCantidadActual(c1.getCapacidadMaxima());
        }
        
        
        
    }
    
    public void verCantidad(){
        System.out.println("    " + c1.getCantidadActual() + "/" + c1.getCapacidadMaxima());
    }
}
