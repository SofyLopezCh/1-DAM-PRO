package teoria.capitulo09;

import misClases.teoria.CVector;

public class CApVector {
// Visualizar un vector
	public static void visualizarVector(CVector v) {
		int ne = v.longitud();
		for (int i = 0; i < ne; i++)
			System.out.print(v.valorEn(i) + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		double x[] = { 1, 2, 3, 4, 5, 6, 7 }; // matriz x
		CVector vectorl, vector2, vector3, vector4, vector5;
		vectorl = new CVector();
		vector2 = new CVector(5);
		vector3 = new CVector();
		for (int i = 0; i < vector2.longitud(); i++)
			vector3.ponerValorEn(i, (i + 1) * 10);
		vector4 = new CVector(vector3);
		vector5 = new CVector(x);
		visualizarVector(vectorl);
		visualizarVector(vector2);
		visualizarVector(vector3);
		visualizarVector(vector4);
		visualizarVector(vector5);
		System.out.println();
		vectorl.copiar(vector5);
		if (vectorl == vector5)
			System.out.println("referencias al mismo objeto");
		else
			System.out.println("referencias a objetos diferentes");
		if (vectorl.equals(vector5))
			System.out.println("objetos iguales");
		else
			System.out.println("objetos diferentes");
		visualizarVector(vectorl);
		visualizarVector(vector5);
	}

}
