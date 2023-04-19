/*
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
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
una letra que ingresa
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class CadenaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearFrase() {
        System.out.println("Ingrese una frase:");
        String frase = leer.next();
        return new Cadena(frase);
    }

    public void mostrarVocales(Cadena cs) {
        int cont = 0;
        for (int i = 0; i < cs.getLongitud(); i++) {
            String letra = cs.getFrase().substring(i, i + 1);
            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
                cont++;
            }
        }
        System.out.println("La frase tiene " + cont + " vocales.");
    }

    public void invertirFrase(Cadena cs) {
        for (int i = cs.getLongitud(); i > 0; i--) {
            System.out.print(cs.getFrase().substring(i - 1, i));
        }
        System.out.println("");
    }

    public void vecesRepetido(Cadena cs) {
        System.out.println("Ingrese la letra que quiere contar");
        String letra = leer.next();
        String frase = cs.getFrase();
        int cont = 0;

        for (int i = 0; i < cs.getLongitud(); i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase(letra)) {
                cont++;
            }
        }
        System.out.println("La frase tiene " + cont + " veces la letra " + letra);

    }

    public void compararLongitud(Cadena cs) {
        System.out.println("Ingrese una otra frase:");
        String frase2 = leer.next();
        String frase1 = cs.getFrase();

        int resultado = frase1.compareTo(frase2);//el método compareTo() que devuelve un valor entero que indica si una cadena 
        //es menor, igual o mayor que otra en orden alfabético

        if (resultado < 0) {
            System.out.println("La frase '" + frase1 + "' es mayor que la frase '" + frase2 + "'");
        } else if (resultado == 0) {
            System.out.println("Las frases son iguales");
        } else {
            System.out.println("La frase '" + frase1 + "' es menor que la frase '" + frase2 + "'");
        }
    }

    public void unirFrases(Cadena cs) {
        System.out.println("Ingrese una otra frase:");
        String frase2 = leer.next();
        String frase1 = cs.getFrase();

        System.out.print(frase1 + " " + frase2);
        System.out.println("");

    }

    public void reemplazar(Cadena cs) {
        System.out.println("Ingrese el simbolo que quiere reemplazar en lugar de la letra a");
        char letra = leer.next().charAt(0);
        String frase = cs.getFrase();

        frase = frase.replace('a', letra);//El método replace() recibe dos parámetros: el primero es la letra o subcadena que se desea 
        //reemplazar y el segundo es la letra o subcadena que se utilizará como reemplazo

        System.out.println(frase);
    }

    public void contiene(Cadena cs) {
        System.out.println("Ingrese la letra que quiere verificar si tiene la frase");
        String letra = leer.next();
        String frase = cs.getFrase();
        if (frase.contains(letra)) {//devuelve true
            System.out.println("Contiene");
        } else {
            System.out.println("No contiene");
        }
    }

}
