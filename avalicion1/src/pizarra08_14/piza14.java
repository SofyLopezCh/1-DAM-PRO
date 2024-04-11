package pizarra08_14;

import java.util.Scanner;

public class piza14 {
	public static void main(String[] arg) {

		Scanner teclado = new Scanner(System.in);
		int num;

		System.out.print("Ingresa un nº: ");
		num = teclado.nextInt();

		for (int cont = 0; cont <= 10; cont++) {
			System.out.println(num + " x " + cont + ": " + num * cont);

		}

		teclado.close();
	}
}
