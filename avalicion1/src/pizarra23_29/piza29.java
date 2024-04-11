package pizarra23_29;

import java.util.Scanner;

public class piza29 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int num, cont, multi = 0;

		for (cont = 3; cont <= 8; cont++) {
			System.out.println("Multiplos de " + cont + ": ");

			for (num = 20; num >= 20 && num <= 50; num++) {
				multi = num % cont;
				
				if (multi == 0 ) {
		
					System.out.println(num);
				}
				

			}
			
			teclado.nextLine();
		}
		teclado.close();
	}
}