/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Random;

/**
 *
 * @author CASA
 */
public class ejercicio3c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int [] vector = new int[10];
           Random random = new Random();
          int cont1 = 0;
          int cont2 = 0;
          int cont3 = 0;
          int cont4= 0;
          int cont5= 0;
           
            for (int i = 0; i < vector.length; i++) {    
            System.out.println(vector[i]=random.nextInt(10000));
            if (vector[i] <= 9){
            cont1++;          
            }else if (vector[i]>= 10 && vector[i] <= 99){
            cont2++;
            }else if (vector[i]>=100 && vector[i]<=999){
            cont3++;     
            }else if (vector[i]>=1000 && vector[i]<=9999){
            cont4++;    
            }else if (vector[i]>=10000 && vector[i]<=99999){
            cont5++;
            }        
        }
            System.out.println("los numeros de 1 digito son: "+cont1);
            System.out.println("los numeros de 2 digitos son: "+cont2);
            System.out.println("los numeros de 3 digitos son: "+cont3);
            System.out.println("los numeros de 4 digitos son: "+cont4);
            System.out.println("los numeros de 5 digitos son: "+cont5);
            
    }
    
}