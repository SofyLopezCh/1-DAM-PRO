package compilador26_34;

import java.util.Scanner;

public class compi30 {

	public static void main(String[] arg) {

		Scanner teclado = new Scanner(System.in);

		int cont1 = 1;
		int cont2 = 1;
		int suma1 = 0, suma2 = 0;
		
		System.out.println("PRIMERA Lista");
		while (cont1 <= 4) {
			System.out.print("Dame valor " + cont1 + ": ");
			suma1 += teclado.nextInt();
			cont1++;
			
		}
		System.out.println(" ");
		
		System.out.println("SEGUNDA Lista");	
		
		while (cont2 <=4) {
			System.out.print("Dame valor " + cont2 + ": ");
			suma2 += teclado.nextInt();
			cont2++;
			
		}
		

		System.out.println(" ");
		System.out.println("TOTAL Lista 1: " + suma1);
		System.out.println("TOTAL Lista 2: " + suma2);
		
		if (suma1 > suma2) {
			System.out.println("Lista 1 MAYOR");
		} else if (suma2 > suma1) {
			System.out.println("Lista 2 MAYOR");
		} else {
			System.out.println ("Listas IGUALES");
		}
		
			
	 	teclado.close();
		}

	}

