package preparatorios;

import misClases.avaliacion2.CMatrizCuadrada;

public class prepara08 {
	public static void main(String[] args) {

		
		CMatrizCuadrada objeto = new CMatrizCuadrada();
		
		
		System.out.println("Matriz A:");
		objeto.amosa('A');
		System.out.println("Matriz B:");
		objeto.copiaAenBfila3Repe();
		objeto.amosa('B');
		
		
		
	}
}
