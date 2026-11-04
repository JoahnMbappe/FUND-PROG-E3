/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_arreglos;

/**
 *
 * @author Usuario
 */
public class Eva3_2_arreglos {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int[] arreglo,x,y ; //todos son son arreglos
     // int arreglo[],x,y; solo un arreglo "arreglo []"
     arreglo = new int[10]; //arreglo con 10 enteros
   //  arreglo[10]=100; el indice es incorrecto ,el 10 no es una posicion valida (llega hasta el 9)
   //el uso de arreglos va ligado al uso de ciclos
   //en particular el ciclo for
   for(int i = 0; i < 10; i++){
     
      arreglo[i] = (int) (Math.random() * 100); //casting, convertir un double en un entero, deben ser compatibles
     
   }
   for(int i = 0; i < 10; i++){
      System.out.print(arreglo[i] + " - ");
   }
   }
   
}
