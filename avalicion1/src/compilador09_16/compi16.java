package compilador09_16;

import java.util.Scanner;

public class compi16 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.print("Ingrese un valor: ");
		num = teclado.nextInt();
		
		if (num < 0)
			System.out.print("NEGATIVO");
		else if (num > 0)
			System.out.print("POSITIVO");
		else 
			System.out.print("NULO");

				teclado.close();
		
		
		
	}
}
