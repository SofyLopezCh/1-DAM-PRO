package pizarra15_22;

import java.util.Scanner;

public class piza15 {
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("--Dame un nº A: ");
		num1=teclado.nextInt();
		
		System.out.print("Dame otro nº B: ");
		num2=teclado.nextInt();
		
		if (num1 > num2) {
			System.out.println("A é MAIOR que B");
		} else if (num1 < num2) {
			System.out.println("A é MENOR que B");
		} else 
			System.out.println("A é IGUAL que B");
		
		
		teclado.close();
	}
}
