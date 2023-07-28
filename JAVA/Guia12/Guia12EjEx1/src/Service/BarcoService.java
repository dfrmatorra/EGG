package Service;

import Entities.Barco;
import Entities.BarcoAMotor;
import Entities.Velero;
import Entities.Yate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class BarcoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    List<Barco> listaB = new ArrayList();

    public List<Barco> crearBarcos() {
        Velero velero1 = new Velero(1, "ar1", 25.0, 2010);
        Velero velero2 = new Velero(2, "ar2", 30.0, 2015);
        BarcoAMotor barcoMot1 = new BarcoAMotor(20, "ar3", 25.5, 2012);
        BarcoAMotor barcoMot2 = new BarcoAMotor(30, "ar4", 30.5, 2014);
        Yate yate1 = new Yate(25, 10, "ar5", 35.5, 2020);
        Yate yate2 = new Yate(28, 12, "ar6", 40.5, 2022);
        listaB.add(velero1);
        listaB.add(velero2);
        listaB.add(barcoMot1);
        listaB.add(barcoMot2);
        listaB.add(yate1);
        listaB.add(yate2);
        return listaB;
    }

    public void crearAmarres(List<Barco> barcos, int eleccion){
        List<String> posiciones = new ArrayList<>();
        String posicion1="A";
        String posicion2="B";
        String posicion3="C";
        String posicion4="D";
        posiciones.add(posicion1);
        posiciones.add(posicion2);
        posiciones.add(posicion3);
        posiciones.add(posicion4);
        System.out.println("Ingrese la fecha de INICIO de alquiler del barco (yyyy-MM-dd):");
        LocalDate fechaAlq = LocalDate.parse(leer.next());
        barcos.get(eleccion).setFechaAlquiler(fechaAlq);
        System.out.println("Ingrese la fecha de DEVOLUCION de alquiler del barco(yyyy-MM-dd):");
        LocalDate fechaD = LocalDate.parse(leer.next());
        barcos.get(eleccion).setFechaDev(fechaD);
        System.out.println("Eliga la posicion de amarre:");
        for (String aux : posiciones) {
            System.out.println(aux);
        }
        String posicion = leer.next();
        barcos.get(eleccion).setPosicionAmarre(posicion);
    }

    public void mostrarPrecioFinal(List<Barco> barcos, int eleccion) {

        System.out.println("El precio final del barco es: " + barcos.get(eleccion).precioFinal(barcos.get(eleccion)));

    }
}
