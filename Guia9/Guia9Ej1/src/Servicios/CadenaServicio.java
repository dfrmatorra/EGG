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
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.
 */
package Servicios;

import Entidades.Cadena;

/**
 *
 * @author Dario
 */
public class CadenaServicio {

    public int mostrarVocales(Cadena cs) {
        String vocalVector[] = {"a", "e", "i", "o", "u"};
        String letra = "";
        String vocal = "";
        int contVocal = 0;
        for (int i = 0; i < cs.getLongitud() - 1; i++) {
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
    
    public void invertirFrase (Cadena cs){
        String letra = "";
        String[]palabraInvertida = new String[cs.getLongitud()];      
        for (int i = 0; i < cs.getLongitud() - 1; i++) {
                letra = cs.getFrase().substring(i, i + 1);
        }
        
    }
    

}
