
import java.util.Scanner;

/*
Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
 */

/**
 *
 * @author CASA
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
       
        
        System.out.println("Ingrese un numero para verificar si es primo");
        int num = ingrese.nextInt();
        
        
        
        if (primo(num) == true) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }
    
    public static boolean primo(int num) {
        int cont = 0;
        boolean primo = false;
        for (int i = 1; i <= num; i++) {
            if (num%i == 0) {
                cont++;
            }
            if (cont > 2) {
                break;
            }
        }
        if (cont == 2) {
            primo = true;
        }
        return primo;
    }
}