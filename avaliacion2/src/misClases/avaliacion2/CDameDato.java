package misClases.avaliacion2;

import java.util.Scanner;

public class CDameDato {

	
		
		Scanner teclado = new Scanner(System.in);
		
		private int opcion, datoInt;
		private float datoFloat;
		private String datoString;
		
		
		public int recogeInt ()  {
			
			System.out.print("Dame dato int: ");
			datoInt = teclado.nextInt();
			return datoInt;
			
	}
		public void imprimeInt() {
			System.out.print("dato int PULSADO: " + datoInt);
			System.out.println("\n");
		}
	
		
		public float recogeFloat() {
			System.out.print("Dame dato float: ");
			datoFloat = teclado.nextFloat();
			return datoFloat;			
			
		}
		
		public void imprimeFloat() {
			System.out.print("dato float PULSADO: " + datoFloat);
			System.out.println("\n");
		}
		
		public String recogeString(){
			System.out.print("Dame dato String: ");
			datoString = teclado.nextLine();
			
			return datoString;
			
		}
		
		public void imprimeString(String a){
			System.out.print("dato String PULSADO: " + a);
			System.out.println("\n");
			
		}
		
		
		public int dameOpcion() {
			
			menu();
			System.out.print("Dame opcion: ");
			opcion=teclado.nextInt();
			teclado.nextLine();
			
			return opcion;
			
		}
			
		
		
		private void menu() {
			
			System.out.print("MENU");
			System.out.print("\n======");
			System.out.print("\n1.- Dame un ENTEIRO");
			System.out.print("\n2.- Dame un REAL");
			System.out.print("\n3.- Dame un CADENA");
			System.out.print("\n4.- FINAL");
			System.out.println("\n");
			
		}
		
		
		
}
