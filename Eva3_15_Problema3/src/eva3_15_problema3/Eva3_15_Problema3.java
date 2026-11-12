/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_15_problema3;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Eva3_15_Problema3 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int[][] matriz = new int[5][5];
        Random random = new Random();

        // Llenar y mostrar matriz normal
        System.out.println(" Matriz Normal ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(10);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Imprimir matriz en orden inverso (desde la última fila/columna hasta la primera)
        System.out.println(" Matriz en Orden Inverso ");
        for (int i = 4; i >= 0; i--) {
            for (int j = 4; j >= 0; j--) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
   }
   
}
