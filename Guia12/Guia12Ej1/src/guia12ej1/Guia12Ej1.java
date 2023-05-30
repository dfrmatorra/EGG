package guia12ej1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;


/**
 *
 * @author DarioF
 */
public class Guia12Ej1 {

    public static void main(String[] args) {
      
        //Declaracion del objeto perro
        Animal perro1 = new Perro ("Stich", "Carne", 15, "Doberman");
        perro1.alimentarse();
        
        //Declaracion de otro objeto Perro
        Animal perro2 = new Perro ("Teddy", "Croquetas", 16, "Chihuahua");
        perro2.alimentarse();
        
        //Declaracion del Objeto Gato
        Animal gato1 = new Gato ("Pelusa", "Galletas", 15, "Siames");
        gato1.alimentarse();
        
        //Declaracion del objeto Caballo
        Animal caballo1 = new Caballo ("Spark", "Pasto", 25, "Fino");
        caballo1.alimentarse();
        
        
        
    }
    
}
