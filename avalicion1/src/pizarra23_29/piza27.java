package pizarra23_29;

import java.util.Scanner;

public class piza27 {
	public static void main(String[]args) {
	Scanner teclado = new Scanner(System.in);
	int cont, num;
	
	for (cont= 1; cont<=10; cont++) {
		
		for (num = 0; num<=10; num++) {
			System.out.println(cont + " x " + num + " = " + cont*num);
		    
		}
		teclado.nextLine();
	}
	
	
	teclado.close();
	
	}
}
