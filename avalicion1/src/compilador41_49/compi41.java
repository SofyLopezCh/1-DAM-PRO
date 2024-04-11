package compilador41_49;

import java.io.IOException;


public class compi41 {
	public static void main(String[] args) throws IOException{

		char letra;

		System.out.print(">");
		letra = (char) System.in.read();

		while (letra != '\n') {
			System.out.print(letra);
			letra = (char) System.in.read();
		}
		/*
		 * String linea; /Scanner teclado = new Scanner(System.in);
		 * 
		 * System.out.print(">"); linea = teclado.nextLine();
		 * 
		 * System.out.println(linea); // Print the input line
		 * 
		 * teclado.close(); // Close the scanner when you're done with it
		 */
	}
}
