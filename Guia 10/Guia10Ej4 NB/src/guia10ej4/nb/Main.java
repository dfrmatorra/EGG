// Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
//tendremos una clase Pelicula con el tÃ­tulo, director y duraciÃ³n de la pelÃ­cula (en horas).
//Implemente las clases y mÃ©todos necesarios para esta situaciÃ³n, teniendo en cuenta lo
//que se pide a continuaciÃ³n:
//En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiÃ©ndole al usuario
//todos sus datos y guardÃ¡ndolos en el objeto Pelicula.
//DespuÃ©s, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//crear otra Pelicula o no.
//DespuÃ©s de ese bucle realizaremos las siguientes acciones:
//â€¢ Mostrar en pantalla todas las pelÃ­culas.
//â€¢ Mostrar en pantalla todas las pelÃ­culas con una duraciÃ³n mayor a 1 hora.
//â€¢ Ordenar las pelÃ­culas de acuerdo a su duraciÃ³n (de mayor a menor) y mostrarlo en
//pantalla.
//â€¢ Ordenar las pelÃ­culas de acuerdo a su duraciÃ³n (de menor a mayor) y mostrarlo en
//pantalla.
//â€¢ Ordenar las pelÃ­culas por tÃ­tulo, alfabÃ©ticamente y mostrarlo en pantalla.
//â€¢ Ordenar las pelÃ­culas por director, alfabÃ©ticamente y mostrarlo en pantalla.

package guia10ej4.nb;
import Entidad.Pelicula;
import Servicio.PeliculaService;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        PeliculaService ps = new PeliculaService();

        ArrayList<Pelicula> listaPeliculas = ps.crearListaPeliculas();

        ps.mostrarPeliculas(listaPeliculas);

        ps.mostrarPeliMayor(listaPeliculas);

        ps.ordenarPelisMayorMenor(listaPeliculas);

        ps.ordenarPelisMenorMayor(listaPeliculas);

        ps.ordenarAlfabetAsc(listaPeliculas);

        ps.ordenarAlfabetDesc(listaPeliculas);

    }
}