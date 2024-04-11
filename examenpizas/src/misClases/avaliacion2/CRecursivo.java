package misClases.avaliacion2;

public class CRecursivo {

	private int[] vector = { 1, 3, 6, 2, 8, 7 };

	public int suma1_N(int n) {
		int resultado = 0; // n =5
		if (n > 1)
			resultado = n + suma1_N(n - 1); //
		else
			resultado = n; //

		return resultado;
	}

	public int sumaA_B(int a, int B) {
		int resultado = 0;

		if (a < B) {
			resultado = a + sumaA_B(a + 1, B);

		} else

			resultado = a;

		return resultado;

	}

	public void amosa(int n) {

		if (n > 1) {
			amosa(n - 1);
		}
		System.out.print(vector[n - 1] + " ");
	}

	public int factorial(int n) {
		int resultado;

		if (n > 1) {
			resultado = n * factorial(n - 1);
		} else
			resultado = n;

		return resultado;
	}

	public void amosaB_A(int A, int B) {

		if (B > A) {
			amosaB_A(A + 1, B);
		}
		System.out.print(A + " ");

	}

	public void amosaN_1(int n) {

		System.out.print(n + " ");
		if (n > 1)
			amosaN_1(n - 1);
		
		
	}

}
