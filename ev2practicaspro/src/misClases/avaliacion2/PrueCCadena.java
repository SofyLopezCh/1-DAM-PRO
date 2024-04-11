package misClases.avaliacion2;

import java.util.Scanner;

public class PrueCCadena {
	Scanner teclado = new Scanner(System.in);

	private char[] cadena = new char[40];
	private String frase;

	public void recoge() {
		System.out.println("Dame cadena: ");
		frase = teclado.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			cadena[i] = frase.charAt(i);

		}

	}

	public void amosa() {

		int i = 0;

		for (i = 0; i < cadena.length; i++) {
			if (cadena[i] != '\0') {
				System.out.print(cadena[i]);

			}
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

	//prepara02 elimina en posición 1,2,5
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

	//prepara 04 duplica los dígitos de  las posiciones 1 2 5
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

	//prepara07  duplica sólo los números
	public void duplicaNumerosEnCadena() {

		int i = 0;
		int cont = 0;

		while (cadena[i] != '\0') {
			if (cadena[i] >= '0' && cadena[i] <= '9')
				cont++;
			i++;

		}
		i--;

		int j = i + cont;
		while (i >= 0) {
			if (cadena[i] < '0' || cadena[i] > '9') {
				cadena[j] = cadena[i];
			} else {
				cadena[j] = cadena[i];
				cadena[j - 1] = cadena[i];
				j--;
			}

			j--;
			i--;

		}

	}

	//triplica los caracteres y duplica los números
	public void amosaCaracteres3Dixitos2() {

		int i = 0;
		int cont = 0;

		while (cadena[i] != '\0') {
			if (cadena[i] >= '0' && cadena[i] <= '9') {
				cont++;

			} else if (cadena[i] >= 'A' && cadena[i] <= 'Z' || cadena[i] >= 'a' && cadena[i] <= 'z') {
				cont++;
				cont++;

			}
			i++;
		}
		i--;
		int j = i + cont;
		while (i >= 0) {

			if (cadena[i] >= '0' && cadena[i] <= '9') {
				cadena[j] = cadena[j - 1] = cadena[i];
				j--;
			} else if ((cadena[i] >= 'A' && cadena[i] <= 'Z') || (cadena[i] >= 'a' && cadena[i] <= 'z')) {
				cadena[j] = cadena[j - 1] = cadena[j - 2] = cadena[i];
				j = j - 2;
			} else
				cadena[j] = cadena[i];

			i--;
			j--;
		}

	}

	// Duplica en cadena lo que pasa por el argumento
	public void duplicaEnCadenaArgumento(char a) {

		int i = 0;
		int cont = 0;

		while (cadena[i] != '\0') {
			if (cadena[i] == a)
				cont++;
		i++;
		}
		i--;
		
		int j = i + cont;
		
		while (i >= 0) {
			if (cadena[i] == a) {
				cadena[j] = cadena[i];
				j--;					
			}
			cadena[j] = cadena[i];
			i--;
			j--;
				
			
			
			
		}
		
	}
	
	

	
	
	
	
	

}
