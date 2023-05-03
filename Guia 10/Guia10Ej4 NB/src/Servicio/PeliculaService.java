
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
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class PeliculaService {

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public Pelicula crearPelicula() {
        System.out.println("Ingrese el titulo de la pelicula");
        String titulo = scanner.next();
        System.out.println("Ingrese el director de la pelicula");
        String director = scanner.next();
        System.out.println("Ingrese la duracion de la pelicula");
        double duracion = scanner.nextDouble();
        return new Pelicula(titulo, director, duracion);
    }

    public ArrayList<Pelicula> crearListaPeliculas() {
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        String seguir = "";
        while (!seguir.equalsIgnoreCase("n")) {
            Pelicula pelicula = crearPelicula();
            peliculas.add(pelicula);
            System.out.println("Desea crear otra pelicula? (s/n)");
            seguir = scanner.next();
            System.out.println("---------------------");
        }
        return peliculas;
    }

    public void mostrarPeliculas(ArrayList<Pelicula> peliculas) {
        int cont = 1;
        for (Pelicula pelicula : peliculas) {
            System.out.println(cont + " - " + pelicula);
            cont++;
        }
//        System.out.println(peliculas);
    }

    public void mostrarPeliMayor(ArrayList<Pelicula> peliculas) {
        System.out.println("--------------------------------");
        System.out.println("Peliculas de mas de una hora:");
        int cont = 1;
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() >= 1) {
                System.out.println(cont + " - " + pelicula);
                cont++;
            }
        }
    }

    public void ordenarPelisMenorMayor(ArrayList<Pelicula> peliculas) {

        Comparator<Pelicula> peliComparator = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                if (p1.getDuracion() > p2.getDuracion()) {
                    return 1;
                } else if (p1.getDuracion() < p2.getDuracion()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        peliculas.sort(peliComparator);

        System.out.println("---------------------------------");
        System.out.println("Peliculas ordenadas por duracion de menor a mayor:");

        mostrarPeliculas(peliculas);

    }

    public void ordenarPelisMayorMenor(ArrayList<Pelicula> peliculas) {

        Comparator<Pelicula> peliComparator = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                if (p1.getDuracion() > p2.getDuracion()) {
                    return -1;
                } else if (p1.getDuracion() < p2.getDuracion()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        peliculas.sort(peliComparator);

        System.out.println("---------------------------------");
        System.out.println("Peliculas ordenadas por duracion de mayor a menor:");

        mostrarPeliculas(peliculas);

    }

    public void ordenarAlfabetAsc(ArrayList<Pelicula> peliculas) {

        Comparator<Pelicula> peliComparator = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getTitulo().toLowerCase().compareTo(p2.getTitulo().toLowerCase());
            }
        };
        peliculas.sort(peliComparator);

        System.out.println("---------------------------------");
        System.out.println("Peliculas ordenadas alfabeticamente en forma ascendente:");

        mostrarPeliculas(peliculas);

    }

    public void ordenarAlfabetDesc(ArrayList<Pelicula> peliculas) {

        Comparator<Pelicula> peliComparator = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p2.getTitulo().toLowerCase().compareTo(p1.getTitulo().toLowerCase());
            }
        };
        peliculas.sort(peliComparator);

        System.out.println("---------------------------------");
        System.out.println("Peliculas ordenadas alfabeticamente en forma descendente:");

        mostrarPeliculas(peliculas);

    }
}