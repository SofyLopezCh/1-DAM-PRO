package misClases.avaliacion2;

public class CMatriz {

	private int[][] matriz = new int[2][3];

	public void inicializa() {

		matriz[0][0] = 6;
		matriz[0][1] = 9;
		matriz[0][2] = 8;
		matriz[1][0] = 4;
		matriz[1][1] = 7;
		matriz[1][2] = 3;

	}

	public void amosaPorFilas() {
		int i, j;

		for (i = 0; i < 2; i++)
			for (j = 0; j < 3; j++)
				System.out.print(" " + matriz[i][j] + " ");
		System.out.println();

	}

	public void amosaPorColumnas() {
		int i, j;
		for (j = 0; j < 3; j++)
			for (i = 0; i < 2; i++)
				System.out.print(" " + matriz[i][j] + " ");
		System.out.println();

	}

	public void amosaPorFilasTotal() {
		int i, j, total;

		for (i = 0; i < 2; i++) {
			total = 0;
			for (j = 0; j < 3; j++) {
				System.out.print(" " + matriz[i][j] + " ");
				total = total + matriz[i][j];
			}
			System.out.println(" total : " + total);

		}

	}

	public void amosaPorColumnasTotal() {
		int i, j, total;

		for (j = 0; j < 3; j++) {
			total = 0;
			for (i = 0; i < 2; i++) {
				System.out.print(matriz[i][j] + " ");
				total += matriz[i][j];
			}
			System.out.println("(total: " + total + ")");

		}

	}

	public int oMaior() {

		int i, j;
		int maior = matriz[0][0];

		for (i = 0; i < 2; i++) {

			for (j = 0; j < 3; j++) {
				if (maior < matriz[i][j])
					maior = matriz[i][j];

			}

		}

		return maior;

	}

	
	
	
}
