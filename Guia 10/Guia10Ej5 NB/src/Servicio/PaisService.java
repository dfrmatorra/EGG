/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class PaisService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public HashSet<String> crearPaises() {
        HashSet<String> paises = new HashSet<String>();
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

    public void mostrarPaises(HashSet<String> paises) {
        int cont = 1;
        for (String pais : paises) {
            System.out.println(cont + " - " + pais);
            cont++;
        }
    }

    public void ordenarAlfa(HashSet<String> paises) {

        ArrayList<String> paisLista = new ArrayList<>();
        Collections.sort(paisLista);
        HashSet<String> sortedSet = new HashSet<>(paisLista);
                
        System.out.println("---------------------------------");
        System.out.println("Paises ordenadas alfabeticamente en forma ascendente:");

        mostrarPaises(paises);

    }

}
