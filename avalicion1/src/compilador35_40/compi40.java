package compilador35_40;

import misClases.avaliacion1.CSerie;
import java.util.Scanner;

public class compi40 {
	public static void main(String[]args) {
	
		CSerie miserie = new CSerie();
		Scanner teclado = new Scanner (System.in);
		
	System.out.print("Dame un número A < B: ");
	int a = teclado.nextInt();
	System.out.print("Dame un número B > A: ");
	int b = teclado.nextInt();
	
	miserie.amosaB_A (a, b);
	
	teclado.close();
	}
}
