package misClases.avaliacion2;

//import java.io.IOException;
import java.util.Scanner;

public class CCadena {
	Scanner teclado = new Scanner(System.in);

	private char[] cadena = new char[40];
	int total = 0;
	private String frase;

	/*public void NOrecolleCadena() throws IOException {

		int i = 0;
		char letra;

		letra = (char) System.in.read();

		while (letra != '\r') {
			cadena[i] = letra;
			letra = (char) System.in.read();

			i++;
		}
	}*/

	public void recogeCadena() {

		System.out.println("Dame cadena: ");
		frase = teclado.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			cadena[i] = frase.charAt(i);

		}

	}

	/*public void NOamosacadena() {
		int i;

		for (i = 0; i < cadena.length; i++) {
			if (cadena[i] != '\0') {
				System.out.println(i + ": " + cadena[i]);

			}
		}

	}*/

	public void amosaCadena() {
		int i = 0;

		for (i = 0; i < cadena.length; i++) {
			if (cadena[i] != '\0') {
				System.out.print(cadena[i]);

			}
		}
	}

	public void amosaRevesCadena() {

		int i = total - 1;

		while (i >= 0) {

			System.out.print(cadena[i]);
			i--;

		}

	}

	public void invierteCadena() {
		int i, j;
		char aux;
		i = j = 0;

		while (cadena[i] != '\0') {
			i++;
		}
		i--;

		while (j < i) {
			;
			aux = cadena[i];
			cadena[i] = cadena[j];
			cadena[j] = aux;
			i--;
			j++;
		}
	}

	public void capicua() {

		/*
		 * int i = total - 1, j = total;
		 * 
		 * /* while (i >= 0) { cadena[j] = cadena[i]; i--; j++; }
		 * 
		 * 
		 * for (i = total - 1; i >= 0; i--) {
		 * 
		 * cadena[j] = cadena[i]; j++;
		 * 
		 * }
		 */

		int i, j;
		i = j = 0;

		while (cadena[i] != '\0') {
			i++;
		}

		j = i - 1;
		while (j > 0) {
			cadena[i] = cadena[j];
			j--;
			i++;

		}

	}

	public void eliminaEnCadena(char a) {
		/*
		 * int i, j, s;
		 * 
		 * for (i = 0; i < cadena.length; i++) {
		 * 
		 * if (cadena[i] == a) { cadena[i] = '\0'; s = i; for (j = s; j < cadena.length
		 * - 1; j++) {
		 * 
		 * cadena[j] = cadena[s + 1]; s++;
		 * 
		 * } i--; } total = total - 1;
		 * 
		 * }
		 */

		int i, j;
		i = j = 0;
		while (cadena[i] != '\0') {

			if (cadena[i] == a) {
				i++;
			}

			else {
				if (j < i)
					cadena[j] = cadena[i];
				i++;
				j++;
			}

			while (j < i) { // NO TE OLVIDES DE RELLENAR EL ESPACIO!!!!!!
				cadena[j] = '\0';
				j++;
			}
		}

	}

	public void repiteUnha() {

		int i, j;
		i = j = 0;

		while (cadena[i] != '\0') {
			i++;

		}
		i--;

		while (i >= 0) {
			j = i * 2;
			cadena[j] = cadena[j + 1] = cadena[i];
			i--;
		}

	}

	public void eliminapares() {

		int i, j;
		i = 0;
		j = 0;

		while (cadena[i] != '\0') {

			if (cadena[i] % 2 != 0) {
				cadena[j] = cadena[i];
				j++;
			}
			i++;
		}

		while (j < i)
			cadena[j] = cadena[i];
		j++;

	}

	public void elimina125EnCadena() {
		int i = 0, j = 0;

		while (i < cadena.length) {
			if (i != 1 && i != 2 && i != 5) {
				cadena[j] = cadena[i];
				j++;
			}
			i++;

		}

	}

	public void duplica125EnCadena() {

		int i = 0;

		while (cadena[i] != '\0') {
			i++;
		}

		i--;
		int j = i + 3;
		while (i >= 0) {
			if (i != 1 && i != 2 && i != 5) {
				cadena[j] = cadena[i];

			}

			else {
				cadena[j] = cadena[i];
				cadena[j - 1] = cadena[i];
				j--;
			}

			j--;
			i--;

		}

	}

	public void duplicaNumerosEnCadena() {

	
		int i = 0;
		int cont = 0;
		
		while (cadena[i] != '\0') {
			if (cadena[i] >= '0' && cadena[i] <= '9') 
				cont++;
			i++;
			
		}
		i--;
		
		int j= i+cont;
		while (i>=0) {
			if (cadena[i] <'0' || cadena[i] >'9') {
				cadena[j] = cadena[i];
			}
			else {
				cadena[j]=cadena[i];
				cadena[j-1] = cadena[i];
				j--;
			}
			
			j--;
			i--;
		
		}

	}

}
