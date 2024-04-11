package compilador50_55;

import java.util.Scanner;

public class compi54 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = 0;

		while (numero != 4) {
			System.out.println("M E N U");
			System.out.println("=======");
			System.out.println("1- Dame un ENTEIRO");
			System.out.println("2- Dame un REAL");
			System.out.println("3- Dame unha CADEA");
			System.out.println("4- FINAL");
			System.out.print("\n");
			numero = teclado.nextInt();

			switch (numero) {
			case 1:
				System.out.print("Introduce un número ENTEIRO: ");
				int entero = teclado.nextInt();
				System.out.println("Número ENTEIRO ingresado: " + entero);
				break;

			case 2:
				System.out.print("Introduce un número REAL: ");
				double real = teclado.nextDouble();
				System.out.println("Número REAL ingresado: " + real);
				break;

			case 3:
				teclado.nextLine();
				System.out.print("Introduce unha CADEA: ");
				String cadena = teclado.nextLine();
				System.out.println("CADEA ingresada: " + cadena);
				break;

			case 4:
				System.out.println("FINAL");
				break;

			default:
				System.out.println("OPCION Erronea");
				break;
			}
		}

		teclado.close();
	}
}
	

// mientras no pulses ??? hay q tener cuidado con el intro
