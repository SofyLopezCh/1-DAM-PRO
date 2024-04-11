package PRUEBA_MART;

import java.util.Scanner;

public class MiName {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int edad;

		System.out.println("Hola, me llamo Eclipse, soy un pequeño programa de prueba,");
		System.out.println("podrías indicarme tu nombre?");
		
		
		System.out.print("Mi nombre es ");
		String nombre = teclado.next(); // Read the entire name as a string
			
		
		 System.out.println("Hola " + nombre + ", es un placer conocerte.");
		 System.out.println("¿Cuántos años tienes? ");
		 edad = teclado.nextInt();
		 
		 if (edad <= 39) {
					
		System.out.println("Madre mía O.O !! ¿¡" + edad + " años!? \nQue jovencita!!");
		System.out.println("Ha sido un placer conocerte, dale un beso a tu hermana de mi parte ;D");
		 }else {
			 System.out.print("  ");
			 System.out.println("Madre mía ô.ô!!!" + edad + " años!!? que vejestorio O_O!!");
			 System.out.println("Ha sido un placer conocerte, dale un beso a tu hija de mi parte ;D");
		 }
		 
			teclado.close();
	}
}