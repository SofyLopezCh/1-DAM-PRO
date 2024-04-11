package pizarra23_29;

import java.util.Scanner;

public class piza24 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num, multi, cont = 0;

		System.out.print("Dame un nº: ");
		num = teclado.nextInt();

		while (num >= 10 && num <= 50) {
			multi = num / 3;
			if (multi == 0) {
				cont++;

			}
			System.out.println("Ha introducido" + cont + "multiplos de 3 entre 10 e 50");

		}
		teclado.close();

	}
}
