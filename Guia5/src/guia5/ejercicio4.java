package guia5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;

/**
 *
 * @author Ale
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];
        String aux = "";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        for (int[] fila : matriz) {
            aux = "";
            for (int elemento : fila) {
                aux += " " + elemento;

            }

            System.out.println(aux);
        }

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        for (int[] fila : matriz) {
            aux = "";
            for (int elemento : fila) {
                aux += " " + elemento;

            }

            System.out.println(aux);

        }

    }
}