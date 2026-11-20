
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_21_temperatura;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class Eva3_21_Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);

        // Pedir grados centigrados
        System.out.println("Grados centigrados: ");
        double centi = captu.nextDouble();

        // Convertir de Celsius a Fahrenheit
        System.out.println(centi + "°C = " + convertirCaF(centi) + "°F");

        // Pedir grados Fahrenheit
        System.out.println("Grados farenheit: ");
        double farenheit = captu.nextDouble();

        // Convertir de Fahrenheit a Celsius
        System.out.println(farenheit + "°F = " + convertirFaC(farenheit) + "°C");

        // Pedir grados Kelvin
        System.out.println("Grados kelvin: ");
        double kelvin = captu.nextDouble();

        // Convertir de Kelvin a Celsius
        System.out.println(kelvin + "°K = " + convertirKaC(kelvin) + "°C");
    }

    // Metodo para convertir de Celsius a Fahrenheit
    public static double convertirCaF(double centi) {
        double resu = centi * 1.8 + 32;
        return resu;
    }

    // Metodo para convertir de Fahrenheit a Celsius
    public static double convertirFaC(double farenheit) {
        double resu = (farenheit - 32) / 1.8;
        return resu;
    }

    // Metodo para convertir de Celsius a Kelvin
    public static double convertirCaK(double centi) {
        return centi + 273.15;
    }

    // Metodo para convertir de Kelvin a Celsius
    public static double convertirKaC(double kelvin) {
        return kelvin - 273.15;
    }
}
