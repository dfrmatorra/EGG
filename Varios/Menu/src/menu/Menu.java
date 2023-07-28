package menu;

import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class Menu {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        do {
            System.out.println("MENU");
            System.out.println("--------");
            System.out.println("1.- ");
            System.out.println("2.- ");
            System.out.println("3.- ");
            System.out.println("4.- ");
            System.out.println("5.- ");
            System.out.println("6.- ");
            System.out.println("7.- ");
            System.out.println("8.- ");
            System.out.println("9.- Salir");

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("");

                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("");
                    break;
                case 8:
                    System.out.println("");
                    break;
                case 9:
                    opc=9;
                    break;
            }
        } while (opc != 9);
    }
}
