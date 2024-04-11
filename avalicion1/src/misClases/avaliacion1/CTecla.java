package misClases.avaliacion1;

import java.util.Scanner;
import java.io.IOException;

public class CTecla {

	private Scanner teclado = new Scanner(System.in);

	private char dixito, vocal, vocalm, consonante, consonantem;

	public void recogedixito() throws IOException {

		do {
			System.out.print("Dame dixito: ");
			dixito = (char) System.in.read();
			teclado.nextLine();
		} while (dixito < '0' || dixito > '9');

	}

	public void recogevocal() throws IOException {
		do {
			System.out.print("Dame vocal minuscula: ");
			vocal = (char) System.in.read();
			teclado.nextLine();

		} while (vocal != 'a' && vocal != 'e' && vocal != 'i' && vocal != 'o' && vocal != 'u');
	}

	public void recogevocalm() throws IOException {
		do {
			System.out.print("Dame vocal maiúscula: ");
			vocalm = (char) System.in.read();
			teclado.nextLine();
		} while (vocalm != 'A' && vocalm != 'E' && vocalm != 'I' && vocalm != 'O' && vocalm != 'U');
	}

	public void recogeconsonante() throws IOException {
		do {
			System.out.print("Dame consonante: ");
			consonante = (char) System.in.read();
			teclado.nextLine();
		} while ((consonante < 'b' || consonante > 'z')
				&& (consonante == 'e' || consonante == 'i' || consonante == 'o' || consonante == 'u'));
	}

	public void recogeconsonantem() throws IOException {
		do {
			System.out.print("Dame consonante maiúscula: ");
			consonantem = (char) System.in.read();
			teclado.nextLine();
		} while ((consonantem < 'B' || consonantem > 'Z')
				&& (consonantem == 'E' || consonantem == 'I' || consonantem == 'O' || consonantem == 'U'));
	}

	public void amosaResultado() {

		System.out.print(dixito + ", " + vocal + ", " + vocalm + ", " + consonante + ", " + consonantem);
	}
}
