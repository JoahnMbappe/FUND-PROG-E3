/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_17_problema5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva3_17_Problema5 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      String[] ciudad = {"Chihuahua", "Monterrey", "Jalisco", "Tamaulipas","iztapalapa"};
      double[][] temp = new double[5][7];
      Scanner captu = new Scanner(System.in);
      for(int i= 0; i<ciudad.length; i++){
         System.out.print("temperatura de los 7 dias de "+ciudad[i]+":");
         for(int j = 0; j<7; j++){
               System.out.print("Dia "+ (j+1)+":");
               temp[i][j] = captu.nextDouble();
         }
        
         
      }
       for(int i = 0; i <ciudad.length; i++){
            double suma = 0;
            for(int j= 0; j<7; j++){
               suma += temp[i][j];
            }
            double promedio = suma / 7;
            System.out.printf("Ciudad: %s - Temperatura Promedio: %.2f Grados Centigrados\n", ciudad[i], promedio);
       }
   }
   
}
