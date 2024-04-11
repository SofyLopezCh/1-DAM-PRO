package compilador26_34;

import java.util.Scanner;

public class compi34 {
	public static void main (String [] arg) {
	Scanner teclado = new Scanner(System.in);
	
	int nega = 0, posi = 0, multi5 = 0, multi2 = 0;
	
	for ( int cont = 1  ; cont <= 8    ; cont++      ) {
		
		System.out.print("Ingrese valor " + cont + ": ");
		int num = teclado.nextInt();
		
			if (num < 0) {
			nega++;
			} 
			if (num > 0) {
			posi++;
			}
			
			if (num % 5 == 0) {
				multi5++;
			}
			if (num % 2 == 0) {
				multi2 = multi2 + num;
			}
			
		}
	
	System.out.println("Cantidad de valores negativos: " + nega);
	System.out.println("Cantidad de valores positivos: " + posi);
	System.out.println("Cantidad de valores multiplos de 5: " + multi5);
	System.out.println("Suma de los valores pares: " + multi2);
	teclado.close();	
	
	}	
}

