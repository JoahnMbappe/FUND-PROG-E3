/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_14_problema2;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Eva3_14_Problema2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int[] arreglo = new int[10];
      Random random = new Random();
      int menor = arreglo[0];
      int mayor = arreglo[0];
      System.out.println("Arreglo generado");
      for(int i = 0; i < arreglo.length; i++){
         arreglo[i] = random.nextInt(100);
      }
      for(int i=1; i < arreglo.length; i++){
         if(arreglo[i] < menor){
            menor = arreglo[i];
            System.out.print(arreglo[i] + " ");
         }
         if(arreglo[i]> mayor){
            mayor = arreglo[i];
         }
      }
      System.out.println("El valor mas pequeno es: " + menor);
        System.out.println("El valor mas grande es: " + mayor);
   }
   
}
