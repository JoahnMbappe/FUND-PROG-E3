/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_arreglos_multi;

/**
 *
 * @author Usuario
 */
public class Eva3_10_arreglos_multi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //UN ARREGLO PUEDE TENER MULTIPLES DIMENSIONES:
        //ARREGLO DE UNA DIMENSION:
        int datos[] = new int [10]; //[][][][][][]..........
        //arreglo de dos dimensiones (Matriz)
        //FILAS //COLUMNAS
        int matriz[][] = new int[3][5];
        /*
        [][][]
        [][][]
        [][][]
        */
        for(int i = 0; i < matriz.length; i++){//Filas
              for(int j = 0; j < matriz[i].length; j++){//Columnas
             matriz[i][j] = (int)(Math.random()* 100);
              }
        }
       for(int i = 0; i < matriz.length; i++){//Filas
              for(int j = 0; j < matriz[i].length; j++){//Columnas
                  System.out.println("["+ matriz[i][j] + "]");
              }
        System.out.println("");
    }
    
}
}