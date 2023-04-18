/*
Realizar una clase llamada Cadena, en el paquete de entidades, que
tenga como atributos una frase (String) y su longitud. Agregar
constructor vacío y con atributo frase solamente. Agregar getters y
setters. El constructor con frase como atributo debe setear la longitud
de la frase de manera automática. Crear una clase CadenaServicio en el
paquete servicios que implemente los siguientes métodos:
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
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.
 */
package guia9ej1;

import Entidades.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author DarioF
 */
public class Guia9Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        CadenaServicio cs = new CadenaServicio();

        Cadena c1 = cs.crearCadena();
        
        System.out.println("La cantidad de vocales que tiene la frase son " + cs.mostrarVocales(c1));
        
        cs.invertirFrase(c1);
        
        System.out.println("Ingrese la letra para contar");
        String letra = leer.next();
        
        cs.vecesRepetido(c1, letra);

        System.out.println("Ingrese una segunda frase para comparar:");
        String frase2 = leer.next();
        cs.compararLongitud(c1, frase2);

        System.out.println("Ingrese una letra para remplazar la letra 'a'");
        char caracter = leer.next().charAt(0);
        cs.remplazarLetra(c1, caracter);

        if (cs.contiene(c1)) {
            System.out.println("Contiene");
        } else {
            System.out.println("No contiene");
        }

    }

}
