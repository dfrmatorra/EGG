/*
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????
 */
package Servicios;

import Entidades.Hora;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DarioF
 */
public class HoraServicios {

    public Hora ingresarHora() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar hora:");
        int hora = leer.nextInt();
        while (hora > 24) {
            System.out.println("La hora debe ser hasta 24. Ingrese la hora nuevamente:");
            hora = leer.nextInt();
        }
        System.out.println("Ingresar minutos:");
        int min = leer.nextInt();
        while (min > 59) {
            System.out.println("Los minutos deben ser hasta 59. Ingrese los minutos nuevamente:");
            min = leer.nextInt();
        }
        System.out.println("Ingresar segundos:");
        int seg = leer.nextInt();
        while (seg > 59) {
            System.out.println("Los segundos deben ser hasta 59. Ingrese los segundos nuevamente:");
            seg = leer.nextInt();
        }
        return new Hora(hora, min, seg);
    }

    public void mostrarHora(Hora h) {

        for (int i = 0; i < 5000; i++) {
                        String hh = "";
            String m = "";
            String s = "";

            if (h.getHora() < 10) {
                hh = "0";
            }
            if (h.getMinutos() < 10) {
                m = "0";
            }
            if (h.getSegundos() < 10) {
                s = "0";
            }
            
                System.out.println(hh + h.getHora() + ":" + m + h.getMinutos() + ":" + s + h.getSegundos());

            if (h.getSegundos() < 59) {
                h.setSegundos(h.getSegundos() + 1);
            } else {
                h.setSegundos(0);
                if (h.getMinutos() < 59) {
                    h.setMinutos(h.getMinutos() + 1);
                } else {
                    h.setMinutos(0);
                    if (h.getHora() < 23) {
                        h.setHora(h.getHora() + 1);
                    } else {
                        h.setHora(0);
                    }
                }
            }     
            wait(1000);
//            limpiarPantalla();
        }
    }

    public static void wait(int ms) {

        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
//    public static void limpiarPantalla(){
//        try {
//            System.out.println("Presione enter para continuar...");
//            new java.util.Scanner(System.in).nextLine();
//            String sistemaOperativo = System.getProperty("os.name");
//            ArrayList<String> comando= new ArrayList<>();
//            if(sistemaOperativo.contains("Windows")){        
//                comando.add("cmd");
//                comando.add("/C");
//                comando.add("cls");
//                
//            } else {
//                comando.add("clear");
//            } 
//            
//            ProcessBuilder pb = new ProcessBuilder(comando);
//            Process iniciarProceso = pb.inheritIO().start();
//            iniciarProceso.waitFor();
//            
//        } catch (Exception e) {
//            System.out.println("Error al limpiar la pantalla"+e.getMessage());
//        }
//    }

}
