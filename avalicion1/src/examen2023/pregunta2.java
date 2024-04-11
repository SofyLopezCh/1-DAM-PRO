package examen2023;

import java.util.Scanner;
import java.io.IOException;

public class pregunta2 {
	public static void main(String[] args) throws IOException {

		Scanner teclado = new Scanner(System.in);

		char letra;

		System.out.print("Dame Consonante MAIUSCULA ou SIMBOLO: ");
		letra = (char) System.in.read();
		teclado.nextLine();

		
		while ((letra < 'B' || letra > 'Z' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')
				&& (letra != '%' && letra != '[' && letra != '{')) {

			System.out.print("  -> INCORRECTO, pulsaches esta tecla: " + letra);
			System.out.print("\nDame Consonante MAIUSCULA ou SIMBOLO: ");
			letra = (char) System.in.read();
			teclado.nextLine();
		}

		if (letra >= 'B' && letra <= 'Z')
			System.out.print(" +++++> CORRECTO, pulsaches esta Consonante MAIUSCULA: " + letra);
		else
			System.out.print(" +++++> CORRECTO, pulsaches este SIMBOLO: " + letra);
		teclado.close();
	}

}
