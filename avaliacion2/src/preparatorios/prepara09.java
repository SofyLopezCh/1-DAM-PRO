package preparatorios;

import misClases.avaliacion2.CRecursivo;


public class prepara09 {
	
	public static void main(String[] args) {
		
		CRecursivo objeto = new CRecursivo();
		
		
		objeto.recogeCadena();
		objeto.amosaNormalCadena();
		int total =objeto.total();
		System.out.println();
		objeto.amosaDixitosDuplicados(total);
		
		
	}

}
