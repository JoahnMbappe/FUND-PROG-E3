/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_16_problema4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva3_16_problema4 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int [][] asistencia= new int [3][5];
      String dias[] = {"Lunes","Martes","Miercoles","Jueves","Viernes"};
      Scanner captu = new Scanner(System.in);
      
      for(int i = 0; i < 3; i++){
         System.out.println("Estudiante: "+ (i+1)+ ":");
         for(int j = 0; j<5; j++){
            System.out.print("Asitencia para: " + dias[j] + "(1= ASISTIO , 0= NO ASISTIO)");
            asistencia[i][j] = captu.nextInt();
         }
         
      }
      for(int i = 0; i<3; i++){
         int asistencias = 0;
         int inasistencia = 0;
          for(int j = 0; j<5; j++){
             if(asistencia[i][j] == 1){
             asistencias++;
          }else{
                inasistencia++;
             }
             
          }
         System.out.println("Estudiante " + (i + 1) + " -> Asistencias: " + asistencias + ", Inasistencias: " + inasistencia);
      }
   }
   
}
