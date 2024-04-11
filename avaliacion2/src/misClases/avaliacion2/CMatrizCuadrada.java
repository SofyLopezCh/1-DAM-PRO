package misClases.avaliacion2;

public class CMatrizCuadrada {
	private int[][] array = new int[3][3];
	private int[][] matrizA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	private int[][] matrizB = new int[3][3];

	public void Inicio() {

		array[0][0] = 1;
		array[0][1] = 2;
		array[0][2] = 3;
		array[1][0] = 4;
		array[1][1] = 5;
		array[1][2] = 6;
		array[2][0] = 7;
		array[2][1] = 8;
		array[2][2] = 9;
	}

	public void amosaDereitaAbaixo() {

		int i, j;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void amosaEsquerdaArriba() {

		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(" " + array[2 - i][2 - j] + " ");
			}
			System.out.println();
		}
	}

	public void amosaEsquerdaAbaixo() {
		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {

				System.out.print(" " + array[i][2 - j] + " ");
			}
			System.out.println();
		}

	}

	public void amosaDereitaArriba() {
		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {

				System.out.print(" " + array[2 - i][j] + " ");
			}
			System.out.println();
		}

	}

	public void amosaArribaEsquerda() {
		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(" " + array[2 - j][2 - i] + " ");
			}
			System.out.println();

		}

	}

	public void amosaAbaixoDereita() {
		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(" " + array[j][i] + " ");
			}
			System.out.println();

		}
	}

	public void amosaAbaixoEsquerda() {
		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(" " + array[2 - j][i] + " ");
			}
			System.out.println();

		}
	}

	public void amosa(char letra) {
		int i, j;
		int[][] m = null;

		if (letra == 'A')
			m = matrizA;
		else if (letra == 'B')
			m = matrizB;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++)
				System.out.print("  " + m[i][j] + "  ");
			System.out.println();
		}
		System.out.println();
	}

	public void copiaAenBcolumna1Repe() {

		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				matrizB[i][j] = matrizA[j][(i % 2) * 2];

			}
		}
	}

	public void copaAenBfila2Repe() {

		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				matrizB[i][j] = matrizA[1 - ((j - (j % 2)) / 2)][2 - i];

			}
		}

	}

	public void copiaAenBfila3Repe() {

		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				matrizB[i][j] = matrizA[(j/2)+(1+(j%2))][2 - i];
			}
		}

	}

}
