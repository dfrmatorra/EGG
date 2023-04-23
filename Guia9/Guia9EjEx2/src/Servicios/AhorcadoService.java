/*
-Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra 
en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
-Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
-Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la 
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
-Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras 
han sido encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false 
si la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
-Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
-Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará 
cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.

 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class AhorcadoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra:");
        String palabra = leer.next();
        System.out.println("Ingrese la cantidad de jugadas maximas");
        int jugadasMax = leer.nextInt();
        char[] palabraVector = palabra.toCharArray();
        int longitud = palabra.length();
        return new Ahorcado(palabraVector, jugadasMax, longitud);
    }
    //-Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.

    public void longitud(Ahorcado aho1) {
        System.out.println("Longitud de la palabra: " + aho1.getLongitud());
    }

    //-Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es 
    //parte de la palabra o no. También informará si la letra estaba o no.
    public void buscar(Ahorcado aho1, char[] letras, int cont) {
        System.out.println("Ingrese una letra:");
        letras[cont] = leer.next().charAt(0);
        int encontrada = 0;
        if (letras[cont] == letras[cont - 1]) {
            encontrada = 1;
        } else {
            for (int i = 0; i < aho1.getLongitud(); i++) {
                char letra1 = aho1.getPalabra()[i];
                if (letras[cont] == letra1) {
                    encontrada = 2;
                    aho1.getPalabra()[i] = ' ';
                    aho1.setLetrasEncontradas(aho1.getLetrasEncontradas() + 1);
                }
            }
        }
        if (encontrada == 1) {
            System.out.println("La letra " + letras[cont] + " ya fue ingresada");
            aho1.setJugasdasMax(aho1.getJugasdasMax() - 1);
        }else if (encontrada == 2) {
            System.out.println("La letra " + letras[cont] + " pertenece a la palabra");
        }else if (encontrada == 0) {
                System.out.println("La letra " + letras[cont] + " no pertenece a la palabra");
                aho1.setJugasdasMax(aho1.getJugasdasMax() - 1);
            }
    }

    public void encontradas(Ahorcado aho1) {
        System.out.println("Letras encontradas: " + aho1.getLetrasEncontradas());
        System.out.println("Letras faltantes: " + (aho1.getLongitud() - aho1.getLetrasEncontradas()));
    }

    public void intentos(Ahorcado aho1) {
        System.out.println("Intentos remanentes: " + aho1.getJugasdasMax());
    }

    public void juego() {
        Ahorcado aho1 = crearJuego();
        char letras[] = new char[100];
        letras[0] = ' ';
        int cont = 0;
        do {
            longitud(aho1);
            cont++;
            buscar(aho1, letras, cont);
            encontradas(aho1);
            intentos(aho1);

        } while (aho1.getLetrasEncontradas() != aho1.getLongitud() && aho1.getJugasdasMax() != 0);

        if (aho1.getLetrasEncontradas() == aho1.getLongitud()) {
            System.out.println("Felicitaciones!! Ganaste!!");
        } else {
            System.out.println("Perdiste, suerte para la proxima.");
        }

    }
}
