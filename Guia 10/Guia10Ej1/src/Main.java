//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrará todos los perros guardados en el ArrayList.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> Perros = new ArrayList<>();

        String respuesta;
        do {
            System.out.println("Ingrese la raza del perro:");
            String raza = leer.next();
            Perros.add(raza);
            System.out.println("Quiere guardar otro perro? (s/n)");
            respuesta = leer.next();
        } while (!respuesta.equalsIgnoreCase("n"));

        mostrar (Perros);

        String perroBuscado = buscarPerro(Perros);
        if (!perroBuscado.equalsIgnoreCase("")) {
            borrarPerro(Perros, perroBuscado);
        } else {
            System.out.println("El perro no esta en la lista");

        }
        mostrar (Perros);
    }

    public static void mostrar (ArrayList <String> Perros){
        for (String s : Perros) {
            System.out.println(s);
        }
    }

    public static String buscarPerro(ArrayList <String> Perros) {
        Scanner leer = new Scanner(System.in);
        String buscar = "";
        System.out.println("Ingrese el perro que quiere buscar:");
        String perroB = leer.next();
        Iterator<String> iterator = Perros.iterator();
        while (iterator.hasNext()){
            String perroActual = iterator.next();
            if (perroActual.equalsIgnoreCase(perroB)) {
                buscar = perroB;
                System.out.println("El perro esta en la lista");
            }
        }
        return buscar;
    }
    public static void borrarPerro(ArrayList<String> Perros, String perroBuscado){
       Perros.remove(perroBuscado);
        System.out.println("El perro " + perroBuscado + " fue borrado");
            }
    }

