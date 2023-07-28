package guia13ej5;

import java.util.Random;
import java.util.Scanner;

/*Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
/**
 *
 * @author DarioF
 */
public class Guia13Ej5 {

    public static void main(String[] args) throws OwnException {

        adivinarNumero(crearNumeroAleatorio());

    }

    private static int crearNumeroAleatorio() {
        Integer numAleatorio;
        Random random = new Random();
        numAleatorio = random.nextInt(500);
        System.out.println(numAleatorio);
        return numAleatorio;

    }

    private static void adivinarNumero(int numAleatorio) throws OwnException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean cond = true;

//        System.out.println("Ingrese Prueba");
//        int prueba=leer.nextInt();
        System.out.println("Adivinar numero entre 1 y 500");
        Integer num;

        int cont = 0;
        do {
            System.out.println("INTENTOS: " + cont);
            System.out.println("Ingrese el numero:");

            try {
                num = Integer.valueOf(leer.next());

//                num = num / prueba;
            } catch (NumberFormatException e) {
                System.out.println("Ingreso incorrecto");
                System.out.println("--Numeros entre 1 y 500--");
                cont++;
                continue;
            }
//            catch (ArithmeticException a){
            try {
                throw new OwnException(num, "Ingreso incorrecto");
            } catch (OwnException a) {
                System.out.println(a.getMensaje());
                System.out.println(a.generarRespuesta());
                System.out.println("Prueba");
                System.out.println(a.fillInStackTrace());
                cont++;
                continue;
            }

            if (num == numAleatorio) {
                System.out.println("Adivinaste!!");
                cont++;
                System.out.println("Lo hiciste con " + cont + " intentos.");
                cond = false;
            } else if (num > numAleatorio) {
                System.out.println("El numero ingresado es mayor a la incognita.");
            } else if (num < numAleatorio) {
                System.out.println("El numero ingresado es menora la incognita.");
            }
            cont++;

        } while (cond);
    }

}
