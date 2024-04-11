package preparatorio;

import misClases.avaliacion2.PrueCRecursivo;

public class pracprepara09 {

	public static void main(String[] args) {
		PrueCRecursivo objeto = new PrueCRecursivo();
		
		objeto.recoge();
		objeto.amosa();
		
		int total = objeto.total();
		System.out.println();
		objeto.amosaCaracteresTrilicadosDixitosDuplicados(0);
		System.out.println();
		System.out.println("Al revés: ");
		objeto.amosaCaracteres3Dixitos2Total(total);
		
		
	}
	
}
