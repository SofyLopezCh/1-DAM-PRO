package compilador26_34;

import java.util.Scanner;

public class compi32 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);

		int mas12 = 0;
		int tri = 1;

		System.out.print("TOTAL triángulos: ");
		int totaltri = teclado.nextInt();

		while (totaltri >= 1) {

			System.out.print("**Dame base " + tri + ": ");
			float bas = teclado.nextFloat();
			System.out.print("Dame altura " + tri + ": ");
			float alt = teclado.nextFloat();

			float sup = (alt * bas)/2;
			System.out.println("*Superficie " + tri + ": " + sup);

			tri++;
			totaltri--;

			if (sup > 12) {
				mas12 = mas12 + 1;
			}

		}
		System.out.print("Triángulos con superficie superior a 12 son: " + mas12);
		teclado.close(); 
	}
}
