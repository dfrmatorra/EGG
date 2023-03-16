/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class ejericio8 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidad;
        
        System.out.println("Ingrese la cantidad de * para cada lado");
        cantidad = leer.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
                 if (i==0 || i==cantidad-1){
                     for (int j = 0; j < cantidad; j++)
                     System.out.print(" * ");
                 }    
                 else
                 {
                     for (int k = 0; k < cantidad; k++)
                     {
                        if (k==0 || k==cantidad-1){
                        System.out.print(" * ");
                        
                        }
                        else{
                                System.out.print("   ");
                                }
                     }
                        
                                      }
                 System.out.println(" ");
        }  
                 
                 }   
        }

    
    

