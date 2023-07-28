/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
se utilizan las siguientes funciones de Java Substring(), Length(), equals().

 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        boolean condicion;
        int longitud, valido, invalido;
        valido = 0;
        invalido = 0;
        condicion = true;
      
        
        do {
            System.out.println("Ingrese el codigo RS232");
            palabra = leer.nextLine();
            if (palabra.equalsIgnoreCase("&&&&&") ) {
                condicion = false;}
            else{

            longitud = palabra.length();

            if (longitud == 5 && palabra.substring(0, 1).equalsIgnoreCase("X")  && palabra.substring(4, 5).equalsIgnoreCase("O")) {
                valido = valido + 1;}
            
            else {
                invalido = invalido + 1;
            }
            }
        }
            while (condicion == true);
        System.out.println("La cantidad de lecturas correctas fueron: " + valido + ". La cantidad de lecturas icorrectas fueron: "+ invalido);
        
        }

        }

    

