package preparatorios07_11;

import java.util.Scanner;

public class prepara08 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int edad, cont25_35 = 0, cont30_45 = 0, cont40_60 = 0;

		System.out.print("Dame edad: ");
		edad = teclado.nextInt();
		teclado.nextLine();

		while (edad >= 25 && edad <= 60) {
			System.out.print("CORRECTO, edad pulsada: " + edad);
			
			if (edad >=25 && edad <30) {
				System.out.print(" -> modifica estos intervalos: (25, 35)");
				cont25_35++;
			}
			else if (edad >=30 && edad <=35) {
				System.out.print(" -> modifica estos intervalos: (25, 35) (30, 45)");
				cont25_35++;
				cont30_45++;
			}
			else if (edad >35 && edad <=45) {
				System.out.print(" -> modifica estos intervalos: (30, 45) (40, 60)");
				cont30_45++;
				cont40_60++;
				
			}
			else {
				System.out.print(" -> modifica estos intervalos: (40, 60)");
				cont40_60++;
				
			}
				
						
				System.out.print("\nDame edad: ");
				edad = teclado.nextInt();
				teclado.nextLine();
			
		}

			System.out.println("Entre 25 e  35 pulsaronse " + cont25_35);
			System.out.println("Entre 30  e 45 pulsaronse " + cont30_45);
			System.out.print("Entre 40 e 60 pulsaronse " + cont40_60);

			teclado.close();
		}

	}




