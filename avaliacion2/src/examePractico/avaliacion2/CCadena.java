package examePractico.avaliacion2;

import java.util.Scanner;

public class CCadena {

	Scanner teclado = new Scanner(System.in);

	private char[] cadena = new char[40];
	private String frase;

	public void recoge() {
		System.out.print("Dame cadena: ");
		frase = teclado.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			cadena[i] = frase.charAt(i);

		}

	}

	public void amosa() {

		int i = 0;

		for (i = 0; i < cadena.length; i++) {
			if (cadena[i] != '\0') {
				System.out.print(cadena[i]);

			}
		}
	}

	public void eliminaVocalesEnCadena() {

		int i = 0, j = 0;

		while (cadena [i] != '\0') {
			if (cadena[i] != 'a' && cadena[i] != 'e' && cadena[i] != 'i' && cadena[i] != 'o' && cadena[i] != 'u') {
				cadena[j] = cadena[i];
				j++;
			}
			i++;

		}

	}

}
