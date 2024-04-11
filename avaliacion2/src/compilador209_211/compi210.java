package compilador209_211;

import misClases.avaliacion2.CArrayCadenas;

public class compi210 {

	public static void main(String[] args) {
		CArrayCadenas objeto = new CArrayCadenas();

		int num;

		do {
			num = objeto.retorna();
			switch (num) {
			case 1:
				System.out.print("Vector INICIALIZADO");
				objeto.inicializa();
				break;

			case 2:
				System.out.println("Amosar array");
				objeto.amosa();
				break;

			case 3:
				System.out.print("Ordena Ascendentemente");
				objeto.amosaAscendente();
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
