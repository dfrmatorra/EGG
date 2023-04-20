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

    public void inicializar(double Array[]) {
        Random random = new Random();
        for (int i = 0; i < Array.length; i++) {
            double rango = 10; // Este es el rango de valores que abarca tanto los números positivos como los negativos
            Array[i] = (random.nextDouble() * rango * 2 - rango);
        }
    }

    public void mostrar(Integer Array[]) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(" (" + Array[i] + ") ");
        }
    }

    public void ordenar(Integer Array[]) {
       Array.sort;
    }

}
