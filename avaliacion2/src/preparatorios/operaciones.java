package preparatorios;

import java.util.Scanner;

public class operaciones {
	public static void main(String[] args) {

		String[] combinacion = { "000", "001", "002", "010", "011", "012", "020", "021", "022", "100", "101", "102",
				"110", "111", "112", "120", "121", "122", "200", "201", "202", "210", "211", "212", "220", "221",
				"222" };

		String[] operacion = { // Operaciones
				"[j*0]", // 000
				"([(j-(j%2))/2]", // 001
				"[j-(j%2)]", // 002
				"[j%2]", // 010
				"[((j+(j%2))/2]", // 011
				"[j]", // 012
				"[2*(j%2)]", // 020
				"[(j/2)+(j%2)]", // 021
				"[j+(j%2)]", // 022
				"[((2-1)-(j%2))/2]", // 100
				"[1-(j%2)]", // 101
				"[(j/2)+(1-(j%2))]", // 112
				"[1-((j-(j%2))/2)]", // 110
				"[(j+(2-j))-1]", // 111
				"[((j+2)-(j%2))/2", // 112
				"[(1+(j%2))-(j/2)]", // 120
				"[1+(j%2)]", // 121
				"[(j/2)+(1+(j%2))]", // 122
				"[(2-j)-(j%2)]", // 200
				"[(2*(1-(j%2))-(j/2)]", // 201
				"[2-(2(j%2)]", // 202
				"[2-j]", // 210
				"[(2-1)+(j/2)]", // 211
				"[(1-(j%2))+1]", // 212
				"[(2-j)+(j%2)]", // 220
				"[((2-j)+(j%2))+(j/2)]", // 221
				"[j+(2-j)]" }; // 222

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe la combinación:");
		String combinacionTecleada = scanner.next();
		while (true) {

			for (int i = 0; i < combinacion.length; i++) {
				if (combinacionTecleada.equals(combinacion[i])) {
					System.out.println("COMBINACIÓN " + combinacionTecleada + " OPERACIÓN " + operacion[i]);

				}
			}
			System.out.println("Escribe la combinación:");
			combinacionTecleada = scanner.next();
		}
	}
}
