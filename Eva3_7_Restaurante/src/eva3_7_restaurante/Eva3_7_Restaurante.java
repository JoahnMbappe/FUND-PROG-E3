
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_restaurante;

 /**
 *
 * @author Usuario
 */
public class Eva3_7_Restaurante {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here

      String productos[];
      double precios[];

      productos = new String[10];
      precios = new double[10];

      productos[0] = "Tacos";
      productos[1] = "Tortas";
      productos[2] = "Tamales";
      productos[3] = "Enchiladas";
      productos[4] = "Quesadillas";
      productos[5] = "Burritos";
      productos[6] = "Tlayudas";
      productos[7] = "Pozole";
      productos[8] = "Hamburguesas";
      productos[9] = "Refrescos";

      precios[0] = 25.50;
      precios[1] = 45.00;
      precios[2] = 18.50;
      precios[3] = 65.75;
      precios[4] = 30.00;
      precios[5] = 55.50;
      precios[6] = 70.00;
      precios[7] = 60.50;
      precios[8] = 85.90;
      precios[9] = 20.00;

      System.out.println("===== MENU DEL RESTAURANTE =====");

      for(int i = 0; i < productos.length; i++){
         System.out.println((i + 1) + " - " + productos[i]+ " - $" + precios[i]);
      }

   }

}

