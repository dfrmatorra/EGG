/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.
 */
package Servicio;

import Entidades.Pelicula;
import Entidades.Espectador;
import Enumeradores.Columna;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CinePeliculaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Pelicula peli = new Pelicula();
    List<Espectador> espectadores = new ArrayList<>();
    String[][] sala = new String[8][6];
    String ocupado = "";
    Espectador esp = new Espectador();

    public void crearSala() {

        for (int i = sala.length - 1; i >= 0; i--) {
            for (int j = 0; j < sala[i].length; j++) {
                Random random = new Random();
                int aleat = random.nextInt(2);
                if (aleat == 0) {
                    ocupado = " ";
                    sala[i][j] = String.valueOf(i + 1) + Columna.values()[j] + ocupado;
                } else {
                    ocupado = "X";
                    sala[i][j] = String.valueOf(i + 1) + Columna.values()[j] + ocupado;
                }

            }
        }

    }

    public void crearmenu() {
        int opc = 0;
        do {
            System.out.println("------------------------------");
            System.out.println("             MENU");
            System.out.println("1- Ingresar datos de pelicula");
            System.out.println("2- Ingresar datos de espectadores");
            System.out.println("3- Compra de tickets");
            System.out.println("4- Mostrar ocupacion de la sala");
            System.out.println("5- Mostrar Pelicula");
            System.out.println("6- Mostrar espectadores con tickets");
            System.out.println("7- Salir");
            System.out.println("------------------------------");
            System.out.println("Eliga una opcion:");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    crearPelicula();
                    break;
                case 2:
                    crearEspectador();
                    break;
                case 3:
                    comprarTicket();
                    break;
                case 4:
                    mostrarSala();
                    break;
                case 5:
                    mostrarPeli();
                    break;
                case 6:
                    mostrarEspectadores();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
                    ;
            }
        } while (opc != 7);
    }

    public void crearPelicula() {

        peli.setTitulo("Terminator");
        peli.setDuracion(2);
        peli.setEdadMinima(16);
        peli.setDirector("Cameron");
        peli.setPrecio(1000);

//        System.out.println("Ingrese el nombre de la pelicula:");
////        peli.setTitulo(leer.next());
//        System.out.println("Ingrese la duracion de la pelicula:");
////        peli.setDuracion(leer.nextDouble());
//        System.out.println("Ingrese la edad minima para ver la pelicula:");
////        peli.setEdadMinima(leer.nextInt());
//        System.out.println("Ingrese el director de la pelicula:");
////        peli.setDirector(leer.next());
//        System.out.println("Ingrese el precio de la pelicula");
////        peli.setPrecio(leer.nextDouble());
    }

    public void crearEspectador() {
        esp.setNombre("Dario");
        esp.setDni(27175857);
        esp.setDinero(1000);
        esp.setEdad(44);
        esp.setAsiento("");
        espectadores.add(esp);
        esp.setNombre("Fernando");
        esp.setDni(28175857);
        esp.setDinero(900);
        esp.setEdad(17);
        esp.setAsiento("");
        espectadores.add(esp);
//        System.out.println("Ingrese el nombre del espectador");
//        String nombre = leer.next();
//        System.out.println("Ingrese el numero de DNI del espectador");
//
//        int dni = leer.nextInt();
//        System.out.println("Ingrese la edad del espectador");
//        int edad = leer.nextInt();
//        System.out.println("Ingrese el dinero que dispone el espectador");
//        double dinero = leer.nextDouble();
//        String asiento = " ";
//        espectadores.add(new Espectador(dni, nombre, edad, dinero, asiento));
    }

    public void comprarTicket() {
//        System.out.println("Ingrese el DNI del espectador");
//        int id = leer.nextInt();
//        }
        boolean resp = false;

        if (espectadores.size() == 0) {
            System.out.println("No se cargaron espectadores");
            resp = true;
        } else {
            do {
                for (Espectador esp : espectadores) {
                    System.out.println(espectadores.indexOf(esp) + " " + esp);
                }
                System.out.println("------------------");

                System.out.println("Eliga espectador:");
                int id = leer.nextInt();

                for (int i = 0; i < espectadores.size(); i++) {
                    if (i == id) {
                        id = espectadores.get(i).getDni();
                    }
                }

                for (Espectador aux : espectadores) {
                    //1-verifico la edad y dinero para ver si puede comprarel ticket:
                    if (aux.getDni() == id && aux.getEdad() >= peli.getEdadMinima() && aux.getDinero() >= peli.getPrecio()) {
                        mostrarSala();
                        System.out.println("Elija fila");
                        int filaElegida = leer.nextInt();
                        System.out.println("Elija columna");
                        //asigno valor del enum a la variable de acuerdo a la fila elegida:
                        Columna columnaElegida = Columna.valueOf(leer.next().toUpperCase());
                        //obtengo la posicion de la letra, la paso a numero de la posicion:
                        int valorColumna = columnaElegida.getPosicion();
                        String aux2 = sala[filaElegida - 1][valorColumna];
                        //verifico si el asiento esta ocupado, al revisar si la variable contiene una x:
                        if (aux2.toLowerCase().contains("x")) {
                            System.out.println("El asiento esta ocupado");
                            //si esta libre le agrego una "x" y le asigno el asiento al espectador en su atributo asiento: 
                        } else {
                            System.out.println("Asiento asignado");
                            sala[filaElegida - 1][valorColumna] = aux2+"X";
                            aux.setAsiento(aux2);
                            resp = true;
                        }
                        //2- si no tiene la edad maxima muestro mensaje y sale del loop:
                    } else if (aux.getEdad() < peli.getEdadMinima()) {
                        System.out.println("Es menor de edad");
                        resp = true;
                        //3- si no tiene dinero suficiente muestro mensaje y sale del loop:
                    } else if (aux.getDinero() < peli.getPrecio()) {
                        System.out.println("No tiene dinero suficiente");
                        resp = true;
                    }

                }
            } while (!resp);
        }
    }

    public void mostrarSala() {
        System.out.println("----------------------");
        for (int i = sala.length - 1; i >= 0; i--) {
            for (int j = 0; j < sala[i].length; j++) {
                System.out.print("  " + sala[i][j]);
            }
            System.out.println("");
        }
    }

    public void mostrarPeli() {
        System.out.println("----------------------");
        System.out.println("------PELICULA--------");
        System.out.println(peli.toString());
        System.out.println("----------------------");
    }

    public void mostrarEspectadores() {
        int cont = 0;
        System.out.println("----------------------");
        for (Espectador espectador : espectadores) {
            String asientoEstado = espectador.getAsiento();
            if (!asientoEstado.equalsIgnoreCase("")) {
                System.out.println("El espectador " + espectador + " tiene el asiento: " + espectador.getAsiento());
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("No hay espectadores con asientos asignados");
        }
        System.out.println("----------------------");
    }
}
