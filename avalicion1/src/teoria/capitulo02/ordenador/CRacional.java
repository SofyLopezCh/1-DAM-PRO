package teoria.capitulo02.ordenador;


public class CRacional {
	
	int Numerador;
	int Denominador;
	
	void AsignarDatos(int num,int den) {
		Numerador = num;
		
		if(den == 0) den = 1;
		Denominador = den;
	}
	
	void VisualizarRacional() {
		
		System.out.println("Racional: " + Numerador + "/" + Denominador);
	}

}
