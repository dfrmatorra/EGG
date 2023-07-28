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
         
       Scanner leer = new Scanner(System.in);
        String palabra = "";
        boolean ref1;
        String[][] sopa = new String[20][20];
        int[] posicionH1 = new int[5];
        int[] posicionV1 = new int[5];
        int a=5;
        inicializoVector(posicionH1, a);
        inicializoVector(posicionV1, a);
        
        inicializoSopa(sopa);

        for (int i = 0; i < 5; i++) {
            ref1 = true;
            do {
                if (ref1) {
                    System.out.println("Ingrese una palabra Nro " + (i + 1));
                } else {
                    System.out.println("vuelva ingresar la palabra Nro " + (i + 1));
                }

                palabra = leer.next();
                ref1 = false;
            } while ((palabra.length() < 3) || (palabra.length() > 5));
            ingresoASopa(sopa, palabra, posicionH1, posicionV1);
        }
       
        rellenoVacios(sopa);
        imprimoSopa(sopa);

    }

    public static void ingresoASopa(String[][] sopa, String palabra, int[] posicionH1, int[] posicionV1){

        int posicionH = buscoPosicionH(posicionH1);
        int posicionV = buscoPosicionV(posicionV1, palabra);

        int largo = palabra.length();

        for (int i = 0; i < largo; i++) {
            sopa[posicionH][posicionV + i] = palabra.toLowerCase().substring(i, i + 1);
        }

    }

    public static int buscoPosicionH(int[] posicionH1) {

        Random random = new Random();
        
        boolean ref2 = false;
        int pos;

        do {

            pos = random.nextInt(20);

            for (int i = 0; i < 5; i++) {
               
                if (posicionH1[i] == 100 ) {
                    posicionH1[i] = pos;
                    ref2 = false;
                    break;
                } else {
                    if (posicionH1[i]==pos) {
                        ref2 = true;
                        break;
                    }
                    
                }
            }
        } while (ref2);

        return pos;

    }

    public static int buscoPosicionV(int[] posicionV1, String palabra) {

        Random random = new Random();
        
       
        int pos;
        int rand=(20-palabra.length());
      
            pos = random.nextInt(rand);

        return pos;
    }

    public static void imprimoSopa(String[][] sopa) {

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void rellenoVacios(String[][] sopa) {

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j].equals("0")) {
                    int relleno = random.nextInt(9);
                    String numCadena = Integer.toString(relleno);
                    sopa[i][j] = numCadena;
                }
            }
        }
    }
    public static void inicializoSopa(String[][] sopa){
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j]="0";
            }
        }
        
        
    }

    public static void inicializoVector(int[] vector,int a){
        
        for (int i = 0; i < a; i++) {
            vector[i]=100;
        }
    }
}