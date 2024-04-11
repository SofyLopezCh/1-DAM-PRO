package practicas1_4;

import java.io.IOException;

public class practica2 {
	public static void main(String[] args) throws IOException {

		char taboa = ' ';
		int num = 32, cont = 1;

		while (taboa >= ' ' && taboa <= '~') {

			if (num < 100) {
				if (cont <= 10) {
					System.out.print(num + " " + taboa + "    ");
				}

				else {
					System.out.print("\n" + num + " " + taboa + "    ");
					cont = 1;
				}

			} else {
				if (cont <= 10) {
					System.out.print(num + " " + taboa + "   ");
				}

				else {
					System.out.print("\n" + num + " " + taboa + "   ");
					cont = 1;

				}
			}

			taboa++;
			num++;
			cont++;
		}

	}

}
