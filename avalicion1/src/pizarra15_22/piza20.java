package pizarra15_22;

import java.io.IOException;

public class piza20 {
	public static void main (String[]arg) throws IOException{ 
	char tecla;
	
	System.out.print("Pulsa unha tecla: ");
	tecla = (char) System.in.read();
	
	if (tecla >='A' && tecla <= 'z') {
		System.out.println("LETRA");
	} else if (tecla >='0' && tecla <='9') {
		System.out.println("DIGITO");
	
	} else {
		System.out.println("Tecla NON PERMITIDA");
		
	}
		
	}	
}
