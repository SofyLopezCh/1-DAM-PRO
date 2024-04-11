package compilador26_34;

import java.util.Scanner;

public class compi31 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);

		int num, num2;
		int cont = 1;
		int pares = 0;
		int impares = 0;

		System.out.print("Cuantos numeros: ");
		num = teclado.nextInt();

		while (cont <= num) {

			System.out.print("Dame valor " + cont + ": ");
			num2 = teclado.nextInt();

			if (num2 % 2 == 0) {
				pares++;
			} else {

				impares++;

			}
			cont++;
		}
		System.out.println("Pares: " + pares);
		System.out.println("Impares: " + impares);
		
		teclado.close();

	}

}