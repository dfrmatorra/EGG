/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.
 */
package guia7POOejextra1;

import Entidad.Cancion;

/**
 *
 * @author CASA
 */
public class Guia7EjExtra1 {

    public static void main(String[] args) {
       
        Cancion cancion1 = new Cancion ();
        
        cancion1.inicializarCancion();
        cancion1.crearCancion("Inolvidable", "Nat king Cole");
        
        
        Cancion cancion2 = new Cancion ();
        
        cancion2.inicializarCancion();
        cancion2.crearCancion("She", "Frank Sinatra");
        
        System.out.println(cancion1.toString());
        System.out.println(cancion2.toString());
    }
    
}
