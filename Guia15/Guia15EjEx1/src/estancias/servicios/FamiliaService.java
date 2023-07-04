package estancias.servicios;

import estancias.entidades.Familia;
import estancias.persistencia.FamiliaDAO;
import java.util.ArrayList;

/**
 *
 * @author CASA
 */
public class FamiliaService {

    private FamiliaDAO dao;

    public FamiliaService() {
        this.dao = new FamiliaDAO();
    }

    public void crearFamilia(int idFamilia, String nombreFamilia, int edadMinima,
            int edadMaxima, int numHijos, String emailFamilia, int idCasaFamilia) throws Exception {

        try {
            //Validamos
            if (idFamilia <= 0) {
                throw new Exception("Debe indicar el id de Familia");
            }

            if (nombreFamilia == null || nombreFamilia.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre de familia");
            }

            if (edadMinima <= 0) {
                throw new Exception("Debe indicar edadMinima");
            }

            if (edadMaxima <= 0) {
                throw new Exception("Debe indicar edadMaxima");
            }

            if (numHijos <= 0) {
                throw new Exception("Debe indicar numHijos");
            }
            if (emailFamilia == null || emailFamilia.trim().isEmpty()) {
                throw new Exception("Debe indicar emailFamilia");
            }
            if (idCasaFamilia <= 0) {
                throw new Exception("Debe indicar idCasaFamilia");
            }

            //Creamos la familia
            Familia familia = new Familia();
            familia.setIdFamilia(idFamilia);
            familia.setNombreFamilia(nombreFamilia);
            familia.setEdadMinima(edadMinima);
            familia.setEdadMaxima(edadMaxima);
            familia.setNumHijos(numHijos);
            familia.setEmailFamilia(emailFamilia);
            familia.setIdCasaFamilia(idCasaFamilia);
            dao.crearFamilia(familia);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarFamilia(int id, Familia familia2) throws Exception {

        try {

            //Validamos
            if (id <= 0) {
                throw new Exception("Debe ingresar un id valido");
            }

            //Buscamos
            Familia familia = buscarFamiliaPorCodigo(id);

            dao.modificarFamilia(familia, familia2);
        } catch (Exception e) {
            throw e;
        }
    }

    public Familia buscarFamiliaPorCodigo(int id) throws Exception {

        try {

            //Validamos
            if (id <= 0) {
                throw new Exception("Debe ingresar un id valido");
            }
            Familia familia = dao.buscarFamiliaPorId(id);
            //Verificamos
            if (familia == null) {
                throw new Exception("No se econtró la familia indicada");
            }

            return familia;
        } catch (Exception e) {
            throw e;
        }
    }

    public ArrayList<Familia> listarFamilias() throws Exception {

        try {

            ArrayList<Familia> familias = dao.listarFamilias();

            return familias;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirFamilias(int opc) throws Exception {

        try {

            //Listamos los familias
            ArrayList<Familia> familias = listarFamilias();

            //Imprimimos los familias
            if (familias.isEmpty()) {
                throw new Exception("No existen familias para imprimir");
            } else {
                if (opc == 1) {
                    for (Familia p : familias) {
                        System.out.println(p);
                    }
                }
                if (opc == 2) {
                    for (Familia f : familias) {
                        if (f.getNumHijos() >= 3 && f.getEdadMaxima() < 10) {
                            System.out.println(f);
                        }
                    }
                }/*
                if (opc == 3) {
                    for (Familia p : familias) {
                        System.out.println(p.getCodigo() + " - " + "Nombre: " + p.getNombre() + " - Precio: "
                                + p.getPrecio());
                    }
                }
                if (opc == 4) {
                    for (Familia p : familias) {
                        if (p.getNombre().toLowerCase().contains("portátil")) {
                            System.out.println("Nombre: " + p.getNombre() + " - Precio: "
                                    + p.getPrecio());
                        }
                    }
                }
                if (opc == 5) {
                    System.out.println(dao.buscarFamiliaMasBarato());
                }*/
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarFamilia(int id) throws Exception {

        try {

            //Validamos 
            if (id <= 0) {
                throw new Exception("Debe indicar el id de la familia");
            }
            dao.eliminarFamilia(id);
        } catch (Exception e) {
            throw e;
        }
    }

}
