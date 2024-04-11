package preparatorios;

import misClases.avaliacion2.CCadena;
import java.io.IOException;

public class prepara02 {
	public static void main(String[] args) throws IOException{

		CCadena objeto = new CCadena();

		objeto.recogeCadena();
		objeto.amosaCadena();
		objeto.elimina125EnCadena();
		System.out.println();
		objeto.amosaCadena();
		
		
	}

}
