/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package guia11_ej03;

import Entities.Carta;
import Services.CartaService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Guia11_Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Carta carta = new Carta();
        CartaService cs = new CartaService();
        ArrayList<Carta> maso = new ArrayList();

        int opc;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                maso.add(cs.crearBaraja(i, j));
            }
        }

        do {
            System.out.println("MENU");
            System.out.println("--------");
            System.out.println("1.- Barajar");
            System.out.println("2.- Cartas Disponibles");
            System.out.println("3.- Dar Cartas");
            System.out.println("4.- Cartas que ya Salieron");
            System.out.println("5.- Mostrar Baraja");
            System.out.println("6.- Salir");

            opc = leer.nextInt();

            switch (opc) {
                
                case 1:
                    cs.barajar(maso);
                    break;
                case 2:
                    cs.cartasDisponibles(maso);
                    break;
                case 3:
                    cs.darCartas(maso);
                    break;
                case 4:
                    cs.cartasQueYaSalieron(maso);
                    break;
                case 5:
                    cs.mostrarBaraja(maso);
            }

        } while (opc != 6);

    }

}
