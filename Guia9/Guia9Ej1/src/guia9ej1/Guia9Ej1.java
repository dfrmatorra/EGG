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
una letra que ingresa
 */
package guia9ej1;

import Entidades.Cadena;
import Servicios.CadenaService;
import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class Guia9Ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        CadenaService cs = new CadenaService();

        Cadena c1 = cs.crearFrase();

        int opc = 0;
        do {
            System.out.println("-------------------------");
            System.out.println("Opción 1 Mostrar Vocales");
            System.out.println("Opcion 2 Invertir Frase");
            System.out.println("Opcion 3 Veces Repetido");
            System.out.println("Opcion 4 Compara Longitud");
            System.out.println("Opcion 5 Unir Fraces");
            System.out.println("Opcion 6 Reemplazar Letra");
            System.out.println("Opcion 7 Contiene Letra");
            System.out.println("Opcion 8 Salir");
            System.out.println("-------------------------");
            System.out.println("");
            System.out.println("Ingrese la Opcion deseada:");
            opc = leer.nextInt();
            System.out.println("");
            switch (opc) {
                case 1:
                    cs.mostrarVocales(c1);
                    break;
                case 2:
                    cs.invertirFrase(c1);
                    break;
                case 3:
                    cs.vecesRepetido(c1);
                    break;
                case 4:
                    cs.compararLongitud(c1);
                    break;
                case 5:
                    cs.unirFrases(c1);
                    break;
                case 6:
                    cs.reemplazar(c1);
                    break;
                case 7:
                    cs.contiene(c1);
                    break;
                case 8:

                    break;
                default:
                    throw new AssertionError();
            }

        } while (opc != 8);

    }
}
