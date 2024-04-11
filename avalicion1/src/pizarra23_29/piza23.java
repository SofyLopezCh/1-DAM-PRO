package pizarra23_29;

import java.util.Scanner;

public class piza23 {
	
	public static void main(String[]args) {
		Scanner teclado =  new Scanner(System.in);
		
		int num;
		
		System.out.print("Dame un número: ");
		num = teclado.nextInt();
		
		while (num >= 10 && num <=50) {
			System.out.print("Dame otro número: ");
			num = teclado.nextInt();
		} 
			System.out.println("O número " + num + " non esta entre 10 e 50");
			
		 teclado.close();
	}

}
