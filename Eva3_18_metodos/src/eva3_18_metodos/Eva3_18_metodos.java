/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_18_metodos;

/**
 *
 * @author bisonte
 */
public class Eva3_18_metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //llamar o invocar el metodo
        mostrarMensaje("Hola mundo");
        mostrarMensaje("Joahn Mbappe");
        mostrarMensaje("Fundamentos de programacion");
        mostrarMensaje("SISTEMAS COMPUTACIONALES");
        //que hacer con metodos que regresan valores
        //1. recuperar el valor para usarlo despues
        int resultado = sumar(10,20);
        System.out.println("Suma de 10 + 20 = "+ resultado);
        //2. Usarlo directamente
        System.out.println("Suma de 10 + 20 = "+ sumar(10,20));
        //3. no importa el valor de retorno
        sumar(10,20);
    }
    //modificadores, valor de retorno
                             //debe ser un verbo
                             //varias palabras: iniciar en minusculas, demas iniciar en mayusculas
    public static void mostrarMensaje(String mensaje){ //cabecera
        //cuerpo del metodo o implementacion
        System.out.println(mensaje);
    }
    public static int sumar(int val1, int val2){
    int resu = val1 + val2;
    return resu;
    
}
    
}
