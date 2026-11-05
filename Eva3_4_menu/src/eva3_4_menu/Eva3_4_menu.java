/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_menu;

/**
 *
 * @author Usuario
 */
public class Eva3_4_menu {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      String[] menu = {"tacos","tortas","tamales","tlacoyos","tlayudas"};
      
      System.out.println("cantidad de elementos del arreglo: " +menu.length);
      for(int i = 0; i < menu.length; i++){
     System.out.println(i + " - ");
   }
   }
   
}

