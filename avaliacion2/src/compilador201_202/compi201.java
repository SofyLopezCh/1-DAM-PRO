package compilador201_202;

import misClases.avaliacion2.CDameDato;
import java.io.IOException;
import java.util.Scanner;

public class compi201 {
	public static void main(String[]args) throws IOException{
		Scanner teclado = new Scanner(System.in);
		CDameDato objeto = new CDameDato();
		 int num;
		 
		 num = objeto.dameOpcion();
		
		while (num != 4) {
		

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
		}
		
		teclado.close();
	}
	
	
	
}
