/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *
 * @author CASA
 */


import java.util.Random;
import java.util.Scanner;


public class ejericicioExtra6b{

    
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
               
        String[] palabras = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese una palabra de 3 a 5 caracteres: ");
            palabras[i] = input.nextLine();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.print("Error. Ingrese una palabra de 3 a 5 caracteres: ");
                palabras[i] = input.nextLine();
            }
        }
               
        char[][] sopa = new char[20][20];
        Random rand = new Random();
        int fila = rand.nextInt(20);
        int columna = rand.nextInt(16);
        int palabraSeleccionada = rand.nextInt(5);
        String palabra = palabras[palabraSeleccionada];
        for (int i = 0; i < palabra.length(); i++) {
            sopa[fila][columna+i] = palabra.charAt(i);
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == 0) {
                    sopa[i][j] = (char) (rand.nextInt(10) + '0');
                }
            }
        }
                
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}