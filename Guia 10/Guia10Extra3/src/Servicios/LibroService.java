/*
• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros.
 */
package Servicios;

import Entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class LibroService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public boolean prestamo(HashSet<Libro> libSer) {
        boolean respuesta = false;
        int cont = 0;
        System.out.println("Ingrese el titulo del libro buscado:");
        String libroBuscado = leer.next();
        for (Libro libro : libSer) {
            if (libro.getTitulo().equals(libroBuscado)) {
                cont++;
                if (libro.getNumEjemplares() > 0) {
                    libro.setNumEjemplares(libro.getNumEjemplares() - 1);
                    libro.setNumEjemplaresPrestados(libro.getNumEjemplaresPrestados() + 1);
                    respuesta = true;
                }
                break;
            }

        }
        if (respuesta == false) {
            if (cont == 0) {
                System.out.println("El libro no existe en la libreria");
            } else {
                System.out.println("No hay ejemplares del libro buscado");
            }
        }
        return respuesta;

    }

    public void crearLibro(HashSet<Libro> libSer) {
        String resp = "";
        do {
            System.out.println("Ingrese el nombre del libro");
            String titulo = leer.next();
            System.out.println("Ingrese el autor del libro");
            String autor = leer.next();
            System.out.println("Ingrese la cantidad de numeros de ejemplares");
            int numEjemp = leer.nextInt();
            System.out.println("Ingrese la cantidad de libros prestados");
            int numPrest = leer.nextInt();

            libSer.add(new Libro(titulo, autor, numEjemp, numPrest));
            System.out.println("Quiere seguir cargando libros(s/n)");
            resp = leer.next().toLowerCase();
        }while (!resp.equalsIgnoreCase("n"));

    }

    public boolean devolucion(HashSet<Libro> libSer) {
        boolean respuesta = false;
        int cont = 0;
        System.out.println("Ingrese el titulo del libro para devolver:");
        String libroBuscado = leer.next();
        for (Libro libro : libSer) {
            if (libro.getTitulo().equals(libroBuscado)) {
                cont++;
                if (libro.getNumEjemplaresPrestados() > 0) {
                    libro.setNumEjemplaresPrestados(libro.getNumEjemplaresPrestados() - 1);
                    libro.setNumEjemplares(libro.getNumEjemplares() + 1);
                    respuesta = true;
                }
                break;
            }

        }
        if (respuesta == false) {
            if (cont == 0) {
                System.out.println("No se encuentra el libro en la libreria");
            } else {
                System.out.println("No hay ejemplares prestados de este libro");
            }
        }
        return respuesta;
    }

    public void mostrar(HashSet<Libro> Lib) {
        Lib.forEach((libro) -> {System.out.println(libro.toString());
        });
 }
    }
