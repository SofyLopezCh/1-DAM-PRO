package compilador17_25;

public class compi20 {
	public static void main(String[] ar) {
		int a, b, fib;

		fib = 1;
		a = 0;
		b = 0;

		while (fib < 1000) {
			System.out.println(fib);

			a = b;
			b = fib;
			fib = a + b;
			;
		}

	}

}
