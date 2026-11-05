
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_captura;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva3_6_captura {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner captu = new Scanner(System.in);
      String nombres[];
      int edad[];
      int cant;

      System.out.println("Cantidad de clientes a capturar");
      cant = captu.nextInt();
      captu.nextLine();

      nombres = new String[cant];
      edad = new int[cant];

      for(int i = 0; i < cant; i++){
         System.out.println("Introduce el nombre del cliente: ");
         nombres[i] = captu.nextLine();

         System.out.println("Introduce la edad del cliente: ");
         edad[i] = captu.nextInt();
         captu.nextLine();
      }

      System.out.println("DATOS GUARDADOS");

      for(int i = 0; i < cant; i++){
         System.out.println("Nombre: " + nombres[i] + ", edad: " + edad[i]);
      }

   }

}
