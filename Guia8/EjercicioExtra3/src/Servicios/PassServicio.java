/*
● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
teclado)
● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
● Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO
● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
● A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
 */
package Servicios;

import Entidades.Pass;
import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class PassServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pass inicializarPass() {
        String nombre = "Dario";
        int dni = 25258852;
        String pass = "";
        return new Pass(pass, nombre, dni);
    }

    public void crearPass(Pass ps) {
        System.out.println("Ingrese el password:");
        String password = leer.next();
        int longitud = password.length();
        while (longitud != 10) {
            System.out.println("El password es incorrecto. Ingrese un password de 10 digitos:");
            password =leer.next();
        }
        ps.setPass(password);
    }
    
    public 
    
    

}
