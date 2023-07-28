package gui12ejex1;

import Entities.Amarre;
import Entities.Barco;
import Service.BarcoService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class Gui12EjEx1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        BarcoService bs = new BarcoService();

        List<Barco> barcos = new ArrayList();
        barcos.addAll(bs.crearBarcos());
        int opc = 0;
        do {
            System.out.println("MENU");
            System.out.println("1-Seleccion de barco");
            System.out.println("2-Elegir fecha de alquiler y posicion");
            System.out.println("3-Mostrar precio final");
            System.out.println("4-Salir");
            System.out.println("------------");
            opc = leer.nextInt();
            int eleccion = 0;
            switch (opc) {
                case 1:
                    eleccion = elegirBarco(barcos);
                    break;
                case 2:
                    bs.crearAmarres(barcos, eleccion);
                    break;
                case 3:
                    bs.mostrarPrecioFinal(barcos, eleccion);
                    break;
            }
        }while(opc !=4);
    }

    private static int elegirBarco(List<Barco> barcos) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int eleccion = 0;
        for (Barco barco : barcos) {
            System.out.println(barcos.indexOf(barco) + " - " + barco.toString());
        }
        System.out.println("Eliga un barco");
        eleccion = leer.nextInt();
        System.out.println("Su seleccion es:");
        System.out.println(barcos.get(eleccion).getMatricula());
        return eleccion;
    }
}