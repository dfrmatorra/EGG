/*
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
3) Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
 */
package Servicios;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author CASA
 */
public class ArregloService {

    public void inicializarA(double Array[]) {
        Random random = new Random();
        for (int i = 0; i < Array.length; i++) {
            double rango = 10; // Este es el rango de valores que abarca tanto los números positivos como los negativos
            double resultado = (random.nextDouble() * rango * 2 - rango);
            int resultado1 = (int) resultado*100;
            double m = resultado1 / 10;
            Array[i]= m;
         
        }
    }

    public void mostrar(double Array[]) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(" (" + Array[i] + ") ");
        }
    }

    public void ordenar(double A[]) {
        Arrays.sort(A);

    }

    public void inicializarB(double A[], double B[]) {
        System.arraycopy(A, 0, B, 0, 10);
        Arrays.fill(B, 10, 20, 0.5);
    }
}
