/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección.
Poner el código postal sin la letra, solo el numero.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al
usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap
 */
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DarioF
 */
public class CiudadService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    HashMap <Integer , String > codigos = new HashMap<>();
    
    
    
    public void crearCiudades (){
        
        codigos.put(12487, "Adlershof");
        codigos.put(4400,"Salta");
        codigos.put(1663,"San Miguel");
        codigos.put(2000, "Rosario");
        codigos.put(1824,"Lanus");
        codigos.put(5000,"Cordoba");
        codigos.put(1714,"Villa del Parque");     
        codigos.put(1826,"Lomas de Zamora");
    }
    
    public void mostrar (){
        
        for (Map.Entry<Integer, String> ciudad : codigos.entrySet()) {
            System.out.println("Codigo Postal:" + ciudad.getKey() + " / " + " Ciudad:" + ciudad.getValue());
        }
        
    }
    
    public void buscarCiudad (){
        
        System.out.println("Ingrese el codigo postal:");
        Integer ciudadBuscada = leer.nextInt();
        
        for (Integer codigo : codigos.keySet()) {
            if (codigos.containsKey(ciudadBuscada)){
                System.out.println("La ciudad es: " + codigos.get(ciudadBuscada));
                break;
            }
        }
                
}
    
}
