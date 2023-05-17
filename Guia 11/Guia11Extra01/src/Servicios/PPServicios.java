package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import Enums.Raza;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PPServicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    List<Persona> personas = new ArrayList();
    List<Perro> perrosadoptables = new ArrayList();
    String opc;

    public void crearPersona() {
        System.out.println("Se procedera a cargar personas en el sistema");

        do {
            Persona persona = new Persona();
            System.out.println("Ingrese el nombre de la persona");
            persona.setNombre(leer.next());
            System.out.println("Ingrese apellido");
            persona.setApellido(leer.next());
            personas.add(persona);//se van cargando objetos Personas a la lista
            System.out.println("Quiere seguir cargando? (s/n)");
            opc = leer.next();
        } while (!opc.equalsIgnoreCase("n"));
    }

    public void crearPerro() {
        System.out.println("Se procede a cargar perros en el sistema");
        do {
            Perro perro = new Perro();
            System.out.println("Ingrese el nombre del perro");
            perro.setNombre(leer.next());
            System.out.println("Eliga la raza?");
            for (Raza value : Raza.values()) {// Recorrer la lista con un bucle "for each"
                System.out.println(value.ordinal() + "-" + value);
            }
            int razaelegida = leer.nextInt();
            int cont = 0;
            do {
                if (razaelegida >= 0 || razaelegida <= Raza.values().length) {
                    perro.setRaza(Raza.values()[razaelegida]);
                    cont++;
                } else {
                    System.out.println("Elige una opcion valida");
                }
            } while (cont == 0);

            perro.setAdoptado(false);
            perrosadoptables.add(perro);//se van cargando objetos Perro a la lista
            System.out.println("Quiere seguir cargando? (s/n)");
            opc = leer.next();
        } while (!opc.equalsIgnoreCase("n"));
        System.out.println("");
    }

    public void adoptarPerros() {
        for (Persona aux : personas) {
            do {
                System.out.println("Para la persona " + aux.getNombre() + " " + aux.getApellido() + " \n"
                        + "seleccione el nombre de uno de los siguientes perros: ");
                for (Perro aux2 : perrosadoptables) {
                    System.out.println("Nombre: " + aux2.getNombre() + " - Raza: " + aux2.getRaza());
                }
                String adoptable = leer.next();

                int ctrol = 0;
                int ctrolAux = 0;
                for (int i = 0; i < perrosadoptables.size(); i++) {
                    if (adoptable.equalsIgnoreCase(perrosadoptables.get(i).getNombre()) && (perrosadoptables.get(i).getAdoptado() == true)) {
                        System.out.println("Este perro ya esta adoptado");
                        ctrolAux++;
                    if (adoptable.equalsIgnoreCase(perrosadoptables.get(i).getNombre()) && perrosadoptables.get(i).getAdoptado() != true) {
                        ArrayList<Perro> perroAux = new ArrayList();
                        perroAux.add(perrosadoptables.get(i));
                        aux.setPerro(perroAux);
                        perrosadoptables.get(i).setAdoptado(true);
                        ctrol++;
                        perroAux.clear();
                    }
                }
            }
            if (ctrol == 0 && ctrolAux == 0) {
                System.out.println("Este no es un perro valido");
            }
            System.out.println("Quiere adoptar otro perro (s/n)");
            opc = leer.next();

        }
        while (!opc.equalsIgnoreCase("n"));
    }
}

public void mostrar() {
        System.out.println("------------------------------------------------------------");
        System.out.println("Las siguientes personas han adoptado los siguientes perros: ");
        System.out.println("------------------------------------------------------------");

        for (Persona aux : personas) {
            if (aux.getPerro() == null) {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " no ha adoptado a ningun perro");
            } else {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " a adoptado a: ");
                ArrayList<Perro> perroMostrar = aux.getPerro();
                for (Perro perro : perroMostrar) {
                    System.out.println(perro);
                }
                perroMostrar.clear();
            }
        }
    }
}
