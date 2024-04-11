package compilador201_202;

import java.util.Scanner;
import misClases.avaliacion2.CDameDato;

public class compi202 {
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		CDameDato objeto = new CDameDato();
		 int num;
		 
		 num=objeto.dameOpcion();
		 
		do {
			
			switch (num)  {
			case 1:
				objeto.recogeInt();
				objeto.imprimeInt();
				break;
				
			case 2:
				objeto.recogeFloat();
				objeto.imprimeFloat();
				break;
				

			case 3:
				String string=objeto.recogeString();
				objeto.imprimeString(string);
				break;
				

			case 4:	
				System.out.print("FINAL");
				break;
		

			default:
				System.out.println("OPCION Erronea");
				
			}
			num=objeto.dameOpcion();
			
		}while ( num !=4);
		
		teclado.close();
		
	}
	
	
}
