/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Alumno;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author DarioF
 */
public class AlumnoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Alumno crearAlumno(){
        System.out.println("Ingrese el nombre del Alumno");
        String alumno = leer.next();
        ArrayList<Double> notas = crearNotas();
        return new Alumno(alumno, notas);
    }
    private ArrayList<Double> crearNotas(){
        ArrayList<Double> notas = new ArrayList();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota Nro " + (i + 1));
            notas.add(leer.nextDouble());
        }
        return notas;
    }
    public void mostrarAlumnos(ArrayList<Alumno> listaAlumnos){
        
//        for (Alumno alumno : listaAlumnos) {
//            for (Double notas : alumno.getNotas() ) {
//                System.out.print(notas +" / ");
//            }
//                System.out.println("");
//
//            }
        System.out.println(listaAlumnos.toString());
            }

    public String buscarAlumno(ArrayList<Alumno> list){
        String respuesta = "";
        System.out.println("Ingrese el nombre del alumno a buscar para obtener el promedio final:");
        String nombre = leer.next();
        for (Alumno alumno : list) {
            if (nombre.equals(alumno.getNombre())){
                respuesta = nombre;
            }
        }
      return respuesta;
    }
    
    public double notaFinal(ArrayList<Alumno> listaAlumno, String nombre){
        double prom = 0;
        double sumaNotas = 0;
        boolean alumnoEncontrado = false;
        for (Alumno alumno : listaAlumno) {
            if (nombre.equals(alumno.getNombre())) {
                alumnoEncontrado = true;
                for (Double notas : alumno.getNotas()) {
                    sumaNotas += notas;
                }
                prom= sumaNotas/alumno.getNotas().size();
                break;
            }
        }
        if (!alumnoEncontrado) {
            System.out.println("El Alumno no existe");
        }

        return prom;
        }
        

    
    
    
}
        
        
   
    
    

