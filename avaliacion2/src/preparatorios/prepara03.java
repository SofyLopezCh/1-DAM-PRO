package preparatorios;

import misClases.avaliacion2.CRecursivo;
import java.io.IOException;

public class prepara03 {
	
	public static void main(String[] args) throws IOException{
		
		CRecursivo objeto = new CRecursivo();
		
		objeto.recogeCadena();
		
		System.out.print("\nCadena normal: ");
		objeto.amosaNormalCadena();
		
		System.out.print("\nCadena revés: ");
		objeto.amosaRevesCadena(0);
		
		
		
	}
	
	
	
	
}
