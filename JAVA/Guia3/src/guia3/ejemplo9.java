/*
Ejercicio 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class ejemplo9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner ingrese = new Scanner(System.in);
    
    int num;
    int suma = 0;
    int cont = 0;
    
    
    do {
        System.out.println("Escriba un numero");
        num = ingrese.nextInt();
        
        if  (num == 0) {
            System.out.println("Se capturo el numero 0");
           break;
        }
        if (num > 0){
            suma += num;
        }
        cont++;        
    }   while (cont<20);
        System.out.println("La suma es :" + suma);
    }
    
   

    }
    

