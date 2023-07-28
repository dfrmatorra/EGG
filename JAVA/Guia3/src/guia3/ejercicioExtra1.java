/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class ejercicioExtra1 {

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        double min, hora, horaFinal, dia, diaFinal, diaAux, minFinal;
        
        System.out.println("Ingrese la cantidad de minutos a calcular:");
        min = leer.nextInt();
        dia=0;
        
        minFinal = min%60;
        
        min = min - minFinal;
        
        horaFinal = (min/60)%24;
        
        hora = (min/60) - horaFinal;

        
        diaFinal = hora/24;
        
        
                
         
        System.out.println("Equivale a " + diaFinal + " dia/s , " + horaFinal + " hora/s y " + minFinal + " minutos." );
         }
    
}
