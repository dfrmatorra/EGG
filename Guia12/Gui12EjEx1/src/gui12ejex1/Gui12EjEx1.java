package gui12ejex1;

import Guia12EjEx1.Barco;
import Service.BarcoService;
import java.util.ArrayList;
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

        System.out.println("MENU");
        System.out.println("1-Elegir barco");
        System.out.println("2-Elegir fecha de alquiler y posicion");
        System.out.println("3-Mostrar precio final");
        System.out.println("------------");
        int opc = leer.nextInt();
        int eleccion = 0;
        switch (opc) {
            case 1:
                for (Barco barco : barcos) {
                    System.out.println(barcos.indexOf(barco) + " - " + barco);
                }
                eleccion = leer.nextInt();
                System.out.println(barcos.indexOf(eleccion - 1));
                //barcos.indexOf(eleccion-1); 
                break;
            case 2:
                
                break;

        }

    }

}
