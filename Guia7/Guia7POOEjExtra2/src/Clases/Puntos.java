/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class Puntos {
    
    public int x1;
    public int y1;
    public int x2;
    public int y2;

    public Puntos() {
    }
  
    
    public void cergarPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese x1:");
        x1 = leer.nextInt();
        System.out.println("Ingrese y1:");
        y1 = leer.nextInt();
        System.out.println("Ingrese x2:");
        x2 = leer.nextInt();
        System.out.println("Ingrese y2:");
        y2 = leer.nextInt();
    }
    
    public double calcularDistancia(){
        double dist;
        dist = sqrt(Math.pow(x1,2))
    }
    
}
