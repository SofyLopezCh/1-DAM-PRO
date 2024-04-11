package compilador41_49;

import java.io.IOException;

public class compi44 {

	public static void main(String[] args) throws IOException {
		char letra;
		int cont = 0;

		System.out.print(">");
		letra = (char) System.in.read();

		while (letra != '\r') {
			System.out.print(letra);
			letra = (char) System.in.read();
			cont = cont + 1;
		}
		System.out.print("\nTeclas pulsadas:" + cont);

	}
}
