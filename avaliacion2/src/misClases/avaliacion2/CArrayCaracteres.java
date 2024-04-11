package misClases.avaliacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CArrayCaracteres {

	
	
	private char[] matriz = new char[50];

	public void recoge() {

		try {
			// Crear un BufferedReader para leer
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			// Declarar caracteres
			char[] cbuf = new char [50];

			// Leer caracteres
			int maximo = reader.read(cbuf, 0, 50); // Lee hasta 50 caracteres read(char[] cbuf, int off, int len)

			// Imprimir
			for (int i = 0; i < maximo; i++) {
				matriz[i] = cbuf[i];
			}
			
			//Se imprime en la consola la secuencia de caracteres almacenada en cbuf como una cadena de texto.
			//System.out.println(new String(cbuf));

			// Cerrar el BufferedReader MAAAAL!!!
			//reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void amosa() {

		//String cadena = new String(matriz);
		
		String.valueOf(matriz);
		
			System.out.println(matriz);
		

	}

	public void maiusculas() {

		int i;

		for (i = 0; i < matriz.length; i++)
			System.out.print(Character.toUpperCase((char) matriz[i]));
		System.out.println();

	}

	public void minusculas() {
		int i;
		for (i = 0; i < matriz.length; i++)
			System.out.print(Character.toLowerCase((char) matriz[i]));
		System.out.println();

	}

	public void arroba() {
		// Convertir la cadena de caracteres en una cadena de String
		String cadena = new String(matriz);

		// Reemplazar 'A' por '@'
		cadena = cadena.replace("a", "@");
		cadena = cadena.replace("A", "@");

		// Convertir el String en un Char
		System.out.println(new String(cadena));
	}

	public void espacioBlanco() {
		String cadena = new String(matriz);
		cadena = cadena.trim();
		cadena = cadena.replaceAll("\\s+", " ");
		System.out.print(cadena);
		System.out.println();

	}

	public void sinNumero() {
		 String cadena = new String(matriz);
	        StringBuilder numero = new StringBuilder(cadena);

	        for (int i = 0; i < numero.length(); i++) {
	            if (numero.charAt(i) >= '0' && numero.charAt(i) <= '9') {
	            	numero.deleteCharAt(i);
	                i--;
	               
	            }
	     	
	        }

	        cadena = numero.toString();
	        System.out.print(cadena);
	        System.out.println();
	    }


}