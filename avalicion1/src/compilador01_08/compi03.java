package compilador01_08;

import java.util.Scanner;

public class compi03 {
	public static void main(String[] ar) {
		int base, altura, area;
		Scanner teclado = new java.util.Scanner(System.in);

		System.out.print("\nDame a base: ");
		base = teclado.nextInt();

		System.out.print("Dame a altura: ");
		altura = teclado.nextInt();
		
	//	area = base * altura / 2 ;
		System.out.print("Area dun triangulo: " + (float)(altura * base)/2);
		teclado.close();
	}
}