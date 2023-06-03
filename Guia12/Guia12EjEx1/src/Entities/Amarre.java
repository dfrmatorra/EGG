package Entities;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class Amarre {
    protected LocalDate fechaAlquiler;
    protected LocalDate fechaDev;
    protected String posicionAmarre;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");


    public List<String> crearAmarres(){
        List<String> posiciones = new ArrayList<>();
        String posicion1="A";
        String posicion2="B";
        String posicion3="C";
        String posicion4="D";
        posiciones.add(posicion1);
        posiciones.add(posicion2);
        posiciones.add(posicion3);
        posiciones.add(posicion4);
//        System.out.println("Ingrese la fecha de INICIO de alquiler del barco (yyyy-MM-dd):");
//        LocalDate fechaAlq = LocalDate.parse(leer.next());
//        this.fechaAlquiler = fechaAlq;
//        System.out.println("Ingrese la fecha de DEVOLUCION de alquiler del barco(yyyy-MM-dd):");
//        LocalDate fechaD = LocalDate.parse(leer.next());
//        this.fechaDev = fechaD;
//        System.out.println("Eliga la posicion de amarre:");
//        for (String aux : posiciones) {
//            System.out.println(aux);
//        }
//        this.posicionAmarre = leer.next().toUpperCase();
    return posiciones;
    }

}
