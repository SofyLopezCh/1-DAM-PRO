package misClases.avaliacion2;

//import java.io.IOException;
import java.util.Scanner;

public class CRecursivo {

	private char[] cadena = new char[40];
	Scanner teclado = new Scanner(System.in);

	private String frase;

	public void amosa1_N(int n) {
		if (n > 1) {
			amosa1_N(n - 1);
		}
		System.out.print(n + " ");

	}

	public void amosaN_1(int n) {
		System.out.print(n);

		if (n > 1)
			amosaN_1(n - 1);

	}

	public void recogeCadena() {

		System.out.println("Dame cadena: ");
		frase = teclado.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			cadena[i] = frase.charAt(i);

		}

	}

	public void amosaNormalCadena() {
		int i;

		for (i = 0; i < cadena.length; i++) {
			System.out.print(cadena[i]);

		}

	}

	public void amosaRevesCadena(int i) {

		if (cadena[i] != '\0') {
			amosaRevesCadena(i + 1);
			System.out.print(cadena[i]);

		}

	}

	// prepara05
	public void amosaSenDixitos(int i) {

		if (cadena[i] != '\0') {
			if (cadena[i] >= '0' && cadena[i] <= '9')
				amosaSenDixitos(i + 1);
			else {
				System.out.print(cadena[i]);
				amosaSenDixitos(i + 1);
			}

		}

	}

	// prepara05 otra versión
	public void Version2AmosaSenDixitos(int i) {

		if (cadena[i] != '\0') {
			if (cadena[i] < '0' || cadena[i] > '9') {

				System.out.print(cadena[i]);

			}

			Version2AmosaSenDixitos(i + 1);
		}

	}

	// prepara09 version1
	public void Version1amosaDixitosDuplicados(int i) {

		if (cadena[i] != '\0') {

			if (cadena[i] >= '0' && cadena[i] <= '9') {

				System.out.print(cadena[i]);

			}
			System.out.print(cadena[i]);
			Version1amosaDixitosDuplicados(i + 1);

		}

	}

	// prepara 09 otra versión
	public void Version2AmosaDixitosDuplicados(int i) {

		if (cadena[i] != '\0') {

			if (cadena[i] >= '0' && cadena[i] <= '9') {

				System.out.print(cadena[i]);
				System.out.print(cadena[i]);
				amosaDixitosDuplicados(i + 1);

			}

			else {
				System.out.print(cadena[i]);
				amosaDixitosDuplicados(i + 1);

			}

		}

	}

	// otra forma al reves prepara09
	public void amosaRevesDixitosDuplicados(int i) {

		if (cadena[i] != '\0') {

			if (cadena[i] < '0' || cadena[i] > '9') {
				amosaRevesDixitosDuplicados(i + 1);
				System.out.print(cadena[i]);

			} else {
				amosaRevesDixitosDuplicados(i + 1);
				System.out.print(cadena[i]);
				System.out.print(cadena[i]);
			}

		}

	}

	// prepara 09 
	public void amosaDixitosDuplicados(int i) {
		if (i > 0)
			amosaDixitosDuplicados(i - 1); //gracias a esto vamos del final de nuestra cadena hasta el 0
		System.out.print(cadena[i]); //ahora imprimimos y como la pila tiene q volver hasta el final va a hacerlo pero a la inversa(¿porque lo tiene guardado así?)
		if (cadena[i] >= '0' && cadena[i] <= '9')
			System.out.print(cadena[i]);

	}
	
	
	
	//prepara 09 TOTAL necesario para contar la longitud hasta el final sin los \0
	public int total() {

		int longitud = 0;
		for (int i = 0; cadena[i] != '\0'; i++)
			longitud++;
		return longitud;

	}

}
