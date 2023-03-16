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
        double min, hora, horaAux, dia, diaAux, minFinal;
        
        System.out.println("Ingrese la cantidad de minutos a calcular:");
        min = leer.nextInt();
        
        minFinal = min%60;
        
        horaAux = min/60;
        
        diaAux = horaAux/24;
        
        dia = (horaAux/24) - (horaAux%24);

        hora = min/60;
        
        
       
        
        
        
        System.out.println("Equivale a:" + dia + " dia/s, " + hora + " hora/s, " + minFinal + " minutos." );

        
        
              
       
        
                
        
        
    }
    
}
