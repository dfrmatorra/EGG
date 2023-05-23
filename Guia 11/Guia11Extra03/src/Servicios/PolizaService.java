package Servicios;

import Entities.Cliente;
import Entities.Cuota;

import Entities.Poliza;
import Entities.Vehiculo;
import Enumeradores.FormaPago;
import Enumeradores.Tipo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PolizaService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Poliza> polizas = new ArrayList<>();

//Vehiculos auto, Cliente cliente, int nroPoliza, Date fechaInicio, Date fechaFin, ArrayList<Cuota> cuotas,
//FormaPago formaPago, double montoAsegurado, boolean granizo, double maxGranizo, TipoCobertura cobertura
    public void menuPoliza() {

        System.out.println("-----MENU-----");
        System.out.println("1-Generar Poliza");
        System.out.println("2-Gestion integral de clientes");
        System.out.println("3-Gestion de vehiculos");
        System.out.println("4-Gestion de poliza");
        System.out.println("5-Gestion de cuotas");

    }

    public void crearPoliza() {
        Poliza poliza = new Poliza();
//        poliza.setCliente(crearCliente());
//        poliza.setAuto(crearVehiculo());
        System.out.println("Ingrese el monto asegurado");
        poliza.setMontoAsegurado(leer.nextDouble());
        System.out.println("Ingrese Fecha de inicio");
        poliza.setFechaInicio(crearFecha());
        System.out.println("Ingrese Fecha de final:");
        poliza.setFechaFin(crearFecha());
        System.out.println("Ingrese la cantidad de cuotas");
        poliza.setCantCuotas(leer.nextInt());
        List<Cuota> cuotas = new ArrayList<>();

    }

    public Cliente crearCliente() {
        Cliente cliente = new Cliente();
        System.out.println("Ingrese los datos del Cliente");
        System.out.println("Nombre:");
        cliente.setNombre(leer.next());
        System.out.println("Apellido:");
        cliente.setApellido(leer.next());
        System.out.println("DNI:");
        cliente.setDni(leer.nextInt());
        System.out.println("Email:");
        cliente.setMail(leer.next());
        System.out.println("Domicilio:");
        cliente.setDomicilio(leer.next());
        System.out.println("Telefono:");
        cliente.setTelefono(leer.nextInt());
        return cliente;
    }

    public Vehiculo crearVehiculo() {
        Vehiculo vehiculo = new Vehiculo();
        System.out.println("Ingrese los datos del Vehiculo");
        System.out.println("Marca:");
        vehiculo.setMarca(leer.next());
        System.out.println("Modelo:");
        vehiculo.setModelo(leer.next());
        System.out.println("Año:");
        vehiculo.setAno(leer.nextInt());
        System.out.println("numero de motor:");
        vehiculo.setMotor(leer.next());
        System.out.println("Numero de chasis:");
        vehiculo.setChasis(leer.next());
        System.out.println("Color:");
        vehiculo.setColor(leer.next());
        System.out.println("Tipo:");
        for (Tipo tipo : Tipo.values()) {
            System.out.println(tipo.ordinal() + "-" + tipo);
        }
        int tipoelegido = leer.nextInt();
        int cont = 0;
        do {
            if (tipoelegido >= 0 || tipoelegido <= Tipo.values().length) {
                vehiculo.setTipo(Tipo.values()[tipoelegido]);
                cont++;
            } else {
                System.out.println("Elige una opcion valida");
            }
        } while (cont == 0);
        return vehiculo;
    }

    public Date crearFecha() {
        System.out.println("Ingrese el dia:");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año:");
        int anio = leer.nextInt();
        Date fechaFinal = new Date();
        fechaFinal.setDate(dia);
        fechaFinal.setMonth(mes - 1);
        fechaFinal.setYear(anio - 1900);
        System.out.println(fechaFinal);
        return fechaFinal;
    }

    public Cuota crearCuotas(Poliza poliza) {

//        System.out.println("Ingrese la forma de pago");
//        
//        for (FormaPago forma : FormaPago.values()) {
//            System.out.println(forma.ordinal() + "-" + forma);
//        }
//        int formaElegida = leer.nextInt();
//        int cont = 0;
//        do {
//            if (formaElegida >= 0 || formaElegida <= FormaPago.values().length) {
//                FormaPago.set(FormaPago.values()[formaElegida]);
//                cont++;
//            } else {
//                System.out.println("Elige una opcion valida");
//            }
//        } while (cont == 0);
        double valorCuota = poliza.getMontoAsegurado()
        for (int i = 0; i < cantCuota; i++) {
            
            Cuota cuota = new Cuota();
            cuota.setNumCuotas(i + 1);
            cuota.getMontoCuota()

        }

    }


}
