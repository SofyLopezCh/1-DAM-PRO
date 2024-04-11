package misClases.teoria;

import java.util.Scanner;

public class CPrueba {
	private CGrados grados = new CGrados();
	
	public void RecogeGrados() {
		Scanner teclado = new Scanner(System.in);
		float centigrados;
		
		
		System.out.print("Dame Grados Centigrados: ");
		centigrados = teclado.nextFloat();
		grados.CentigradosAsignar(centigrados);
		teclado.close();
	}
	
	public void AmosaGrados() {
		float gradosFar, gradosC;
		gradosFar = grados.FarenheitObtener();
		
		gradosC= grados.CentrigradosObtener();
		System.out.println(gradosC + " C" + " " + gradosFar + " F" );
	}
	
	
}
