/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Estudiante;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DarioF
 */
public class EstudianteService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Random random = new Random();

    public Estudiante crearEstudiante() {
        System.out.println("Ingrese nombre de estudiante:");
        String nombre = leer.next();
        float nota = Math.round(random.nextFloat() * 100.00f) / 10.f;
        System.out.println("La nota de " + nombre + " es " + nota);
        return new Estudiante(nombre, nota);
    }

    public Estudiante[] crearCurso() {
        Estudiante[] estVector = new Estudiante[8];
        for (int i = 0; i < 8; i++) {
            estVector[i] = crearEstudiante();
        }
        return estVector;
    }

    public float calcularMostrar(Estudiante curso[]) {
        float acum = 0;
        for (Estudiante curso1 : curso) {
            acum = acum + curso1.getNota();
        }
        float prom = acum / 8;
        System.out.println("El promedio del curso es: " + prom);
        return prom;
    }

    public Estudiante[] aprobados(Estudiante estVector[], float prom) {
        int cont = 0;
        for (int i = 0; i < estVector.length; i++) {
            if (estVector[i].getNota() >= prom) {
                cont++;
            }
        }
        Estudiante[] estAp = new Estudiante[cont];
        int j = 0;
        for (int i = 0; i < estVector.length; i++) {
            if (estVector[i].getNota() >= prom) {

                Estudiante estudiante = new Estudiante(estVector[i].getNombre(), estVector[i].getNota());
                estAp[j] = estudiante;
                j++;
            }
        }
        return estAp;
    }

    public void mostrar(Estudiante[] estAp) {
        System.out.println("Los estudiantes con nota mayor al promedio son:");
        for (Estudiante estAp1 : estAp) {
            System.out.println(estAp1.getNombre() + "/" + estAp1.getNota());
        }
        
    }

}
