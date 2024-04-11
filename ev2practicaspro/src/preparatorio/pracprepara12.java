package preparatorio;

import misClases.avaliacion2.PrueCMatrizCuadrada;

public class pracprepara12 {
	
	public static void main(String[] args) {
		
		PrueCMatrizCuadrada objeto = new PrueCMatrizCuadrada();
		
		
		objeto.ternariaFacil();
		objeto.amosa('A');
		objeto.amosa('B');
		
		System.out.println("\nTernaria dificil:");
		objeto.ternariaDificil();
		objeto.amosa('A');
		objeto.amosa('B');
		
		System.out.println("\nTernaria alejandro:");
		
		objeto.ternariaAle();
		objeto.amosa('A');
		objeto.amosa('B');
		
	}

}
