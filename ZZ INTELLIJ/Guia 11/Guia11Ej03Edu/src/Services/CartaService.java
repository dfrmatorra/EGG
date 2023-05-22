/*
La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
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
package Services;

import Entities.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class CartaService {
    
    private int ultimaCartaR =0;
    

    Scanner leer = new Scanner(System.in);
    
    public Carta crearBaraja(int i, int j) {
        
        
        int palo = i+1;
        
        if (j>6){
            j=j+2;
        }
        int numero =j+1;
        boolean rep=false;
        
        return new Carta(numero, palo, rep);
    }

    public void mostrarBaraja(ArrayList<Carta> maso) {
        
        for (Carta carta : maso) {
            System.out.println(carta.toString());
        }
    }

    public void barajar(ArrayList<Carta> maso) {
        
        Collections.shuffle(maso);
        
    }
    
    
    public void cartasDisponibles(ArrayList<Carta> maso) {
       
        int cont=0;
        for (Carta carta : maso) {
            if (!carta.getRepartida()) {
                System.out.println(carta.toString());
                cont++;
            }
        }
        System.out.println("La cantidad de cartas Disponibles es de " + cont);
        
        
        
    }

    public void darCartas(ArrayList<Carta> maso) {
       
        System.out.println("Cuantas cartas quiere dar");
        int cartasDar = leer.nextInt();
        
        if ((40-ultimaCartaR)>=cartasDar){
            for (int i = 0; i < cartasDar; i++) {
                System.out.println(maso.get(i+ultimaCartaR).toString());
                maso.get(i+ultimaCartaR).setRepartida(true);
            }
            this.ultimaCartaR= ultimaCartaR+cartasDar;
        } else {
            System.out.println("No Alcnzan las carta para repartir");
        }
    }

    public void cartasQueYaSalieron(ArrayList<Carta> maso) {
        
        int cont=0;
        for (Carta carta : maso) {
            if (carta.getRepartida()) {
                System.out.println(carta);
                cont++;
            }
        }
        System.out.println("La cantidad de cartas Repartidas es de " + cont);
        
        
    }

    
    
}
