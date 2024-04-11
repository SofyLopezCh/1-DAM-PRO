package examen2023;

import java.util.Scanner;

public class pregunta1 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int edad, cont40_60 = 0, cont55_65 = 0, cont60_80 = 0, cont65_90 = 0;

		System.out.print("  Dame edad: ");
		edad = teclado.nextInt();
		teclado.nextLine();

		while (edad >= 40 && edad <= 90) {

			if (edad < 55) {
				System.out.print("CORRECTO, edad pulsada: " + edad + " -> modificado este intervalo: (40,60)");
				cont40_60++;
			} else if (edad >= 55 && edad < 60) {
				System.out
						.print("CORRECTO, edad pulsada: " + edad + " -> modificados estes intervalos: (40,60) (55,65)");
				cont40_60++;
				cont55_65++;

			} else if (edad == 60) {
				System.out.print("CORRECTO, edad pulsada: " + edad
						+ " -> modificados estes intervalos: (40,60) (55,65) (60,80)");
				cont40_60++;
				cont55_65++;
				cont60_80++;
			} else if (edad > 60 && edad < 65) {
				System.out
						.print("CORRECTO, edad pulsada: " + edad + " -> modificados estes intervalos: (55,65) (60,80)");
				cont55_65++;
				cont60_80++;
			} else if (edad == 65) {
				System.out.print("CORRECTO, edad pulsada: " + edad
						+ " -> modificados estes intervalos: (55,65) (60,80) (65,90)");
				cont55_65++;
				cont60_80++;
				cont65_90++;

			} else if (edad > 65 && edad <= 80) {
				System.out
						.print("CORRECTO, edad pulsada: " + edad + " -> modificados estes intervalos: (60,80) (65,90)");
				cont60_80++;
				cont65_90++;
			} else {
				System.out.print("CORRECTO, edad pulsada: " + edad + " -> modificado este intervalo: (65,90)");
				cont65_90++;
			}

			System.out.print("\n  Dame edad: ");
			edad = teclado.nextInt();
			teclado.nextLine();
			
		}

		System.out.print("  +++++> Entre 40 e 60 pulsaronse " + cont40_60 + " edades");
		System.out.print("\n  +++++> Entre 55 e 65 pulsaronse " + cont55_65 + " edades");
		System.out.print("\n  +++++> Entre 60 e 80 pulsaronse " + cont60_80 + " edades");
		System.out.print("\n  +++++> Entre 65 e 90 pulsaronse " + cont65_90 + " edades");
		teclado.close();
	}

}
