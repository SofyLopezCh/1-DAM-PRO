package compilador17_25;

import java.util.Scanner;

public class compi23 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		float sueldo;

		float entre100y300 = 0;
		float masde300 = 0;
		float gastototal = 0;

		int emp;
		int cont = 1;

		System.out.print("Cuantos empleados hay: ");
		emp = teclado.nextInt();

		while (cont <= emp) {
			// Aquí va la lógica
			System.out.print("Ingrese sueldo " + cont + ": ");
			sueldo = teclado.nextFloat();

			gastototal += sueldo; // Siempre suma el sueldo al gasto total

			if (sueldo >= 100 && sueldo <= 300) {
				entre100y300++; // Incrementa el contador para los salarios entre 100 y 300
			} else if (sueldo > 300) {
				masde300++; // Incrementa el contador para los salarios por encima de 300
			}

			cont++; // Incrementa el contador de empleados
		}

		System.out.println("Empleados con sueldos entre 100 y 300: " + entre100y300);
		System.out.println("Empleados con sueldos superiores a 300: " + masde300);
		System.out.println("Gasto total de la empresa en sueldos: " + gastototal);

		teclado.close();
	}
}