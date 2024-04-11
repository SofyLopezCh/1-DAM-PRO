package compilador01_08;

import java.util.Scanner;

public class compi07 {
	public static void main(String[] args) {
		//crear un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);
		System.out.print("Idade de Uxia en meses: ");
		int mesesUxia = scanner.nextInt();
		
		//Solicitar la cantidad de meses para maruxa
		System.out.print("Idade de Maruxa en meses: ");
		int mesesMaruxa = scanner.nextInt();
		
		//Solicitar la cantidad de meses para Anxo
		System.out.print("Idade de Anxo en meses: ");
		int mesesAnxo = scanner.nextInt();
		
		//Calcular las edades equivalentes en años
		int edadUxia = mesesUxia / 12;
		int edadMaruxa = mesesMaruxa / 12;
		int edadAnxo = mesesAnxo / 12;
		
		//Mostrar los resultados
		System.out.println ("Uxia tiene " + edadUxia);
		System.out.println ("Maruxa tiene " + edadMaruxa);
		System.out.println ("Anxo tiene " + edadAnxo);
		
		//Cerrar el Scanner
		scanner.close();
		
		
	}

}
