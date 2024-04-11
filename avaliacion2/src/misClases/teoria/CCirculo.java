package misClases.teoria;

class CPunto {

	private double x, y;

	CPunto (double cx, double cy){
		x = cx; y =cy;
	}
}

public class CCirculo {

	private static  double pi = 3.141592;
	public static int numCirculos;
	private CPunto centro;// coordenadas del centro
	private double radio; // radio del cículo

	public static double[] seno;
	public static double[] coseno;

	// métodos
	void msgEsNegativo() {

		System.out.println("El radio es negativo. Se convierte a positivo");

	}

	public CCirculo() { // constructor sin parámetros

		this(100.0, 100.0, 100.0);
	}

	public CCirculo(double cx, double cy, double r) {

		centro = new CPunto(cx, cy);
		if (r < 0) {
			msgEsNegativo();
			r = -r;
		}
		radio = r;
		numCirculos++;

	}

	public double longCircunferencia() {
		return 2 * pi * radio;

	}

	public double areaCirculo() {

		return pi * radio * radio;
	}

	public static void cambiarPrecisionPiA(double nuevoValor) {

		if (nuevoValor < 3.14 || nuevoValor > 3.1416)
			return;
		pi = nuevoValor;

	}

	public static double damePi() {
		return pi;
	}

}
