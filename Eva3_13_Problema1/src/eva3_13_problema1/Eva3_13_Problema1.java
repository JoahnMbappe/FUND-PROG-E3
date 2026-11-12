/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_problema1;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Eva3_13_Problema1 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
     

        int[] arreglo = new int[10];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Arreglo generado: ");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(10);
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        
        System.out.print("Ingresa un valor a buscar (0-9): ");
        int valorBuscado = scanner.nextInt();

        
        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                contador++;
            }
        }

        System.out.println("El valor " + valorBuscado + " se repite " + contador + " veces.");
        
    }
}
   
   

