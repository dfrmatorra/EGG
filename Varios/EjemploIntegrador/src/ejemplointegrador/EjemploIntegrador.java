/*
Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
van a ser nombre y nota (representando la nota obtenida en el final).
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un
arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
dos tareas que nos ha pedido la escuela.
1. Calcular y mostrar el promedio de notas de todo el curso
2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso
3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.
 */
package ejemplointegrador;

import Entidades.Estudiante;
import Servicios.EstudianteService;
import java.util.Arrays;

/**
 *
 * @author DarioF
 */
public class EjemploIntegrador {

    public static void main(String[] args) {

        EstudianteService est = new EstudianteService();

        Estudiante[] cursoCompleto = est.crearCurso();
//        System.out.println(Arrays.toString(cursoCompleto));
        float prom = est.calcularMostrar(cursoCompleto);
        System.out.println(prom);
        est.mostrar(est.aprobados(cursoCompleto, prom));

    }

}
