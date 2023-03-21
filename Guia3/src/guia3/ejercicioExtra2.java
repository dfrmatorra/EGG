/*
*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
*diferente a cada una. A continuación, realizar las instrucciones
*necesarias para que: B tome el valor de C, C tome el valor de A, A tome
*el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
*valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class ejercicioExtra2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int A,B,C,D,AUX;
        AUX = 0;
        
        System.out.println("Ingrese el valor inicial de A:");
        A = leer.nextInt();
        System.out.println("Ingrese el valor inicial de B:");
        B = leer.nextInt();
        System.out.println("Ingrese el valor inicial de c:");
        C = leer.nextInt();
        System.out.println("Ingrese el valor inicial de d:");
        D = leer.nextInt();
        
        
        System.out.println("Los valores iniciales son");
        System.out.println("A= " + A + ", B= " + B + ", C= " + C + ", D= " + D);
        
    /*  BC
        CA        
        AD
        DB
    */ 
        
        AUX = B;
        B = C;
        C = A;
        A = D;
        D = AUX;
        
           
        System.out.println("-------------------------");
        System.out.println("Los valores iniciales son");
        System.out.println("A= " + A + ", B= " + B + ", C= " + C + ", D= " + D);
        
        
    }
}
