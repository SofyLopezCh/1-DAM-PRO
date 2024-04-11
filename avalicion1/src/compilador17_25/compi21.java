package compilador17_25;

import java.util.Scanner;

public class compi21 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int i = 1;
		int a = 0;
		int b = 0;
	
		

		while (i <=7) {
			System.out.print("Dame nota" + i + ": ");
			int nota = teclado.nextInt();
			i++;
			
			if (nota >= 6) {
				a++;
			}
				else {
					b++;
				}
				
			}
		System.out.println("Cantidad de alumnos con nota mayor o igual a 6 : " + a);
		System.out.println("Cantidad de alumnos con nota menor a 6: " + b);
		teclado.close();
		
					
		}
	
	
		
	}
