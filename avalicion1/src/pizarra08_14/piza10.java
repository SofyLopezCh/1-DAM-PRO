package pizarra08_14;

import java.util.Scanner;

public class piza10 {
	public static void main (String[] arg) {
		Scanner teclado = new Scanner(System.in);
		int num, b;
		
		System.out.print("Dame un nº menor de 20: ");
		b = teclado.nextInt();
		
		for (num=b; num <=20; num++) {
		System.out.println(num);
		
		teclado.close();			
		}
		
	}
}
