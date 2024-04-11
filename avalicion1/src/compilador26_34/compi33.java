package compilador26_34;

import java.util.Scanner;

public class compi33 {
    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);

        int num;
        int ultimos3 = 0;

        for (int cont = 1; cont <= 6; cont++) {
            System.out.print("Ingrese valor " + cont + ": ");
            num = teclado.nextInt();
            
            if (cont >= 4) {
                ultimos3 += num;
            }
        }

        System.out.println("La suma de los 3 ultimos valores es: " + ultimos3);

        teclado.close();
    }
}