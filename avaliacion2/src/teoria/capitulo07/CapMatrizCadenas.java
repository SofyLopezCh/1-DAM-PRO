package teoria.capitulo07;

import misClases.teoria.CMatrizCadenas;

class CApMatrizCadenas {
	public static void main(String[] args) {
		CMatrizCadenas matriz = new CMatrizCadenas();
		matriz.crea();
		matriz.llena();
		matriz.amosa();
		System.out.println("\nAnulamos Elemento");
		int indice = matriz.dameIndice();
		matriz.anulaElemento(indice);
		matriz.amosa();
	}
}
