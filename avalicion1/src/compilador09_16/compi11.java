package compilador09_16;

import java.util.Scanner;

public class compi11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// solicito que me dean el PVP y adjudico un numero?
		System.out.print("Dame PVP: ");
		float numero = teclado.nextFloat();

		// Hago las operaciones
		float PVP = (numero / 1.18f);
		float preciorebajado = (PVP * 0.75f);
		float nuevoPVP = (preciorebajado * 1.18f);

		// le pido que lo imprima
		System.out.println("Precio-----------> " + PVP);
		System.out.println("Precio Rebajado--> " + preciorebajado);
		System.out.println("Nuevo PVP--------> " + nuevoPVP);

		teclado.close();
	}
}
