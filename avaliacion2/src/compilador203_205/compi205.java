package compilador203_205;

import java.util.Scanner;
import misClases.avaliacion2.CVector;

public class compi205 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		CVector objeto = new CVector();

		int num, enteiro = 0;

		do {
			num = objeto.retorna();
			switch (num) {
			case 1:
				objeto.inicializa();
				break;
			case 2:
				objeto.amosavector();
				break;
			case 3:
				System.out.print("Dame enteiro a INSERTAR: ");
				enteiro = teclado.nextInt();
				objeto.insertar(enteiro);
				break;

			case 4:
				System.out.print("Dame enteiro a ELIMINAR: ");
				enteiro = teclado.nextInt();
				objeto.eliminar(enteiro);
				break;
			case 5:
				System.out.print("FINAL");
				break;
			default:
				System.out.println("OPCION Erronea");

			}

		} while (num != 5);
		teclado.close();

	}

}
