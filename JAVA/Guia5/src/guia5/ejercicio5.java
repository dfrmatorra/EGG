/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia5;

/**
 *
 * @author Dario
 */
public class ejercicio5 {

   public static void main(String[] args) {
      
     int[][] matriz ={{0,-2,4},{2,0,2},{-4,-2,0}};
     
     int[][] matriz2={{0,2,-4},{-2,0,-2},{4,2,0}};
     int contador=0;
      for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               
                if(matriz2[j][i]== matriz[i][j]){
                contador++;
          
            }
            }
        }if (contador==9) {
           System.out.println("la matriz es at es antisimetrica");  
        }else{ 
            System.out.println("la matriz no es antisimetrica");
        }
       
    
    
}
}