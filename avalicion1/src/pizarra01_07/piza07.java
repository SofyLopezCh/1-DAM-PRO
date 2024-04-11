package pizarra01_07;

import java.util.Scanner;

public class piza07 {
	public static void main(String[]arg) {
		Scanner teclado = new Scanner(System.in);
		int num, multi=1;
		
		System.out.print("Dame la tabla de multiplicar del: ");
		num = teclado.nextInt();
		
		while (multi <= 10) {
			System.out.println(num + " x " + multi + "= " + num * multi);
			multi++;
			
			
		}
		teclado.close();
		
	}
}
