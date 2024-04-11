package compilador17_25;
import java.util.Scanner;
public class compi22 {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Cuantos alumnos hay: ");
		
		int alumnos = scanner.nextInt();
		
		float sumaAlturas = 0, media, altura;
		
		for (int i = 1; i <= alumnos; i = i + 1) {
			
			System.out.print("Dame altura " + i + ": ");
			
			altura = scanner.nextFloat();
			
			sumaAlturas = sumaAlturas + altura;
			
		}
		media = sumaAlturas / alumnos;
		System.out.println("Altura promedio: " + media);
		scanner.close();
	}
}
