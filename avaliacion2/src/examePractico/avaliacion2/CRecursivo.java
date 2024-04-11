package examePractico.avaliacion2;

import java.util.Scanner;

public class CRecursivo {

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

	public void amosa467DuplicadosReves(int i) {

		if (cadena[i] != '\0') {
			amosa467DuplicadosReves(i + 1);
			System.out.print(cadena[i]);

			if (cadena[i] == '4' || cadena[i] == '6' || cadena[i] == '7')
				System.out.print(cadena[i]);

		}
	}

}
