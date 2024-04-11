package teoria.capitulo02.ordenador;

public class CApRacional2 {

	int Numerador;
	int Denominador;
	
	void AsignarDatos(int num,int den) {
		Numerador = num;
		
		if(den == 0) den = 1;
		Denominador = den;
	}
	
	void VisualizarRacional() {
		
		System.out.println("Racional-2: " + Numerador + "/" + Denominador);
	}
	
	
	public static void main(String[] args) {
		
		CApRacional2 r1 = new CApRacional2();
		
		r1.AsignarDatos(2, 5);
		r1.VisualizarRacional();

	}
}
