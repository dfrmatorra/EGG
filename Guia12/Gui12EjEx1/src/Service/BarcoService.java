package Service;

import Guia12EjEx1.Barco;
import Guia12EjEx1.BarcoAMotor;
import Guia12EjEx1.Velero;
import Guia12EjEx1.Yate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author CASA
 */
public class BarcoService {

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

}
