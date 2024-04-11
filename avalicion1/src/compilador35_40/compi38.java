package compilador35_40;

import misClases.avaliacion1.CSerie;
import java.util.Scanner;

public class compi38 {
	public static void main(String[] args) {
		CSerie miserie = new CSerie();
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame un número menor que 20: ");
		int i = teclado.nextInt();
		miserie.amosaDende20(i);

		teclado.close();
	}

}
