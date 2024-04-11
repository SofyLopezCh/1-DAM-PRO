package piza217_232;

import misClases.avaliacion2.CMatrizCuadrada;

public class piza221 {

	private int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	public  int sumaA_B(int A, int B) {
		int retorna;

		if (A < B)
			retorna = A + sumaA_B(A + 1, B);
		else
			retorna = A;

		return retorna;

	}

	public static void main(String[] args) {
		int devolver;
		piza221 object = new piza221();
		
		devolver = object.sumaA_B(1, 5);
		
		System.out.print(devolver);

	}
}
