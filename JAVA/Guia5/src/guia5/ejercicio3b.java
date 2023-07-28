/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class ejercicio3b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingrese tamano del vector");

        int num = leer.nextInt();

        int vector[] = new int[num];
        int vectorAux[] = new int[num];
        int[] cant = new int[num];
        int[] digitos = new int[5];

        int cont = 0;

        for (int i = 0; i < num; i++) {
            vector[i] = random.nextInt(10000);

        }
        for (int i = 0; i < num; i++) {
            vectorAux[i] = vector[i];
            do {

                cont++;
                vectorAux[i] = (vectorAux[i] / 10);
            } while (vectorAux[i] / 10 != 0);

            cant[i] = cont + 1;
            cont = 0;
        }
        for (int i = 0; i < num; i++) {
            System.out.print(cant[i] + " / ");
        }
        System.out.println("");
        for (int i = 0; i < num; i++) {

            System.out.print(vector[i] + " / ");

        }
        System.out.println("");

        for (int i = 0; i < num; i++) {
            switch (cant[i]) {
                case 1:
                    digitos[0]++;
                    break;
                case 2:
                    digitos[1]++;
                    break;
                case 3:
                    digitos[2]++;
                    break;
                case 4:
                    digitos[3]++;
                    break;
                case 5:
                    digitos[4]++;
                    break;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(digitos[i] + " tienen " + (i + 1) + " digitos");
        }
    }
}
