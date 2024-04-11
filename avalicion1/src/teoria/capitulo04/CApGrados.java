package teoria.capitulo04;

import misClases.teoria.CPrueba;

class CApGrados {
	public static void main(String[]args) {
		//CGrados = new CGrados(); no se muestra pq está protegida
		CPrueba prueba = new CPrueba(); //pero si puedes llamarlos utilizando esta clase pq no es privada??
		prueba.RecogeGrados();
		prueba.AmosaGrados();
	}

	
	
	
}
