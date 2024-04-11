package misClases.avaliacion2;

import java.util.Scanner;

public class PrueCRecursivo {

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
	
	//prepara03
	public void amosaRevesCadena(int i) {

		if (cadena[i] != '\0') {
			amosaRevesCadena(i + 1);
			System.out.print(cadena[i]);

		}

	}

	// prepara05 no enseña los dígitos
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

	// prepara 09 versión 2
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

	// prepara 09 al reves 
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

	
	public int total() {
		int a = 0;

		while (cadena[a] != '\0') {
			a++;
		}
		a--;
		return a;

	}
	
	
	//muestra 3 veces los caracteres y 2 los dígitos
	public void amosaCaracteresTrilicadosDixitosDuplicados(int a) {

		if (cadena[a] != '\0') {
			if (cadena[a] >= 'A' && cadena[a] <= 'z') {
				System.out.print(cadena[a]);
				System.out.print(cadena[a]);
				// System.out.print(cadena[a]);
				// amosaCaracteresTrilicadosDixitosDuplicados(a + 1);
			}

			else if (cadena[a] >= '0' && cadena[a] <= '9') {
				System.out.print(cadena[a]);
				// System.out.print(cadena[a]);
				// amosaCaracteresTrilicadosDixitosDuplicados(a + 1);

			}
			System.out.print(cadena[a]);
			amosaCaracteresTrilicadosDixitosDuplicados(a + 1);

		}
	}

	
	//muestra empezando desde el total, 3 veces los caracteres y 2 los números
	public void amosaCaracteres3Dixitos2Total(int a) {

		if (a >= 0) {
			// amosaCaracteres3Dixitos2Total(a - 1); //con esto aquí de principio a fin
			System.out.print(cadena[a]);

			if (cadena[a] >= '0' && cadena[a] <= '9')
				System.out.print(cadena[a]);
			else if (cadena[a] >= 'A' && cadena[a] <= 'Z' || cadena[a] >= 'a' && cadena[a] <= 'z') {
				System.out.print(cadena[a]);
				System.out.print(cadena[a]);
			}
			amosaCaracteres3Dixitos2Total(a - 1); //con esto aquí de fin a principio

		}
	}
	
	//prepara13_duplica las Aa y Ee y le da la vuelta a la cadena
	public void amosaRevesAaEeDuplicados(int i) {
		
		//i =0; NO, si pones i=0 cada vez q empiece el recursivo i siempre será cero y no avanzará
		
		if (cadena[i]!= '\0') {
			amosaRevesAaEeDuplicados(i+1);
			if (cadena[i]=='a' || cadena[i]=='A' ||cadena[i]=='e'|| cadena[i]=='E')
				System.out.print(cadena[i]);
		System.out.print(cadena[i]);
		
			
		}
		
	}
	

}
