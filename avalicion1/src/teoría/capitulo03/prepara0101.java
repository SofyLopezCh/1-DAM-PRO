package teoría.capitulo03;

import java.util.Scanner;

public class prepara0101 { 

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int short1, double1;
		System.out.print("Ingrese el short: ");
		short1 = teclado.nextInt();

		while (short1 < 999999 || short1 > -9999999) {

			double1 = short1 + 65536;

			if (short1 < 0) {
				double1 = double1 + 65536;
			}
			System.out.println("Su double es: " + double1);
			teclado.nextLine();
			System.out.print("Ingrese el short: ");
			short1 = teclado.nextInt();
			

		}
		teclado.close();

	}
}