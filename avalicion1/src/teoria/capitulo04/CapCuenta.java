package teoria.capitulo04;

import misClases.teoria.CCuenta;

public class CapCuenta {
	public static void main(String[]args) {
		CCuenta cuenta = new CCuenta();
		cuenta.ingresarDinero(100000);
		cuenta.EstablecerTipoDeInteres(5.0);
		
		System.out.println(cuenta.SaldoActual());
		cuenta.ingresarDinero(500000);
		cuenta.EstablecerTipoDeInteres(10000.0);
		System.out.println(cuenta.SaldoActual());
		cuenta.AbonarIntereses();
		System.out.println(cuenta.SaldoActual());
		
		
	}
	
	
	
}
