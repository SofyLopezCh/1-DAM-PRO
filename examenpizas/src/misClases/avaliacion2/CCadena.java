package misClases.avaliacion2;

import java.io.IOException;

public abstract class CCadena {

	int a = 3;
	
	public abstract void sofia(); 
	
	
	private char[] cadena = new char[30];

	public void recolleCadena() throws IOException {

		int i;

		for (i = 0; cadena[i] != '\r'; i++) {

			cadena[i] = (char) System.in.read();
		}

	}

	public void amosacadena() {

		int i;

		for (i = 0; cadena[i] != '\0'; i++) {

			System.out.print(cadena[i]);

		}

	}

	public void amosaRevesCadena() {

		int i = 0;

		while (cadena[i] != '\0')
			i++;

		i--;

		while (i >= 0) {
			System.out.print(cadena[i]);
			i--;
		}

	}

	public void capicua() {

		int i = 0, j;

		while (cadena[i] != '\0')
			i++;
		j = i;
		i--;

		while (i >= 0) {
			cadena[j] = cadena[i];
			i--;
			j++;
		}

	}

	public void eliminaEnCadena(char letra) {
		int i = 0;
		int j = 0;
		
		while (cadena[i] !=0) {
			if (cadena[i] == letra) {
				i++;
			}
			else if (i>j) {
				
			}
				
			
			
		}
		
		
		
		
		
	}

}
