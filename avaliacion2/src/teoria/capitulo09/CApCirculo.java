package teoria.capitulo09;

import misClases.teoria.CCirculo;

public class CApCirculo {

	public static void main(String[] args) {
		
		System.out.println(CCirculo.seno[90]);
		System.out.println(CCirculo.coseno[90]);
		System.out.println(CCirculo.coseno[180]);
		System.out.println();
		
		CCirculo obj1 = new CCirculo();
		System.out.println(obj1.longCircunferencia());
		System.out.println(obj1.areaCirculo());
		
		CCirculo obj2 = new CCirculo();
		System.out.println(obj2.longCircunferencia());
		System.out.println(obj2.areaCirculo());
		System.out.println();
		
		System.out.println("Valor de Pi : " + CCirculo.damePi());
		CCirculo.cambiarPrecisionPiA(3.1411);
		System.out.println("Valor de Pi: " + CCirculo.damePi());
		System.out.println();
		
		System.out.println(CCirculo.numCirculos);
		System.out.println(obj1.longCircunferencia());
		System.out.println(obj1.areaCirculo());
		System.out.println(obj2.longCircunferencia());
		System.out.println(obj2.areaCirculo());
		
		
		
	}
	
}
