/*
Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
 */
package guia5;

import java.util.Random;
import java.util.Scanner;

/**
 * @author DarioF
 */
public class ejercicioExtra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidadAlumnos = 10;
        int cantidadNotas = 4;

        double vectorPonderacion[] = new double[cantidadNotas];

        vectorPonderacion[0] = 0.10;
        vectorPonderacion[1] = 0.15;
        vectorPonderacion[2] = 0.25;
        vectorPonderacion[3] = 0.50;

        double matriz[][] = new double[cantidadAlumnos][cantidadNotas];

        llenarMatriz(matriz, vectorPonderacion, cantidadAlumnos, cantidadNotas);

        double vectorPromedio[] = new double[cantidadAlumnos];

        llenarPromedio(vectorPromedio, matriz, cantidadAlumnos, cantidadNotas);

        int cantAprob = 0;
        int cantNoaprob = 0;
        for (int i = 0; i < cantidadAlumnos; i++) {
            if (vectorPromedio[i] >= 7) {
                cantAprob++;
            } else {
                cantNoaprob++;
            }
        }
        System.out.println("La cantidad de alumnos que aprobaron son: " + cantAprob);
        System.out.println("La cantidad de alumnos que NO aprobaron son: " + cantNoaprob);

    }

    /*-----------------------------------------------------------------*/
    public static void llenarMatriz(double matriz[][], double vectorPonderacion[], int cantidadAlumnos, int cantidadNotas) {
//        Random azar = new Random();
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < cantidadAlumnos; i++) {
            double nota = 0;
            for (int j = 0; j < cantidadNotas; j++) {
                do {
                    System.out.println("Ingrese la nota " + (j + 1) + " del alumno " + (i + 1) + ":");
                    nota = leer.nextDouble();
//                    nota = azar.nextInt(10);//random agragado para probar con notas aleatorias de 1 a 9

                    matriz[i][j] = nota * vectorPonderacion[j];
                } while (nota<0 || nota > 10);
            }
        }
    }

    public static void llenarPromedio(double vectorPromedio[], double matriz[][], int cantidadAlumnos, int cantidadNotas) {
        Scanner leer = new Scanner(System.in);
        double sumaNotas;
        for (int i = 0; i < cantidadAlumnos; i++) {
            sumaNotas = 0;
            for (int j = 0; j < cantidadNotas; j++) {
                sumaNotas += matriz[i][j];
            }
            vectorPromedio[i] = sumaNotas;
        }
    }
}
