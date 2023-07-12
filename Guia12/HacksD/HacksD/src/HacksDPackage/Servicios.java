/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HacksDPackage;

import Enums.Apellidos;
import Enums.Editoriales;
import Enums.Estado_Civil;
import Enums.NombreLibros;
import Enums.Nombres;
import Enums.Sectores;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kinoc
 */
public class Servicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Random nom = new Random();

    public int validarEntero() {
        while (true) {
            try {
                return Integer.parseInt(leer.next());
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un numero entero valido.\n");
            }
        }
    }

    public Integer validarEEntero() {
        while (true) {
            try {
                return Integer.parseInt(leer.next());
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un numero entero valido.\n");
            }
        }
    }

    public double validarDouble() {
        while (true) {
            try {
                return Double.parseDouble(leer.next());
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un numero valido.\n");
            }
        }
    }

    public Double validarDDouble() {
        while (true) {
            try {
                return Double.parseDouble(leer.next());
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un numero valido.\n");
            }
        }
    }
        public Long validarLong() {
        while (true) {
            try {
                return Long.parseLong(leer.next());
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un numero valido.\n");
            }
        }
        
    }

    public String validarString() {
        String entrada = leer.next();
        while (entrada.isEmpty()) {
            System.out.print("Ingrese un valor válido.\n");
            entrada = leer.next();
        }
        return entrada;
    }

    public String nombre() {

        return Nombres.values()[nom.nextInt(Nombres.values().length)].name();
    }

    public String apellido() {

        return Apellidos.values()[nom.nextInt(Apellidos.values().length)].name();

    }

    public String apellidoNombre() {

        return apellido() + ", " + nombre();
    }

    public String nombreApellido() {

        return nombre() + " " + apellido();

    }

    public int generarDni() {
        int dni;
        do {
            dni = nom.nextInt(50000000);
        } while (dni < 15000000);
        return dni;
    }

    public void wait(int ms) {

        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public String NombreLibros() {

        return NombreLibros.values()[nom.nextInt(NombreLibros.values().length)].name();
    }
    
    public String elegirEstadoCivil(int a){
        
        return Estado_Civil.values()[(a-1)].name();   
    }
    
    
    public void mostrarEstadoCivil() {
        
        
        for (int i = 0; i < Estado_Civil.values().length; i++) {
            System.out.println((i+1)+".- " + Estado_Civil.values()[i].name());
        }
        
        
    }

    public int ano() {
        int ano;
        do {
            ano = nom.nextInt(2023);
        } while (ano < 1985);

        return ano;
    }
    
    public int numero(int a){
        return nom.nextInt(a);
    }
    
    public String editorial(){
        
        return Editoriales.values()[nom.nextInt(Editoriales.values().length)].name();
    }
    
    public String personalServicio(){
        
        return Sectores.values()[nom.nextInt(Sectores.values().length)].name();
    }
    

}
