/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package guia3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class ejercicioExtra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DecimalFormat formato1 = new DecimalFormat("#.00");

        int contadorPeti = 0;
        int contadorTotal = 0;
        float altura, totalPeti, total, resultadoPeti, resultadoFinal;
        String respuesta = "";
        totalPeti = 0;
        total = 0;
        do {
            System.out.println("Ingrese la altura con coma y dos decimales");
            altura = leer.nextFloat();


            if (altura < 1.60) {
                contadorPeti++;
                totalPeti = totalPeti + altura;

            }
            total = total + altura;
            contadorTotal++;
            System.out.println("Quiere seguir ingresando alturas (si/no)");
            respuesta = leer.next();
        } while (!respuesta.equalsIgnoreCase("no") && !respuesta.equalsIgnoreCase("n"));

        resultadoPeti = (totalPeti / contadorPeti);
        resultadoFinal = (total / contadorTotal);

        System.out.println("El promedio de altura menor a 1.60 es:" + formato1.format(resultadoPeti));
        System.out.println("El promedio de altura total es:" + formato1.format(resultadoFinal));

    }

}
