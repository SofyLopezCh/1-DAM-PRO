package preparatorios07_11;

import java.util.Scanner;
import java.io.IOException;

public class prepara11 {
	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);
		char letra;

		System.out.print("Dame DIXITO ou VOCAL minuscula: ");
		letra = (char) System.in.read();
		teclado.nextLine();

		while (letra >= '0' && letra <= '9' || letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o'
				|| letra == 'u') {
			if (letra >= '0' && letra <= '9')
				System.out.print("-> CORRECTO, pulsaches este DIXITO: " + letra);
			else
				System.out.print("-> CORRECTO, pulsaches esta VOCAL minuscula: " + letra);
		
			System.out.print("\nDame DIXITO ou VOCAL minuscula: ");
			letra = (char) System.in.read();
			teclado.nextLine();
		}

		System.out.print("+++++> INCORRECTO, pulsaches esta tecla: " + letra);
		teclado.close();
	}

}
