package misClases.avaliacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CString {

	private String cadena;
	private String cadenaO;

	public void recoge() {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Escribe: ");
			cadenaO = buffer.readLine();
			cadena = cadenaO;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void amosa() {
		System.out.print(cadena);
		System.out.println();
		cadena = cadenaO;

	}

	public void minusculas() {

		StringBuffer buffer = new StringBuffer(cadena.toLowerCase());
		
		System.out.println(buffer);

	}

	public void maiusculas() {

		StringBuffer buffer = new StringBuffer(cadena.toUpperCase());

		System.out.println(buffer);

	}

	public void arroba() {
		
		StringBuffer buffer = new StringBuffer(cadena);
        for (int i = 0; i < buffer.length(); i++) {
            char letra = buffer.charAt(i);
            if (letra == 'a' || letra == 'A') {
                buffer.setCharAt(i, '@');
            }
        }
        System.out.println(buffer.toString());
    
	}
	
	   public void espacioBlanco() {
	        StringBuffer buffer = new StringBuffer(cadenaO);
	        boolean espacio = false;

	        for (int i = 0; i < buffer.length(); i++) {
	        	 if (Character.isWhitespace(buffer.charAt(i))) {
	                 if (!espacio) {
	                	 espacio = true;
	                 } else {
	                     buffer.deleteCharAt(i);
	                     i--; 
	                 }
	             } else {
	            	 espacio = false;
	                 i--; 
	             }
	         }

	        cadena = buffer.toString();
	        amosa();
	    }



	    public void sinNumeros() {
	        StringBuffer buffer = new StringBuffer(cadenaO);
	        for (int i = 0; i < buffer.length(); i++) {
	            if (Character.isDigit(buffer.charAt(i))) {
	                buffer.deleteCharAt(i);
	                i--;
	            }
	        }
	        cadena = buffer.toString();
	        amosa();
	    }
	
	

}
