package pizarra23_29;

import java.util.Scanner;

public class piza25 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num, cont1 = 0, cont2 =0;
		
		System.out.print("Dame un nº: ");
		num = teclado.nextInt();
		
		while (num >=1 && num <= 100)
			if ( num >= 1 && num <= 50) {
				cont1++;
			}
		
			else if (num >=51 && num <=100) {
				cont2++;
			}
		System.out.println("Entre 1 e 50 " + cont1);
		System.out.println("Entre 51 e 100 " + cont2);
				
		teclado.close();
		
		
	}
	

}
