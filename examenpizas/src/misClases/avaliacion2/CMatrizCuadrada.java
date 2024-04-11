package misClases.avaliacion2;

public class CMatrizCuadrada {

	private int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	public void pony() {
		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(matriz[2-j][2-i] + " ");

			}
			System.out.println();

		}

	}
}
