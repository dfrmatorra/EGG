package tienda.servicios;

import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author CASA
 */
public class FabricanteService {

    private FabricanteDAO dao;

    public FabricanteService() {
        this.dao = new FabricanteDAO();
    }

    public void crearFabricante(String nombre) throws Exception {

        try {
            //Validamos
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }

            //Creamos el fabricante
            Fabricante fabricante = new Fabricante();
            fabricante.setNombre(nombre);

            dao.crearFabricante(fabricante);

        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirFabricantes() throws Exception {

        try {

            //Listamos los fabricantes
            Collection<Fabricante> fabricantes = listarFabricantes();

            //Imprimimos los fabricantes
            if (fabricantes.isEmpty()) {
                throw new Exception("No existen fabricantes para imprimir");
            } else {
                for (Fabricante f : fabricantes) {
                    System.out.println(f.getCodigo() + " - " + f.getNombre());
                }

            }
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Fabricante> listarFabricantes() throws Exception {

        try {

            Collection<Fabricante> fabricantes = dao.listarFabricantes();

            return fabricantes;
        } catch (Exception e) {
            throw e;
        }
    }

}
