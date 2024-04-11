package preparatorios12_16;

import java.util.Scanner;

public class prepara13 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int edad;

		int cont10_30 = 0, cont30_50 = 0, cont15_21 = 0, cont25_45 = 0;

		System.out.print("Dame edad: ");
		edad = teclado.nextInt();
		teclado.nextLine();

		while (edad >= 10 && edad <= 50) {
			System.out.print("CORRECTO, idade pulsada: " + edad);

			if (edad < 15) {
				System.out.println(" -> modificados estos intervalos: (10, 30)");
				cont10_30++;
			}

			else if (edad >= 15 && edad <= 21) {
				System.out.println(" -> modificados estos intervalos: (10, 30) (15, 21)");
				cont10_30++;
				cont15_21++;
			} else if (edad > 21 && edad < 25) {
				System.out.println(" -> modificados estos intervalos: (10, 30)");
				cont10_30++;

			} else if (edad >= 25 && edad < 30) {
				System.out.println(" -> modificados estos intervalos: (10, 30) (25, 45)");
				cont10_30++;
				cont25_45++;
			} else if (edad == 30) {
				System.out.println(" -> modificados estos intervalos: (10, 30) (25, 45) (30, 50)");
				cont10_30++;
				cont25_45++;
				cont30_50++;
			} else if (edad > 30 && edad <= 45) {
				System.out.println(" -> modificados estos intervalos: (25, 45) (30,50)");
				cont25_45++;
				cont30_50++;

			} else {
				System.out.println(" -> modificados estos intervalos: (30,50)");
				cont30_50++;
			}

			System.out.print("Dame edad: ");
			edad = teclado.nextInt();
			teclado.nextLine();

		}

		teclado.close();
		System.out.println("+++++> Entre 10 e 30 pulsaronse " + cont10_30 + " edades");
		System.out.println("+++++> Entre 30 e 50 pulsaronse " + cont30_50 + " edades");
		System.out.println("+++++> Entre 15 e 21 pulsaronse " + cont15_21 + " edades");
		System.out.println("+++++> Entre 25 e 45 pulsaronse " + cont25_45 + " edades");

	}
}
