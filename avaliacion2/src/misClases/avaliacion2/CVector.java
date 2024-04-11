package misClases.avaliacion2;

import java.util.Scanner;

public class CVector {

	Scanner teclado = new Scanner(System.in);

	private int[] numero = new int[20];
	private int total, opcion;

	public void inicializa() {

		numero[0] = 3;
		numero[1] = 12;
		numero[2] = 15;
		numero[3] = 22;
		numero[4] = 30;
		numero[5] = 43;

		total = 6;

	}

	public void amosavector() {

		int i;

		System.out.print("Amosa o vector: ");

		for (i = 0; i < total; i++) {

			System.out.print("\nVALOR" + i + ": " + numero[i]);

		}

		System.out.print("\ntotal: " + total);

	}

	public int retorna() {

		menu();
		System.out.print("Dame opción: ");
		opcion = teclado.nextInt();
		return opcion;

	}

	private void menu() {

		System.out.print("\nMENU");
		System.out.print("\n1._ INICIALIZA Vector de enteiros");
		System.out.print("\n2._ AMOSA Vector");
		System.out.print("\n3._ INSERTA enteiro en Vector");
		System.out.print("\n4._ ELIMINA enteiro en Vector");
		System.out.print("\n5._ FINAL");
		System.out.println("\n");
	}

	public void insertar(int a) {
		int i, posicion = 0;

		for (i = 0; i < total; i++) { // 55
			if (numero[i] < a)
				posicion++;

		}

		for (i = total; i > posicion; i--) {
			numero[i] = numero[i - 1];

		}
		numero[posicion] = a;
		total++;

	}

	public void eliminar(int a) {

		int i, aux;

		for (i = 0; numero[i] != a; i++)
			;

		if (numero[i] == a) {
			numero[i] = 0;
			for (aux = i + 1; aux <= total; aux++) {
				numero[i] = numero[aux];
				i++;
			}
			numero[total] = 0;
			total = total - 1;

		}

	}

}
