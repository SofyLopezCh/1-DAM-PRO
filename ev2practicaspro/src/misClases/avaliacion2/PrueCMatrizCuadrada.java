package misClases.avaliacion2;

public class PrueCMatrizCuadrada {

	private int[][] matrizA = {{1,2,3},{4,5,6},{7,8,9}};
	private int[][] matrizB = new int[3][3];
	private int[][] array = new int[3][3];

	
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
	//{1 2 3}{4 5 6}{7 8 9}
	public void amosaDereitaAbaixo() {

		int i, j;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//{7 8 9}{4 5 6}{1 2 3}
	public void amosaEsquerdaArriba() {

		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(" " + array[2 - i][2 - j] + " ");
			}
			System.out.println();
		}
	}

	//{3 2 1}{6 5 4}{9 8 7}
	public void amosaEsquerdaAbaixo() {
		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {

				System.out.print(" " + array[i][2 - j] + " ");
			}
			System.out.println();
		}

	}

	//{7 8 9}{4 5 6}{1 2 3}
	public void amosaDereitaArriba() {
		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {

				System.out.print(" " + array[2 - i][j] + " ");
			}
			System.out.println();
		}

	}
   //{9 8 7}{6 5 4}{3 2 1}
	public void amosaArribaEsquerda() {
		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(" " + array[2 - j][2 - i] + " ");
			}
			System.out.println();

		}

	}

	//{1 4 7}{2 5 8}{3 6 9}
	public void amosaAbaixoDereita() {
		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(" " + array[j][i] + " ");
			}
			System.out.println();

		}
	}

	//{7 4 1}{8 5 2}{9 6 3}
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

	
	
	// prepara01  {1 4 7}{3 6 9}{1 4 7} 
	public void copiaAenBcolumna1Repe() {

		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				matrizB[i][j] = matrizA[j][(i % 2) * 2];

			}
		}
	}

	//prepara 06 {6 6 3}{5 5 2}{4 4 1}
	public void copaAenBfila2Repe() {

		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				matrizB[i][j] = matrizA[1 - ((j - (j % 2)) / 2)][2 - i];

			}
		}

	}
	
	//prepara08 {6 9 9}{5 8 8}{4 7 7}
	public void copiaAenBfila3Repe() {

		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				matrizB[i][j] = matrizA[(j/2)+(1+(j%2))][2 - i];
			}
		}

	}
	
	
	//Pruebas con ternarias
	
	public void ternariaFacil() {
		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				matrizB[i][j] = matrizA[i==0?2:i==1?1:0][j];
			}
		}
		
		
		
	}
	public void ternariaDificil() {
		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				matrizB[i][j] = matrizA[j==0?1:j==1?2:2][2-i];
			}
		}
		
	}
	
	public void ternariaAle() {
		
		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				matrizB[i][j] = matrizA[i==1?2:i==2?0:0][j];
			}
		}
		
	}
	
	
}
