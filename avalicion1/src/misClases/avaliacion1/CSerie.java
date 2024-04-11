package misClases.avaliacion1;

public class CSerie {
	private int num;

//-------------------------compi 35------------------------------
	public void amosa1_10() {
		for (num = 1; num <= 10; num++) {
			System.out.println(num);
		}
	}

//--------------------------compi 36---------------------------------
	public void amosa10_1() {
		num = 10;

		while (num >= 1) {
			System.out.println(num);
			num--;
		}

	}

//-------------------------compi 37 -------------------------------------
	public void amosaAta20(int a) { // (int a) sería un entero con valor X
		for (num = a; num <= 20; num++)
			System.out.println(num);
	}

//--------------------------compi 38-------------------------------------
	public void amosaDende20(int i) {
		int veint = 20;

		while (veint >= i) {
			System.out.println(veint);
			veint--;
		}
	}

//--------------------------compi  39 ---------------------------------- 
	public void amosaA_B(int a, int b) {

		for (; a <= b; a++) {
			System.out.println(a);
		}
	}

//--------------------------compi 40 ----------------------------------------
	public void amosaB_A(int a, int b) {

		while (b >= a) {
			System.out.println(b);
			b--;

		}

	}
//-------------------------prepara06-------------------------------------------------

	public void amosaB_AsumaAimpares(int a, int b) {

		while (b >= a) {

			if (b % 2 != 0) {
				System.out.print(a + "+" + b);
				System.out.print(" ");
			} else {
				System.out.print(b);
				System.out.print(" ");
			}

			b--;

		}

	}

//-------------------------prepara07-------------------------------------------------
	public void amosaA_BrestaBtres(int a, int b) {

		while (a <= b) {

			if (a % 3 == 0) {
				System.out.print("(" + b + "-" + a + ") ");

			} else {
				System.out.print(a + " ");

			}

			a++;

		}

	}
//-------------------------prepara12-------------------------------------------------

	public void amosaA_Bsuma500seis(int a, int b) {

		/*
		 * int aux = 0;
		 * 
		 * if (a > b) { // quieres = a < b aux = b; b = a; a = aux; }se puede hacer esto
		 * está bien
		 */

		while (a < b) {
			num = a;
			if (num % 6 == 0)
				System.out.print((num + 500) + " ");
			else if (num % 2 == 0)
				System.out.print(num + " ");
			a++;
		}

	}

//---------------------prepara 16-----------------------------------------------------

	public void amosaA_Bmulti4partido(int a, int b) {

		num = a;

		while (num <= b) {
			
			if (num % 4 == 0)
				System.out.print("(" + num/4 + " * 4) ");
			else 
				System.out.print(num + " ");
			
			num++;
		}

	}

}
