package estancias.servicios;

import estancias.entidades.Casa;
import estancias.persistencia.CasaDAO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author CASA
 */
public class CasaService {

    private CasaDAO dao;

    public CasaService() {
        this.dao = new CasaDAO();
    }

    public void crearCasa(int idCasa, String calleCasa, int numeroCasa,
            String codigoPostalCasa, String ciudadCasa, String paisCasa,
            Date fechaDesdeCasa, Date fechaHastaCasa, int tiempoMinimo,
            int tiempoMaximo, double precioHabitacion, String tipoVivienda) throws Exception {

        try {
            //Validamos
            if (idCasa <= 0) {
                throw new Exception("Debe indicar el idCasa");
            }

            if (numeroCasa <= 0) {
                throw new Exception("Debe indicar el numeroCasa");
            }

            if (codigoPostalCasa == null || codigoPostalCasa.trim().isEmpty()) {
                throw new Exception("Debe indicar el codigoPostalCasa");
            }

            if (ciudadCasa == null || ciudadCasa.trim().isEmpty()) {
                throw new Exception("Debe indicar la ciudad");
            }

            if (paisCasa == null || paisCasa.trim().isEmpty()) {
                throw new Exception("Debe indicar el pais");
            }
            if (fechaDesdeCasa == null) {
                throw new Exception("Debe indicar la fechaDesde");
            }
            if (fechaHastaCasa == null) {
                throw new Exception("Debe indicar la fechaHasta");
            }
            if (tiempoMinimo <= 0) {
                throw new Exception("Debe indicar el tiempoMinimo");
            }
            if (tiempoMaximo <= 0) {
                throw new Exception("Debe indicar el tiempoMaximo");
            }
            if (precioHabitacion <= 0) {
                throw new Exception("Debe indicar el precio de la Habitacion");
            }
            if (tipoVivienda == null || tipoVivienda.trim().isEmpty()) {
                throw new Exception("Debe indicar el tipo de Vivienda");
            }
            //Creamos la casa
            Casa casa = new Casa();
            casa.setIdCasa(idCasa);
            casa.setCalleCasa(calleCasa);
            casa.setNumeroCasa(numeroCasa);
            casa.setCodigoPostalCasa(codigoPostalCasa);
            casa.setCiudadCasa(ciudadCasa);
            casa.setPaisCasa(paisCasa);
            casa.setFechaDesdeCasa(fechaDesdeCasa);
            casa.setFechaHastaCasa(fechaHastaCasa);
            casa.setTiempoMinimo(tiempoMinimo);
            casa.setTiempoMaximo(tiempoMaximo);
            casa.setPrecioHabitacion(precioHabitacion);
            casa.setTipoVivienda(tipoVivienda);

            dao.crearCasa(casa);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarCasa(int id, Casa casa2) throws Exception {

        try {

            //Validamos
            if (id <= 0) {
                throw new Exception("Debe ingresar un codigo valido");
            }

            //Buscamos
            Casa casa = buscarCasaPorCodigo(id);

            dao.modificarCasa(casa, casa2);
        } catch (Exception e) {
            throw e;
        }
    }

    public Casa buscarCasaPorCodigo(int id) throws Exception {

        try {

            //Validamos
            if (id <= 0) {
                throw new Exception("Debe ingresar un codigo valido");
            }
            Casa casa = dao.buscarCasaPorId(id);
            //Verificamos
            if (casa == null) {
                throw new Exception("No se econtró la casa indicada");
            }

            return casa;
        } catch (Exception e) {
            throw e;
        }
    }

    public ArrayList<Casa> listarCasas() throws Exception {

        try {

            ArrayList<Casa> casas = dao.listarCasas();

            return casas;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirCasas(int opc) throws Exception {

        try {

            //Listamos los casas
            ArrayList<Casa> casas = listarCasas();

            //Imprimimos los casas
            if (casas.isEmpty()) {
                throw new Exception("No existen casas para imprimir");
            } else {
                if (opc == 1) {
                    for (Casa c : casas) {
                        System.out.println(c);
                    }
                }
                if (opc == 2) {
                    ArrayList<Casa> casasAux = dao.buscarCasa1();
                    for (Casa c : casasAux) {
                        System.out.println(c);
                    }
                     
                }
            }
        }
        catch (Exception e) {
            throw e;
        }
        }

    

    public void eliminarCasa(int id) throws Exception {

        try {

            //Validamos 
            if (id <= 0) {
                throw new Exception("Debe indicar el id de la casa");
            }
            dao.eliminarCasa(id);
        } catch (Exception e) {
            throw e;
        }
    }

}
