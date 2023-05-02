import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
//todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//crear otra Pelicula o no.
//Después de ese bucle realizaremos las siguientes acciones:
//• Mostrar en pantalla todas las películas.
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.
//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
public class PeliculaService {
    Scanner scanner = new Scanner(System.in);

    public Pelicula crearPelicula() {
        System.out.println("Ingrese el titulo de la pelicula");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese el director de la pelicula");
        String director = scanner.nextLine();
        System.out.println("Ingrese la duracion de la pelicula");
        double duracion = scanner.nextInt();
        scanner.nextLine();
        return new Pelicula(titulo, director, duracion);
    }

    public ArrayList<Pelicula> crearListaPeliculas() {
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        boolean seguir = true;
        while (seguir) {
            Pelicula pelicula = crearPelicula();
            peliculas.add(pelicula);
            System.out.println("Desea crear otra pelicula? (s/n)");
            String respuesta = scanner.nextLine();
            if (respuesta.equals("n")) {
                seguir = false;
            }
        }
        return peliculas;
    }

    public void mostrarPeliculas(ArrayList<Pelicula> peliculas) {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void ordenarPeliculas(ArrayList<Pelicula> peliculas) {
        Collections.sort(peliculas);
    }
}


