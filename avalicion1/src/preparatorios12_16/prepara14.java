package preparatorios12_16;

import java.util.Scanner;

public class prepara14 {

	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);
		
		int edad;

		System.out.print("Dame idade: ");
		edad = teclado.nextInt();
		
		teclado.nextLine();

			
		while (edad < 1 || edad > 9 && edad < 65 || edad > 110) {
			System.out.print("-> INCORRECTO, pulsaches esta idade: " + edad);
			System.out.print("\nDame idade: ");
			edad = teclado.nextInt();
			teclado.nextLine();

		}

		if (edad >= 1 && edad <= 9) {

			System.out.print("+++++> ESTE CATIVO TEN " + edad + " ANOS");
		} else if (edad >= 65 && edad <= 110) {

			System.out.print("+++++> ESTE ANCIAN TEN " + edad + " ANOS");
		}

		teclado.close();
		
	}

}
