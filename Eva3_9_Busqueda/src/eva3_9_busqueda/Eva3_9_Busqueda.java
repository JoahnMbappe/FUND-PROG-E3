
package eva3_9_busqueda;

import java.util.Scanner;

public class Eva3_9_Busqueda {

    public static void main(String[] args) {

        Scanner captu = new Scanner(System.in);
        boolean encontrar;
        int valor;
        int[] valores = new int[10];

        // Generar números aleatorios
        for(int i = 0; i < valores.length; i++){
            valores[i] = (int)(Math.random() * 100);
        }

        // Mostrar los valores del arreglo
        for(int i = 0; i < valores.length; i++){
            System.out.print("[" + valores[i] + "]");
        }

        do {
            encontrar = false;

            // Pedir el valor
            System.out.println("INTRODUCE EL VALOR A BUSCAR EN EL ARREGLO:");
            valor = captu.nextInt();

            // Buscar el valor
            for(int i = 0; i < valores.length; i++){

                if(valor == valores[i]){
                    System.out.println("ENCONTRASTE EL VALOR: ESTA EN LA POSICION: " + i);
                    encontrar = true;
                    break;
                }
            }

            // Si no se encuentra
            if(encontrar == false){
                System.out.println("EL VALOR NO SE ENCUENTRA EN EL ARREGLO");
            }

        } while(encontrar ==false);

    }
}
