/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_22_areas;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class Eva3_22_Areas {
//1. CIRCULO
    //2.RECTANGULO
    //3. TRIANGULO
    //CALCULAR AREAS USAR METODOS PARA EL CALCULO DEL AREA DE CADA FIGURA, SOLICITAR LOS DATOS AL USUARIO (FIGURA Y VARIABLES DE LA FORMULA --> AREA, BASE, ETC.)
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int op = 4;
        do{
        System.out.println("Eliga una opcion(1.Area Circulo, 2.Area Rectangulo, 3.Area Triangulo, 4. Salir): ");
        op = captu.nextInt();
        switch(op){
            case 1:
               System.out.println("Teclee el radio: ");
                double rad = captu.nextDouble();
                System.out.println("El area del Circulo es: "+ circulo(rad));
                break;
            case 2: 
                 System.out.println("Teclee la base: ");
                double base = captu.nextDouble();
                System.out.println("Teclee la altura: ");
                double altura = captu.nextDouble();
                System.out.println("El area del Rectangulo es: " + rectangulo(base,altura));
                break;
                
            case 3:
                 System.out.println("Teclee la base: ");
                base = captu.nextDouble();
                System.out.println("Teclee la altura: ");
                altura = captu.nextDouble();
                System.out.println("El area del Rectangulo es: " + triangulo(base,altura));
                break;
            case 4:
        
                System.out.println("Saliste del sistema");
        }
        }while(op !=4);
        
    }
        
        
    
    public static double circulo(double rad){
        double resu = 3.1416 * (rad*rad);
        return resu;
    }
     public static double rectangulo(double base, double altura){
        double resu = base * altura;
           return resu;
    }
      public static double triangulo(double base, double altura){
        double resu = (base * altura) / 2;
           return resu;
    }
}
