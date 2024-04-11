package compilador09_16;

import java.util.Scanner;

public class compi14 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
	   System.out.print ("Dame un número entre 1 y 99: ");
	   float num1 = teclado.nextInt();
	   
	    if (num1 <= 9){
	    	System.out.println ("Tiene UN digito");
	    }
	     
	    else	{
	    	System.out.println("Tiene DOS digitos");
	    }
	    teclado.close();
	    
	
	}
}
