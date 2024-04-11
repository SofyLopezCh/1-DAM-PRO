package compilador41_49;

import java.io.IOException;

public class compi47 {

	public static void main(String[] args) throws IOException {

		char letra;
		int blanc = 0, cont = 0;

		System.out.print(">");
		letra = (char) System.in.read();

		while (letra != '\n') {
			System.out.print(letra);
			letra = (char) System.in.read();
			if (letra == ' ')
				blanc++;
			else if (letra == 'a')
				cont++;

		}

		System.out.println("Total espacios en blancos: " + blanc);
		System.out.println("Total letra 'a': " + cont);

	}

}
