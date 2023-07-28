/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;


public class ejercicioExtra3c {
    
    public static void main(String[] args) {
   int[] vector = new int[10];
        fillRandom(vector);
        System.out.println("El vector es "); 
        printVector(vector);
    }

    public static void fillRandom(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    public static void printVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}