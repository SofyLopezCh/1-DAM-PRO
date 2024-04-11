package misClases.teoria;

public class CCuenta {
	private double tipodeInteres;
	private double saldo;

	public void EstablecerTipoDeInteres(Double tipo) {

		if (tipo < 0)
			System.out.println("El tipo de interés no puede ser negativo");
		else
			tipodeInteres = tipo;
	}

	public void ingresarDinero(double ingreso) {

		saldo = saldo + ingreso;

	}

	public void retirarDinero (double cantidad) {
		
		if (saldo - cantidad < 0) 
		System.out.println("No tiene saldo suficiente");
		else 
		saldo = saldo - cantidad;
		
	}
	
	
	public double SaldoActual() {
		return saldo;
	}
	
	public void AbonarIntereses() {
		saldo = saldo *(1 + tipodeInteres /100);
		
	}
	

	// pagina 87 de la teoria privados
}
