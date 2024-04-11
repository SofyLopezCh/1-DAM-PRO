package compilador35_40;

import misClases.avaliacion1.CSerie;
import java.util.Scanner;

public class compi37 {
	public static void main(String[] args) {
		
		CSerie miSerie = new CSerie();
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("dame nº:");
		int num = teclado.nextInt(); // sería lo mismo que int a =
		miSerie.amosaAta20(num); //sería lo mismo que (a)
	
		
		teclado.close();
	}
}
