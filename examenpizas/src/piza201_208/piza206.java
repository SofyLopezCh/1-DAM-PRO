package piza201_208;

import misClases.avaliacion2.CCadena;
import java.io.IOException;

public class piza206 {
	public static void main (String[]args) throws IOException {
		
		CCadena objeto = new CCadena();
		
		System.out.println("Dame cadena: ");
		objeto.recolleCadena();
		
		objeto.amosacadena();
		objeto.eliminaEnCadena('S');
		
		System.out.println("Cadena con letra eliminada ");
		objeto.amosacadena();
		
		
		
		
		
	}
	
	
	
}
