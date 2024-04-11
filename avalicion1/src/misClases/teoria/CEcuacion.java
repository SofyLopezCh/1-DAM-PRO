package misClases.teoria;



public class CEcuacion {
	
	private double d1;
	private double d2;
	private double d3;
	private double d4;

	
	public CEcuacion(double a, double b, double c, double d) {
		d1 = a;
		d2 = b;
		d3 = c;
		d4 = d;
	}

	
	public double ValorPara(double x) {
		return d1 * x * x * x + d2 * x * x + d3 * x + d4;
	}
}
