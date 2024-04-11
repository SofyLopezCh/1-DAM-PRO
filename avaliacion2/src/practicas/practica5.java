package practicas;

import misClases.avaliacion2.*;
import misClases.teoria.Leer;

public class practica5 {

	private static void menu() {

		System.out.println("\n");
		System.out.println("1.- Matrices");
		System.out.println("2.- Array de caracteres");
		System.out.println("3.- String");
		System.out.println("4.- Sair");
		System.out.println("\n");
	}

	private static int dameOpcion() {

		menu();
		int numero = Leer.datoInt();
		System.out.println();
		return numero;
	}
	
	public static void main(String[] args) {
		CMatrices objetoM = new CMatrices();
		CArrayCaracteres objetoA = new CArrayCaracteres();
		CString objetoS = new CString();//FALTA????
		
		int opcion;
		
		
		do {
			
			opcion= dameOpcion();
			
			switch(opcion) {
			
			case 1:
				objetoM.recoge();
				objetoM.amosa('A', 'B');
				
				System.out.println(" ");
				objetoM.trasposta('A', 'B');
				objetoM.amosa('A','B');
				
				System.out.println(" ");
				objetoM.suma('A', 'B','C');
				objetoM.resta('A','B','D');
				objetoM.amosa('C','D');
				
				System.out.println("\n");
				objetoM.resta('A','B','C');
				objetoM.multiplica('A','B','D');
				objetoM.amosa('C','D');
				
				System.out.println(" ");
				break;
				
			case 2:
				objetoA.recoge();
				objetoA.amosa();
				
				objetoA.maiusculas();
				objetoA.minusculas();
				objetoA.arroba();
				objetoA.espacioBlanco();
				objetoA.sinNumero();
				objetoA.amosa();
				break;
				
			case 3:
				objetoS.recoge();
				objetoS.amosa();
				objetoS.maiusculas();
				objetoS.minusculas();
				objetoS.arroba();
				objetoS.espacioBlanco();
				objetoS.sinNumeros();
				objetoS.amosa();
				break;
				
			case 4:
				System.out.println("FIN");
				break;
				
				
			default:
				System.out.println("NO POSIBLE");
						
		
			}
			
			
		}while(opcion!=4);
		
		
		
		
	}

}