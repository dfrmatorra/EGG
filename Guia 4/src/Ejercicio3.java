
import java.util.Scanner;

/*
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 */

/**
 *
 * @author Dario
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        String moneda = "";
        float euro = 0;
        System.out.println("Ingrese la cantidad de Euros a convertir");
        euro = ingrese.nextFloat();
        do {

            System.out.println("A que moneda desea convertir?(libras/yenes/dolares)");
            moneda = ingrese.next();

        } while (!moneda.equalsIgnoreCase("yenes") && !moneda.equalsIgnoreCase("libras") && !moneda.equalsIgnoreCase("dolares"));

        cambio(euro, moneda);
    }

    public static void cambio(float euro, String moneda) {
        double cambio;

        switch (moneda) {
            case "libras":
                cambio = euro * 0.86;
                System.out.println("Equivale a: " + cambio + " libras");
                break;
            case "yenes":
                cambio = euro * 129.852;
                System.out.println("Equivale a: " + cambio + " yenes");
                break;
            case "dolares":
                cambio = euro * 1.28611;
                System.out.println("Equivale a: " + cambio + " dolares");
                break;

        }
    }
}