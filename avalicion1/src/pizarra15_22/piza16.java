package pizarra15_22;

import java.util.Scanner; 

public class piza16 {
	public static void main (String[]arg) {
		Scanner teclado = new Scanner(System.in);
		
		int edad;
		
		System.out.print("Escribe unha idade: ");
		edad = teclado.nextInt();
		
		if (edad >=0 && edad <=17) {
			System.out.println("MENOR de idade con " + edad + " anos" );
			System.out.println("PROHIBIDO pasar a sala de cine");
			
			
		} else if (edad >=18 && edad <=110) {
			System.out.println("MAIOR de idade con " + edad + " anos");			
			System.out.println("PASE a sala de cine");
		} else {
			System.out.println("Ter " + edad + " non esta CONTEMPLADO");
			System.out.println("PECHEN a sala de cine");
		}
		teclado.close();
	
	}
}
