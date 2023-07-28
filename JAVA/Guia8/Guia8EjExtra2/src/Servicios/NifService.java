/*
En NIFService se dispondrá de los siguientes métodos:

b) Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
letra que le corresponderá. Una vez calculado, le asigna la letra que
le corresponde según
c) Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
guion y la letra en mayúscula; por ejemplo: 00395469-F).
 */
package Servicios;

import Entidades.Nif;
import java.util.Scanner;

/**
 *
 * @author DarioF
 */
public class NifService {

    Scanner leer = new Scanner(System.in);
//b) Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
//letra que le corresponderá. Una vez calculado, le asigna la letra que
//le corresponde según

    public Nif crearNif() {
        String letra = "";
        String vector[] = new String[23];
        for (int i = 0; i < 22; i++) {
            switch (i) {
                case 0:
                    letra = "T";
                    break;
                case 1:
                    letra = "R";
                    break;
                case 2:
                    letra = "W";
                    break;
                case 3:
                    letra = "A";
                    break;
                case 4:
                    letra = "G";
                    break;
                case 5:
                    letra = "M";
                    break;
                case 6:
                    letra = "Y";
                    break;
                case 7:
                    letra = "F";
                    break;
                case 8:
                    letra = "P";
                    break;
                case 9:
                    letra = "D";
                    break;
                case 10:
                    letra = "X";
                    break;
                case 11:
                    letra = "B";
                    break;
                case 12:
                    letra = "N";
                    break;
                case 13:
                    letra = "J";
                    break;
                case 14:
                    letra = "Z";
                    break;
                case 15:
                    letra = "S";
                    break;
                case 16:
                    letra = "Q";
                    break;
                case 17:
                    letra = "V";
                    break;
                case 18:
                    letra = "H";
                    break;
                case 19:
                    letra = "L";
                    break;
                case 20:
                    letra = "C";
                    break;
                case 21:
                    letra = "K";
                    break;
                case 22:
                    letra = "E";
                    break;
            }
            vector[i] = letra;
        }
        System.out.println("Ingresar el dni");
        long dni = leer.nextLong();
        letra = vector[(int) (dni % 23)];
        return new Nif(dni, letra);
    }

//c) Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
//guion y la letra en mayúscula; por ejemplo: 00395469-F).
    public void mostrar(long dni, String letra){
        System.out.println( dni + " - " + letra);
    }
}
