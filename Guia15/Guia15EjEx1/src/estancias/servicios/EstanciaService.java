package estancias.servicios;

import estancias.entidades.Estancia;
import estancias.persistencia.EstanciaDAO;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author DarioF
 */
public class EstanciaService {
    
    private EstanciaDAO dao;

    public EstanciaService() {
        this.dao = new EstanciaDAO();
    }
    
    public void crearEstancia(int idEstancia, int idCliente, int idCasa, String nombreHuesped, Date fechaDesde, Date fechaHasta) throws Exception {

        try {
            //Validamos
            if (idEstancia <= 0) {
                throw new Exception("Debe indicar el idEstancia");
            }

            if (idCliente <= 0) {
                throw new Exception("Debe indicar el idCliente");
            }

            if (idCasa <= 0) {
                throw new Exception("Debe indicar el idCasa");
            }
                
            if (nombreHuesped == null || nombreHuesped.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombreHuesped");
           }
                
            if (nombreHuesped == null || nombreHuesped.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombreHuesped");
            }
            if (fechaDesde == null) {
                throw new Exception("Debe indicar la fechaDesde");
            }
            if (fechaHasta == null) {
                throw new Exception("Debe indicar la fechaHasta");
            }
 
            //Creamos el estancia
            Estancia estancia = new Estancia();
            estancia.setIdEstancia(idEstancia);
            estancia.setIdCliente(idCliente);
            estancia.setIdCasa(idCasa);
            estancia.setNombreHuesped(nombreHuesped);
            estancia.setFechaDesde(fechaDesde);
            estancia.setFechaHasta(fechaHasta);
            dao.crearEstancia(estancia);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarEstancia(int id, Estancia estancia2) throws Exception {

        try {

            //Validamos
            if (id <= 0) {
                throw new Exception("Debe ingresar un codigo valido");
            }

            //Buscamos
            Estancia estancia = buscarEstanciaPorCodigo(id);

            dao.modificarEstancia(estancia, estancia2);
        } catch (Exception e) {
            throw e;
        }
    }

    public Estancia buscarEstanciaPorCodigo(int id) throws Exception {

        try {

            //Validamos
            if (id <= 0) {
                throw new Exception("Debe ingresar un codigo valido");
            }
            Estancia estancia = dao.buscarEstanciaPorId(id);
            //Verificamos
            if (estancia == null) {
                throw new Exception("No se econtró la estancia indicada");
            }

            return estancia;
        } catch (Exception e) {
            throw e;
        }
    }

    public ArrayList<Estancia> listarEstancias() throws Exception {

        try {

            ArrayList<Estancia> estancias = dao.listarEstancias();

            return estancias;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirEstancias(int opc) throws Exception {

        try {

            //Listamos los estancias
            ArrayList<Estancia> estancias = listarEstancias();

            //Imprimimos los estancias
            if (estancias.isEmpty()) {
                throw new Exception("No existen estancias para imprimir");
            } else {
                if (opc == 1) {
                    for (Estancia p : estancias) {
                        System.out.println(p);
                    }
                }
                /*if (opc == 2) {
                    for (Estancia p : estancias) {
                        System.out.println(p.getCodigo() + " - " + p.getNombre().toString());
                    }
                }
                if (opc == 3) {
                    for (Estancia p : estancias) {
                        System.out.println(p.getCodigo() + " - " + "Nombre: " + p.getNombre() + " - Precio: "
                                + p.getPrecio());
                    }
                }
                if (opc == 4) {
                    for (Estancia p : estancias) {
                        if (p.getNombre().toLowerCase().contains("portátil")) {
                            System.out.println("Nombre: " + p.getNombre() + " - Precio: "
                                    + p.getPrecio());
                        }
                    }
                }
                if (opc == 5) {
                    System.out.println(dao.buscarEstanciaMasBarato());
                }*/
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarEstancia(int id) throws Exception {

        try {

            //Validamos 
            if (id <= 0) {
                throw new Exception("Debe indicar el id de la estancia");
            }
            dao.eliminarEstancia(id);
        } catch (Exception e) {
            throw e;
        }
    }
    
}
