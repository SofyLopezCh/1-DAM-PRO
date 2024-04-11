package compilador203_205;

import misClases.avaliacion2.CVector;

public class compi203 {

	public static void main(String[] args) {
		CVector objeto = new CVector();

		int num;

		do {
			num=objeto.retorna();
			switch (num) {
			case 1:
				System.out.print("Vector INICIALIZADO");
				objeto.inicializa();
				break;

			case 2:
				objeto.amosavector();
				break;

			case 3:
				System.out.print("Opcion NO Implementada");
				break;

			case 4:
				System.out.print("Opcion NO Implementada");
				break;

			case 5:
				System.out.print("FINAL");
				break;
				
			default:
				System.out.print("OPCION NO VALIDA");
			}

		} while (num < 5);
	}
}
