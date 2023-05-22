/*
Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo 
(espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo.
 */
package Entities;

/**
 *
 * @author dudum
 */
public class Carta {

    private int numero;
    private int palo;
    private boolean repartida;
    
    
    public Carta() {
    }

    public Carta(int numero, int palo, boolean repartida) {
        this.numero = numero;
        this.palo = palo;
        this.repartida = repartida;
    }

    public boolean getRepartida() {
        return repartida;
    }

    public void setRepartida(boolean repartida) {
        this.repartida = repartida;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPalo() {
        return palo;
    }

    public void setPalo(int palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {

        String paloCarta="";

        switch (palo) {
            case 1:
                paloCarta = "Espadas";
                break;
            case 2:
                paloCarta = "Bastos";
                break;
            case 3:
                paloCarta = "Oro";
                break;
            case 4:
                paloCarta = "Copas";
                break;
        }
        return "Carta: " + numero + " de " + paloCarta;
    }
    
    

}
