package pizarra01_07;

import java.util.Scanner;

public class piza03 {

	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);

		int num;

		System.out.print("Dame un número menor que 20: ");
		num = teclado.nextInt();

		while (num <= 20) {
		System.out.println(num);
		num++;
			
		}
		teclado.close();
	}

}
