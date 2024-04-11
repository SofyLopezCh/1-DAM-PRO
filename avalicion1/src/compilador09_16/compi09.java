package compilador09_16;

import java.util.Scanner;

public class compi09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicito los números enteros
        System.out.print("Dame número 1: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Dame número 2: ");
        int numero2 = scanner.nextInt();

        //Realizo las operaciones matemáticas
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int divisionentera = numero1 / numero2;
        int modulo = numero1 % numero2;
        float divisionreal = (float) numero1 / numero2;
        float mediareal = (float) (numero1 + numero2) /2;
           
       
        // Mostrar los resultados
        System.out.println("A suma e ------------> " + suma);
        System.out.println("A resta e -----------> " + resta +  ("(numero1 - numero2)"));
        System.out.println("A multiplicación e --> " + multiplicacion);
        System.out.println("A division entera e -> " + divisionentera +  ("(numero1 / numero 2)"));
        System.out.println("O modulo e ----------> " + modulo +  ("(numero1 % numero2)"));  //falta acabar de aquí en abajo
        System.out.println("A division real e----> " + divisionreal +  ("(numero1 / numero2)"));
        System.out.println("A media real e ------> " + mediareal);
                // Cerrar el scanner
        scanner.close();
        
    }
}