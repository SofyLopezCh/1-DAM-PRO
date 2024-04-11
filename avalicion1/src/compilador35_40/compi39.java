package compilador35_40;

import misClases.avaliacion1.CSerie;
import java.util.Scanner;

public class compi39 {
	public static void main (String[]args) {
	
	CSerie miserie = new CSerie();
	Scanner teclado = new Scanner (System.in);
	
	System.out.print("Dame un nº A más pequeño que B: ");
	int numA = teclado.nextInt(); 
			
	System.out.print("Dame un nº B más grande que A: ");
	int numB = teclado.nextInt();
	
	miserie.amosaA_B (numA, numB);
	
	teclado.close();
	}
}
