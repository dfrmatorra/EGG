/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *
 * @author Dario
 */
public class ejercicioExtra3b {
    public static void main(String[] args) {
        int vec[]= new int[10];
        cargarArreglo(vec);
        System.out.println("El vector Aleatorio es ");
        mostrarVec(vec);
        System.out.println(" ");
    }
    

public static void cargarArreglo(int vec[]){
for (int i = 0; i < 10; i++) {
            vec[i] = (int) (Math.random()*10);
}
}
public static int[] mostrarVec(int vec[]){
    for (int i = 0; i < 10; i++) {
        System.out.print(" " +vec[i]);
    }

return vec;
}


}