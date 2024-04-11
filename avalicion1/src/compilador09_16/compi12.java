package compilador09_16;

import java.util.Scanner;

public class compi12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese primer valor: ");
		int num1 = scanner.nextInt();

		System.out.print("Ingrese segundo valor: ");
		int num2 = scanner.nextInt();

		// hago las operaciones
		int suma = num1 + num2;
		int resta = num1 - num2;
		int mul = num1 * num2;
		int div = num2 / num1;

		if (num1 > num2)
			System.out.println("la suma-----------> " + suma);
		if (num1 > num2)
			System.out.println("la diferencia-----> " + resta);

		if (num1 < num2)
			System.out.println("El producto-------> " + mul);
		if (num1 < num2)
			System.out.println("La division-------> " + div);
		
		scanner.close();
	}
}
