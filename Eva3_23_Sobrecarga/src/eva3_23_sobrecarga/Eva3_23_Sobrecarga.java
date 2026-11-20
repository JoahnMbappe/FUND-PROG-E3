/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_23_sobrecarga;

/**
 *
 * @author bisonte
 */
public class Eva3_23_Sobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimir("Hola mundo");
        imprimir("Hola", "Joahn Mbappe");
        imprimir(1000);
    }
    //Sobrecarga de metodos
    //firma
    public static void imprimir(String mensaje) {//imprimir(String)
        // TODO code application logic here
        System.out.println(mensaje);
    }
    public static void imprimir(String mensaje, String mensaje2) {
        // TODO code application logic here
        System.out.println(mensaje + " - "+ mensaje2);
    }
    public static void imprimir(int mensaje) {//imprimir(int)
        // TODO code application logic here
        System.out.println(mensaje);
    }
}
