package principal;

import com.redsocial.dominio.mascota.MascotaService;
import com.redsocial.dominio.usuario.Usuario;
import com.redsocial.dominio.usuario.UsuarioService;
import java.util.Scanner;

public class Principal {
  
    public static void main(String[] args) {
        
        UsuarioService usuarioService = new UsuarioService();
        MascotaService mascotaService = new MascotaService();

        
        try {
            //Creamos  usuarios
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println("Ingresar Usuario:");
            String usuario = leer.next();
            System.out.println("Ingresar Clave:");
            String clave = leer.next();
            
            usuarioService.crearUsuario(usuario, clave);
            //usuarioService.crearUsuario("tincho@hotmail.com", "eggprogramacion");
            usuarioService.imprimirUsuarios();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
        
        
        try {
            //Modificamos un usuario
            usuarioService.modificarClaveUsuario("fiorde@hotmail.com", "fiorde15", "fiorde15");
            usuarioService.imprimirUsuarios();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
        
        
        try {
            //Eliminamos un usuario
            usuarioService.eliminarUsuario("fiorde@hotmail.com");
            usuarioService.imprimirUsuarios();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
        
        
        try {
            //Buscamos el Usuario por correo
            Usuario usuario = usuarioService.buscarUsuarioPorCorreoElectronico("tincho@hotmail.com");
            //Creamos Mascota con el Usuario anterior
            mascotaService.crearMascota("Chiquito", "Beagle", usuario);

            //Mostramos Mascota con su Usuario
            mascotaService.imprimirMascotas();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
        
        
    }
}
