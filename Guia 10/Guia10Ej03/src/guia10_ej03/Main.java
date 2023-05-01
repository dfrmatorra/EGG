/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_ej03;

import Entities.Alumno;
import Services.AlumnoService;
import java.util.ArrayList;

/**
 *
 * @author DarioF
 */
public class Main {

    public static void main(String[] args) {

    AlumnoService aSer = new AlumnoService();
    ArrayList <Alumno> listaAlumnos = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
         listaAlumnos.add(aSer.crearAlumno()) ;
        }

        aSer.mostrarAlumnos(listaAlumnos);

        String alumnoSelect = aSer.buscarAlumno(listaAlumnos);

        double prom = aSer.notaFinal(listaAlumnos, alumnoSelect);
        if (prom>0){
            System.out.printf("El promedio final de " + alumnoSelect + " es: %.2f", prom );
        }
    }
}

