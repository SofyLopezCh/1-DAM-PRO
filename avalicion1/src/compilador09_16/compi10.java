package compilador09_16;

import java.util.Scanner;

public class compi10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// solicito que me dea el precio de compra (numero)
		System.out.print("Dame precio de compra: ");
		float numero = scanner.nextFloat();

		// realizo las operaciones matemáticas
		float precioVenta = numero + (numero * 0.35f);
		float previoConiva = precioVenta + (precioVenta * 0.18f);

		// Muestro los resultados
		System.out.println("Precio de venta ------> " + precioVenta);
		System.out.println("PVP ------------------> " + previoConiva);

		scanner.close();

	}
}