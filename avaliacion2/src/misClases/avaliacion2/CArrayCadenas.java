package misClases.avaliacion2;

import java.util.Scanner;

public class CArrayCadenas {
	
	private String[] cadena = new String[7];
	Scanner teclado = new Scanner(System.in);
	
	public void inicializa() {
		
		
		cadena[0] = "Lunes";
		cadena[1] = "Martes";
		cadena[2] = "Miercoles";
		cadena[3] = "Jueves";
		cadena[4] = "Viernes";
		cadena[5] = "Sabado";
		cadena[6] = "Domingo";
	
	}
	
	public void amosa () {
		 int i;
		 
		 for (i=0; i<7; i++)
			 System.out.println("Día " + i + " : " + cadena[i]);
		 
		
		 
		 
	}
	
		private void menu() {
		
		
			System.out.print("\nMENU");
			System.out.print("\n1._ INICIALIZA Array de Cadenas");
			System.out.print("\n2._ AMOSA Array");
			System.out.print("\n3._ ORDENA  Ascendentemente");
			System.out.print("\n4._ ORDENA Descendentemente");
			System.out.print("\n5._ FINAL");
			System.out.println("\n");
		}
		
		public int retorna() {
			int opcion;
			menu();
			System.out.print("Dame opción: ");
			opcion = teclado.nextInt();
			return opcion;

		}
			
		
	public void amosaAscendente() {
		int i, j;
		String dato;
		if (cadena[0] == "null")
			return;
		
		for (i= 1; i <= cadena.length-1; i++)
			for(j = cadena.length-1; j>= i; j--)
				if (cadena [j-1].compareTo(cadena[j])>0) {
					dato = cadena[j-1];
					cadena[j-1]=cadena[j];
					cadena[j] = dato;
					
				}
		
		
	}
	
	public void amosaDescendente() {
		
		int i, j;
		String dato;
		if (cadena[0] == "null")
			return;
		
		for (i= 1; i <= cadena.length-1; i++)
			for(j = cadena.length-1; j>= i; j--)
				if (cadena [j-1].compareTo(cadena[j])<cadena.length) {
					dato = cadena[j-1];
					cadena[j-1]=cadena[j];
					cadena[j] = dato;
					
				}
		
		
		
		
	}

	
	
}
