package preparatorios01_06;

import java.util.Scanner;
import java.io.IOException;

public class prepara04 {
	public static void main(String[] args) throws IOException {

		Scanner teclado = new Scanner(System.in);
		char letra;

		System.out.print("Dame CONSONANTE minuscula: ");
		letra = (char) System.in.read();
		teclado.nextLine();

		while (letra < 'b' || letra > 'z' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {

			System.out.print("-> INCORRECTO, pulsaches esta tecla: " + letra);
			System.out.print("\nDame CONSONANTE minuscula: ");
			letra = (char) System.in.read();
			teclado.nextLine();
		}
		System.out.print("+++++> CORRECTO, pulsaches esta CONSONANTE minuscula: " + letra);
		teclado.close();

	}

}
