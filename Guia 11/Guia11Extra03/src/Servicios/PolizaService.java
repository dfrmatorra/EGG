package Servicios;

import Entities.Cliente;
import Entities.Cuota;
import Entities.Poliza;
import Entities.Vehiculo;
import Enumeradores.FormaPago;
import Enumeradores.Tipo;
import Enumeradores.TipoCobertura;

import java.util.*;

public class PolizaService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Poliza> polizas = new ArrayList<>();

    public void crearPolizaEjemplo() {//para probar
        Poliza poli = new Poliza();
        Cliente client = new Cliente();
        client.setDni(27175857);
        poli.setCliente(client);
        Vehiculo auto = new Vehiculo();
        auto.setDueno(client);
        auto.setMarca("ford");
        auto.setModelo("fiesta");
        poli.setAuto(auto);
        Date fechaInicio = new Date();
        fechaInicio.setDate(30);
        fechaInicio.setMonth(5);
        fechaInicio.setYear(2023);
        poli.setFechaInicio(fechaInicio);
        Date fechaFin = new Date();
        fechaFin.setDate(30);
        fechaFin.setMonth(11);
        fechaFin.setYear(2023);
        poli.setFechaFin(fechaFin);
        poli.setMontoAsegurado(2000000);
        poli.setGranizo(true);
        poli.setNroPoliza(256355);
        ArrayList<Cuota> cuotas = new ArrayList<>();
        crearCuotas(poli, cuotas);
        poli.setCuotas(cuotas);
        polizas.add(poli);
    }

    public void menuPoliza() {
        crearPolizaEjemplo();//para probar
        boolean opc = true;
        do {
            System.out.println("-----MENU GRAL-----");
            System.out.println("1-Generar Poliza");
            System.out.println("2-Gestion integral de clientes");
            System.out.println("3-Salir");
            System.out.println("Eliga una opcion");
            int resp = leer.nextInt();
            switch (resp) {
                case 1:
                    crearPoliza();
                    break;
                case 2:
                    gestionCliente();
                    break;
                case 3:
                    opc = false;
                    break;
            }
        } while (opc);

    }

    public void crearPoliza() {

        Poliza poliza = new Poliza();
        List<Cuota> cuotas = new ArrayList<>();
        poliza.setCliente(crearCliente());
        poliza.setAuto(crearVehiculo());
        System.out.println("Ingrese el monto asegurado");
        poliza.setMontoAsegurado(leer.nextDouble());
        System.out.println("Ingrese Fecha de inicio");
        poliza.setFechaInicio(crearFecha());
        System.out.println("Ingrese Fecha de final:");
        poliza.setFechaFin(crearFecha());
        System.out.println("Ingrese la cantidad de cuotas");
        poliza.setCantCuotas(leer.nextInt());
        agregarGranizo(poliza);
        elegirCobertura(poliza);
        polizas.add(poliza);
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

    public Date crearFecha() { //lo tengo que mejorar TODO
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

    public void crearCuotas(Poliza poliza, List<Cuota> cuotas) {
        // Crea un objeto Calendar y asígnale la fecha de inicio de la poliza
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(poliza.getFechaInicio());

        double valorCuota = (poliza.getMontoAsegurado() * 0.05) / 12;

        for (int i = 0; i < poliza.getCantCuotas(); i++) {

            Cuota cuota = new Cuota();
            cuota.setNumCuotas(i + 1);
            cuota.setMontoCuota(valorCuota);
            cuota.setPagado(true);
            // Aumenta el mes en 1
            calendar.add(Calendar.MONTH, 1);
            // Obtiene la nueva fecha después de aumentar el mes
            Date nuevaFecha = calendar.getTime();
            cuota.setVencimiento(nuevaFecha);
            cuotas.add(cuota);
        }
    }

    public void agregarGranizo(Poliza poliza) {
        System.out.println("Ingrese si quiere agregar cobertura de granizo (s/n) ");
        String resp = leer.next();

        do {
            if (resp.equalsIgnoreCase("s")) {
                poliza.setGranizo(true);
            }
            if (resp.equalsIgnoreCase("n")) {
                poliza.setGranizo(false);
            } else {
                System.out.println("Ingrese un dato valido");
            }
        } while (!resp.equalsIgnoreCase("s") || !resp.equalsIgnoreCase("n"));

        if (poliza.getGranizo()) {
            poliza.setMaxGranizo(poliza.getMontoAsegurado() * 0.3);
        }
    }

    public void elegirCobertura(Poliza poliza) {
        System.out.println("Eliga el tipo de cobertura de la siguiente seleccion");
        for (TipoCobertura tipo : TipoCobertura.values()) {
            System.out.println(tipo.ordinal() + "-" + tipo);
        }
        int tipoelegido = leer.nextInt();
        int cont = 0;
        do {
            if (tipoelegido >= 0 || tipoelegido <= TipoCobertura.values().length) {
                poliza.setCobertura(TipoCobertura.values()[tipoelegido]);
                cont++;
            } else {
                System.out.println("Elige una opcion valida");
            }
        } while (cont == 0);
    }

    public void gestionCliente() {
        System.out.println("Ingrese DNI del cliente");
        int dniSelect = leer.nextInt();
        boolean opc = true;
        do {
        for (Poliza poliza : polizas) {
            if (dniSelect == poliza.getCliente().getDni()) {

                    System.out.println("-----MENU CLIENTE-----");
                    System.out.println("1-Gestionar pago");
                    System.out.println("2-Mostrar datos de Polizas");
                    System.out.println("3-Salir");
                    System.out.println("Eliga una opcion");
                    int resp = leer.nextInt();
                    switch (resp) {
                        case 1:
                            gestionarPago(poliza);
                            break;
                        case 2:
                            mostrarPoliza(poliza);
                            break;
                        case 3:
                            opc = false;
                            break;
                    }
                }
            }

        }while (opc);
    }

    public void mostrarPoliza(Poliza poliza) {
        System.out.println("Ingrese DNI del cliente");
        int dniSelect = leer.nextInt();
            if (dniSelect == poliza.getCliente().getDni()) {
                System.out.println(poliza.toString());
            }

        }
    public void gestionarPago(Poliza poliza) {
        for (Cuota cuota : poliza.getCuotas()) {
            System.out.println(cuota.getNumCuotas());
        }

        System.out.println("Elige cuota a pagar");
        int cuotaSelect = leer.nextInt();

        for (Cuota cuota : poliza.getCuotas()) {
            if (cuota.getNumCuotas() == cuotaSelect - 1) {
                if (cuota.getPagado()) {
                    System.out.println("La cuota" + (cuota.getNumCuotas() + 1) + "ya fue pagada");
                } else {
                    System.out.println("Elige la forma de pago:");
                    for (FormaPago formaPago : FormaPago.values()) {
                        System.out.println(formaPago.ordinal() + "-" + formaPago);
                    }
                    int formaElegida = leer.nextInt();
                    poliza.setFormaPago(FormaPago.values()[formaElegida]);
                    cuota.setPagado(true);
                    System.out.println("Pago realizado");
                }
            }
        }

    }

    private int validarEntero () {
        while (true) {
            try {
                return Integer.parseInt(leer.next());
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un número entero válido.\n");
            }
        }
    }

    private double validarDouble () {
        while (true) {
            try {
                return Double.parseDouble(leer.next());
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un número válido.\n");
            }
        }
    }

    private String validarString () {
        String entrada = leer.next();
        while (entrada.isEmpty()) {
            System.out.print("Ingrese un valor válido.\n");
            entrada = leer.next();
        }
        return entrada;
    }
}
