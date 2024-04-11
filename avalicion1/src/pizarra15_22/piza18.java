package pizarra15_22;

import java.io.IOException;

public class piza18 {
	public static void main(String[]arg) throws IOException {

		char letra;
		System.out.print("Pulse unha tecla Minuscula: ");
		letra = (char) System.in.read();
		
		if (letra >= 'a' && letra <= 'z') {
			System.out.println("Pulsouse esta tecla: " + letra);
			System.out.println("E MINUSCULA");
			
		} else {
			System.out.println("Tecla NON PERMITIDA: " + letra);
		}
		
		
	}
}
