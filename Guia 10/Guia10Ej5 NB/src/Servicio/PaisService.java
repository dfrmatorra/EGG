/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Dario
 */
public class PaisService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    TreeSet<String> paises = new TreeSet<String>();

    public TreeSet<String> crearPaises() {

        String respuesta = "";
        do {
            System.out.println("Ingrese el nobre del Pais:");
            String pais = leer.next();
            paises.add(pais);
            System.out.println("Quiere seguir ingresando paises? (s/n)");
            respuesta = leer.next();
        } while (!respuesta.equalsIgnoreCase("n"));
        return paises;

    }

    public void mostrarPaises() {
        int cont = 1;
        for (String pais : paises) {
            System.out.println(cont + " - " + pais);
            cont++;
        }
    }

//    public void ordenarAlfa(TreeSet<String> paises) {
//
//        ArrayList<String> paisLista = new ArrayList<>();
//        Collections.sort(paisLista);
//        TreeSet<String> sortedSet = new TreeSet<>(paisLista);
//                
//        System.out.println("---------------------------------");
//        System.out.println("Paises ordenadas alfabeticamente en forma ascendente:");
//
//        mostrarPaises(paises);
//
//    }
    public void buscarPais() {
        System.out.println("Ingrese el pais a borrar");
        String resp = leer.next();
        int cont = 0;

        Iterator<String> iterator = paises.iterator();
        while (iterator.hasNext()) {
            String paisActual = iterator.next();
            if (paisActual.equalsIgnoreCase(resp)) {
                paises.remove(resp);
                System.out.println("El pais estaba en la lista y fue borrado");
                break;
            } else {
                cont++;
            }
        }

        if (cont == paises.size()) {
            System.out.println("El pais no esta en la lista");
        }
        mostrarPaises();
    }

}
