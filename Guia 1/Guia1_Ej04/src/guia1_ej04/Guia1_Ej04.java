/*
Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */
package guia1_ej04;

import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class Guia1_Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tempCent;
        //52.3double tempFar;
        double convCentFar;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar Temperatura");
        tempCent = leer.nextDouble();
        convCentFar = 32 + (9 * tempCent / 5);
        System.out.println("La temperatura en grados Fahrenheit es = " + convCentFar + "°F");
    }
    
}
