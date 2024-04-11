package compilador09_16;

import java.util.Scanner;

public class compi13 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
	   System.out.print ("Ingrese primera nota: ");
	   float num1 = teclado.nextInt();
	   
	   System.out.print ("Ingrese segunda nota: ");
	   float num2 = teclado.nextInt();
	   
	   System.out.print ("Ingrese segunda nota: ");
	   float num3 = teclado.nextInt();
	   
	   //realizo las operaciones
	    float suma = num1 + num2 + num3;
	    float media = suma / 3;
	    
	   if (media >= 7) {
		    System.out.println ("Su media ---> "+ media);
		    System.out.println("PROMOCIONADO");
	   }
	       
	   else {
	     System.out.print ("Su media ---> " + media);
	   }
	teclado.close();
	}
}
