package Main;
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


import Entities.Edificio;
import Entities.EdificioDeOficinas;
import Entities.Polideportivo;

import java.util.ArrayList;

public class Guia12EjExtra2 {
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList<>();
        edificios.add(new Polideportivo("Polideportivo", true, 15, 2, 12));
        edificios.add(new Polideportivo("Polideportivo", false,20, 2, 15));
        edificios.add(new EdificioDeOficinas( 1, 10, 1, 15, 2, 12 ));
        edificios.add(new EdificioDeOficinas(1, 15, 1, 20, 2, 15));

        for (Edificio edificio : edificios) {
            System.out.println(edificio);
            System.out.println("Superficie: " + edificio.calcularSuperficie());
            System.out.println("Vlolumen: " + edificio.calcularVolumen());
            if (edificio instanceof Polideportivo) {
                System.out.println(((Polideportivo) edificio).getPolideportivo());
                if(((Polideportivo) edificio).getTechado()){
                    System.out.println("El polideportivo es techado");
                }else{
                    System.out.println("El polideportivo es abierto");
                }
            }
            if (edificio instanceof EdificioDeOficinas) {
                System.out.println("Cantidad de personas: " + (((EdificioDeOficinas) edificio).getCantidadDePer())*((EdificioDeOficinas) edificio).getNumPisos());

            }
            System.out.println("------------------------------------------");
        }
    }
}