/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class ejercicio6c {
  
public static void main(String[] args) {

int[][] matriz = new int[3][3];

llenarMatriz(matriz);
sumarMatriz(matriz);
}
public static void llenarMatriz(int[][] matriz) {

Scanner leer = new Scanner(System.in);
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {

System.out.print("Introducir valor entre 1 y 9 para matriz[" + i + "][" + j + "]: ");
matriz[i][j] = leer.nextInt();

while (matriz[i][j] < 1 || matriz[i][j] > 9) {
System.out.print("Se debe de ingresar un valor entre 1 y 9.\nIntroducir valor nuevamente: ");
matriz[i][j] = leer.nextInt();
}
}
}
}

public static void sumarMatriz(int[][] matriz) {

int filas = 0;
int colum = 0;
for (int i = 0; i < 3; i++) {
filas = 0;
colum = 0;

for (int j = 0; j < 3; j++) {
filas += matriz[i][j];
colum += matriz[j][i];
}
if (filas !=  colum ) {
mostrarMatriz(matriz);
System.out.println("La matriz no es mágica.");
return;
}
}

int diag1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
int diag2 = matriz[0][2] + matriz[1][1] + matriz[2][0];

if (diag1 != diag2 ) {
mostrarMatriz(matriz);
System.out.println("La matriz no es mágica.");
return;
}
mostrarMatriz(matriz);
System.out.println("La matriz es mágica.");
System.out.println("Sumas: " + diag1 + ", " + diag2 + ", " + filas + ", " + colum + ".");
}

public static void mostrarMatriz(int[][] matriz) {

for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {

System.out.print("[" + matriz[i][j] + "]");
}
System.out.println("");
}
}

}