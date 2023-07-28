/*
Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.

Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales.
 */
package guia8ej3;

import Entidades.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author DarioF
 */
public class Guia8Ej3 {

    public static void main(String[] args) {

        PersonaServicio ps = new PersonaServicio();

        //crear personas
        Persona p1 = ps.crearPersona(1);
        Persona p2 = ps.crearPersona(2);
        Persona p3 = ps.crearPersona(3);
        Persona p4 = ps.crearPersona(4);

        //calcular IMC
        int imc[] = new int[4];
        imc[0] = ps.calcularIMC(p1.getPeso(), p1.getAltura());//buscar con un FOR mejorado
        imc[1] = ps.calcularIMC(p2.getPeso(), p2.getAltura());
        imc[2] = ps.calcularIMC(p3.getPeso(), p3.getAltura());
        imc[3] = ps.calcularIMC(p4.getPeso(), p4.getAltura());
        int debajo=0;
        int ideal=0;
        int encima=0;
        for (int i = 0; i < 4; i++) {
            if (imc[i] == -1) {
                debajo++;
            }
            if (imc[i] == 0) {
                ideal++;
            }
            if (imc[i] == 1) {
                encima++;
            }
        }
        
        //calcular mayor de edad
        boolean mayor[] = new boolean[4];
        mayor[0] = ps.esMayor(p1.getEdad());//buscar con un FOR mejorado
        mayor[1] = ps.esMayor(p2.getEdad());
        mayor[2] = ps.esMayor(p3.getEdad());
        mayor[3] = ps.esMayor(p4.getEdad());
        int mayores = 0;
        int menores = 0;
        for (int i = 0; i < 4; i++) {
            if (mayor[i] == true) {
                mayores++;
            }
            if (mayor[i] == false) {
                menores++;
            }
        }

        //mostrar personas e info gral
        System.out.println("---PERSONAS---");
        System.out.println("PERSONA 1" + p1.toString());
        System.out.println("PERSONA 2" + p2.toString());
        System.out.println("PERSONA 3" + p3.toString());
        System.out.println("PERSONA 4" + p4.toString());

        System.out.println("---CANTIDAD DE MAYORES/MENORES DE EDAD---");
        System.out.println("MAYORES:" + mayores);
        System.out.println("MENORES:" + menores);
        
        System.out.println("---CANTIDAD DE PERSONAS DEBAJO, IDEAL Y ENCIMA DEL IMC---");
        System.out.println("DEBAJO:" + debajo);
        System.out.println("IDEAL:" + ideal);
        System.out.println("ENCIMA:" + encima);
        
        
    }

}
