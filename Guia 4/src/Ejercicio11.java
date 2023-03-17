
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dario
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        
        String frase = "";
        int largo = 0;
        String igualar;
        
        do {
            System.out.println("Ingrese una frase que termine en punto");
            frase = ingrese.nextLine();
            largo = frase.length();
            igualar = frase.substring((largo - 1), largo);
        } while (!igualar.equals("."));
        String retorno = cambiar(frase, largo);
        System.out.println(retorno);
    }

    public static String cambiar(String frase, int largo) {
        String frase2 = "";
        String letra;
        
        for (int i = 0; i < (largo - 1); i++) {
            
            letra = frase.substring(i, i + 1);
            letra.equalsIgnoreCase(letra);
            
            switch (letra) {
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "$";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;
            }
            frase2 = frase2.concat(letra);
        }
        return frase2;
    }

}