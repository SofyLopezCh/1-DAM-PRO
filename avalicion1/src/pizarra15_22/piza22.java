package pizarra15_22;

import java.util.Scanner;

public class piza22 {
	public static void main (String[]arg) {
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Dame un primer nº: ");
		num1 = teclado.nextInt();
		
		System.out.print("Dame un segundo nº: ");
		num2 = teclado.nextInt();
		
		if (num1 < 0 && num2 <0) {
			System.out.println("Os dous son NEGATIVOS");
			
		} else if (num1 <0 || num2 <0) {
			System.out.println("Un dos dous e NEGATIVO");
		} else {
			System.out.println("Os dous son POSITIVOS");
		}
			
		teclado.close();		
	}
}
