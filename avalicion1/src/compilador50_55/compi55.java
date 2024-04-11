package compilador50_55;

import java.util.Scanner;

public class compi55 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int número;

		do {
			System.out.println("M E N U");
			System.out.println("=======");
			System.out.println("1.- Dame un ENTEIRO");
			System.out.println("2.- Dame un REAL");
			System.out.println("3.- Dame una CADEA");
			System.out.println("4.- FINAL");
			System.out.print("\n");
			número = teclado.nextInt();

			switch (número) {
			case 1:
				System.out.print("Introduce un numero ENTEIRO: ");
				int entero = teclado.nextInt();
				System.out.println("Numero ENTEIRO ingresado: " + entero);
				break;

			case 2:
				System.out.print("Introduce un numero REAL: ");
				double real = teclado.nextDouble();
				System.out.println("Numero REAL ingresado: " + real);
				break;

			case 3:
				teclado.nextLine();
				System.out.print("Introduce unha CADEA: ");
				String cadena = teclado.nextLine();
				System.out.println("CADEA ingresada: " + cadena);
				break;

			case 4:
				System.out.println("F I N A L");
				break;

			default:
				System.out.println("OPCION Erronea");
				break;
			}
		} while (número != 4);

		teclado.close();
	}
}
