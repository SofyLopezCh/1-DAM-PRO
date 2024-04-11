package pizarra01_07;

import java.util.Scanner;

public class piza04 {
	public static void main (String [] arg) {
		int num, max= 20;
		
		Scanner teclado = new Scanner(System.in);
				
		System.out.print("Dame un número menor que 20: ");
		num = teclado.nextInt();
		
		while (num <= max) {
		System.out.println(max);
		max--;
		
		}
		teclado.close();
		
	}

}
