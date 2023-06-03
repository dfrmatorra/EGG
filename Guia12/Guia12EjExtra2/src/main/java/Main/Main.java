/*Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
16
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */

package Main;

import Entities.Edificio;
import Entities.EdificioDeOficinas;
import Entities.Polideportivo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList<>();
        edificios.add(new Polideportivo("Polideportivo", "Techado"));
        edificios.add(new Polideportivo("Polideportivo", "Abierto"));
        edificios.add(new EdificioDeOficinas("Edificio De Oficinas", 5, 10, 3));
        edificios.add(new EdificioDeOficinas("Edificio De Oficinas", 5, 10, 3));

        for (Edificio edificio : edificios) {
            System.out.println(edificio.calcularSuperficie());
            System.out.println(edificio.calcularVolumen());
            if (edificio instanceof Polideportivo) {
                System.out.println(((Polideportivo) edificio).getTipoInstalacion());
            }
            if (edificio instanceof EdificioDeOficinas) {


    }
}