/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_arreglos;

/**
 *
 * @author Usuario
 */
public class Eva3_1_arreglos {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //un arreglo es una estructura de datos
      //es una secuencia de valores
      //todos los datos son del mismo tipo
      //No cambia de tamaño (inmutable)
      //el acceso es por indices(acceso aleatorio)
      int [] arreglo; //solo declare el arreglo, todavia no existe
      //especificar el tamaño
      arreglo = new int[10]; //a partir de aqui, importa al conocer el tamaño de los datos int = 4 bytes //crear el arreglo "creamelo de enteros"
      //int[] arreglo = new int[10];
      //acceso es por indices
      //en java el primer elemento esta en la posicion cero 0
      //el ultimo es la posicion N - 1, donde N es la cantidad de elementos
      //0 1 2 3 4 5 6 7 8 9
      arreglo[0]= 100;
      arreglo[1]= 200;
      arreglo[2]= 300;
      arreglo[3]= 400;
      arreglo[4]= 500;
      arreglo[5]= 600;
      arreglo[6]= 700;
      arreglo[7]= 800;
      arreglo[8]= 900;
      arreglo[9]= 1000;
      System.out.println("arreglo [0]= "+ arreglo[0]);
      System.out.println("arreglo [1]= "+ arreglo[1]);
      System.out.println("arreglo [2]= "+ arreglo[2]);
      System.out.println("arreglo [3]= "+ arreglo[3]);
      System.out.println("arreglo [4]= "+ arreglo[4]);
      System.out.println("arreglo [5]= "+ arreglo[5]);
      System.out.println("arreglo [6]= "+ arreglo[6]);
      System.out.println("arreglo [7]= "+ arreglo[7]);
      System.out.println("arreglo [8]= "+ arreglo[8]);
      System.out.println("arreglo [9]= "+ arreglo[9]);
      
   }
   
}
