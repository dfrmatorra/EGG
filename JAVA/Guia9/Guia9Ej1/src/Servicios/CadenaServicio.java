/*
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac". 
c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
veces.
e) Método compararLongitud(String frase), deberá comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por
el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar
la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        System.out.println("Ingrese la frase:");
        String frase = leer.next();
        return new Cadena(frase);
    }

    public int mostrarVocales(Cadena cs) {
        String vocalVector[] = {"a", "e", "i", "o", "u"};
        String letra;
        String vocal;
        int contVocal = 0;
        for (int i = 0; i < cs.getLongitud(); i++) {
            for (int j = 0; j < 5; j++) {
                letra = cs.getFrase().substring(i, i + 1);
                vocal = vocalVector[j];
                if (vocal.equalsIgnoreCase(letra)) {
                    contVocal++;
                }
            }
        }
        return contVocal;
    }

    public void invertirFrase(Cadena cs) {
        String letra;
        for (int i = 0; i < cs.getLongitud(); i++) {
            System.out.print(cs.getFrase().substring(cs.getLongitud() - 1 - i, cs.getLongitud() - i));
        }
        System.out.println("");
    }

    public void vecesRepetido(Cadena cs, String letra) {
        int contLetra = 0;

        for (int i = 0; i < cs.getLongitud(); i++) {
            if (cs.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                contLetra++;
            }
        }
        System.out.println("La letra " + letra + " aparece " + contLetra + " veces.");
    }

    public void compararLongitud(Cadena cs, String frase2) {
        Integer longitud2 = frase2.length();
        Integer longitud = cs.getLongitud();
        int comparar = longitud.compareTo(longitud2);
        if (comparar == 0) {
            System.out.println("La frase tiene la misma longitud");
        } else if (comparar > 1) {
            System.out.println("La frase tiene una longitud mayor");
        } else {
            System.out.println("La frase tiene una longitud menor");

        }
    }

    public void unirFrases(Cadena cs, String frase2) {
        System.out.println(cs.getFrase().concat(frase2));
//        System.out.println(cs.getFrase() + " " + frase2);
    }

    public void remplazarLetra(Cadena frase, char letra) {

        String nuevaFrase = frase.getFrase().replace('a', letra);

        System.out.println("La frase remplazada es " + nuevaFrase);
    }

    public boolean contiene(Cadena cs) {
        System.out.println("Ingrese la letra a buscar");
        return cs.getFrase().contains(leer.next());
    }

}
