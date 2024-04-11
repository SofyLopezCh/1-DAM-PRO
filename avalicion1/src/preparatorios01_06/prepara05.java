package preparatorios01_06;

import java.util.Scanner;

public class prepara05 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int idade, cont3 = 0, cont9 = 0, cont25 = 0, cont35 = 0;

		System.out.print("Dame IDADE: ");
		idade = teclado.nextInt();
		teclado.nextLine();

		while (idade >= 3 && idade <= 17 || idade >= 25 && idade <= 65) {
			System.out.print("CORRECTO, idade pulsada: " + idade);
			if (idade >= 9 && idade <= 12) {
				cont9++;
				System.out.print("-> modifica  este intervalo: (3, 17)(9,12)");
			} else if (idade < 25) {
				cont3++;
				System.out.print("-> modifica  este intervalo: (3, 17)");

			} else if (idade >= 35 && idade <= 40) {
				cont35++;
				System.out.print("-> modifica  este intervalo: (25,65) (35, 40)");
			} else {
				cont25++;
				System.out.print("-> modifica  este intervalo: (25,65)");
			}
			System.out.print("\nDame IDADE: ");
			idade = teclado.nextInt();
			teclado.nextLine();

		}
		System.out.print("+++++> Entre 3 e 17 pulsaronse " + cont3 + " idades");
		System.out.print("\n+++++> Entre 9 e 12 pulsaronse " + cont9 + " idades");
		System.out.print("\n+++++> Entre 25 e 65 pulsaronse " + cont25 + " idades");
		System.out.print("\n+++++> Entre 35 e 40 pulsaronse " + cont35 + " idades");

		teclado.close();

	}

}
