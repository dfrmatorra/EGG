/*
Realizar un programa que complete un vector con los N primeros
números de la sucesión de Fibonacci. Recordar que la sucesión de
Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a
él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente
fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una
función que reciba como parámetro el valor de “n” y que calcule la serie
hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente
link: https://quantdare.com/numeros-de-fibonacci/
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class ejercicioExtra7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros Fibonacci:");
        int num = leer.nextInt();

        System.out.println("------------------------------");
        int a = 0;
        int b = 1;
        int c = 0;

        System.out.println(b);

        for (int i = 0; i < num; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
//dos formas para aleatorio del 0 al 100
//        Random aleatorio = new Random();
//        int num1 = aleatorio.nextInt(100);
//        int num2 = (int)(Math.random()*100);
//        System.out.println("Random:" + num1);
//        System.out.println("Math.ramdom: " + num2);
