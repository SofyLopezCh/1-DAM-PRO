package preparatorios12_16;

import java.util.Scanner;

public class prepara15 {
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int edad;
		
		System.out.print("Dame idade: ");
		edad = teclado.nextInt();
		
        while(edad >=1 && edad <=9 || edad>=15 && edad<=29 ||edad>=65 && edad<=110) {
        	if (edad>=1 && edad <=9)
        	
        		System.out.println("ESTE CATIVO TEN " + edad + " ANOS");
        	
        	else if (edad>=15 && edad<=29)
        		System.out.println("ESTE XOVEN TEN " +edad+ " ANOS");
        	else 
        		System.out.println("ESTE ANCIAN TEN " + edad + " ANOS");
        
        }
      teclado.close();
		
		
	}

}
