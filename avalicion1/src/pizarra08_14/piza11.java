package pizarra08_14;

import java.util.Scanner;

public class piza11 {
	public static void main (String[]arg) {
	Scanner teclado = new Scanner(System.in);
	
	int num;
	
	System.out.print("Ingresa un nº menor que 20: ");
	num = teclado.nextInt();
	
	for (int veint= 20; veint >=num; veint--) {
		System.out.println(veint);
		
	}
	teclado.close();
	
	}
}
