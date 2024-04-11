package compilador01_08;

import java.util.Scanner;

public class compi08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedir la edad en meses de la primera persona
        System.out.print("Ingresa la edad en meses de Uxia: ");
        int edadEnMesesUxia = teclado.nextInt();

        // Pedir la edad en meses de la segunda persona
        System.out.print("Ingresa la edad en meses de Maruxa: ");
        int edadEnMesesMaruxa = teclado.nextInt();

        // Pedir la edad en meses de la tercera persona
        System.out.print("Ingresa la edad en meses de Anxo: ");
        int edadEnMesesAnxo = teclado.nextInt();

        // Calcular la edad en años y meses
        int añosUxia = edadEnMesesUxia / 12; // Dividimos meses por 12 para obtener años
        int mesesU = edadEnMesesUxia % 12;  // Usamos % para obtener los meses restantes

        int añosMaruxa = edadEnMesesMaruxa / 12;
        int mesesM = edadEnMesesMaruxa % 12;

        int añosAnxo = edadEnMesesAnxo / 12;
        int mesesA = edadEnMesesAnxo % 12;

        // Mostrar los resultados
        System.out.println("Edad de Uxia: " + añosUxia + " años y " + mesesU + " meses.");
        System.out.println("Edad de Maruxa: " + añosMaruxa + " años y " + mesesM + " meses.");
        System.out.println("Edad de Anxo: " + añosAnxo + " años y " + mesesA + " meses.");

        // Cerrar el scanner
        teclado.close();
    }
}