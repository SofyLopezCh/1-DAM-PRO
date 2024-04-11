package misClases.avaliacion1;

import java.util.Scanner;

public class CFecha {

	private Scanner teclado = new Scanner(System.in);

	private int dia, mes, ano;

	public void recogeDia() {
		
						
		do {
			
			System.out.print("Dame Dia (entre 1 e 31): ");
			dia = teclado.nextInt();

		} while (dia <1 || dia >31);

	}
	public void recogeMes() {
		
						
		do {
			
			System.out.print("Dame Mes (entre 1 e 12): ");
			mes = teclado.nextInt();

		} while (mes <1 || mes >12);
		
	}
	
	public void recogeAno() {
		
			
		do {
			
			System.out.print("Dame Ano (entre 1990 e 2010): ");
			ano = teclado.nextInt();

		} while (ano <1990 || ano >2010);
	}
	
	public void amosaResultado() {
		
		
	 System.out.print(Dia() + "/" + Mes()+ "/"+ Ano());

		
	}
	
	private String Dia() {
		
	return String.format("%02d", dia);
	
		
	}
	
	
	private String Mes() {
		
		return String.format("%02d", mes);
		
	}
	
	private String Ano() {
		
		return String.format("%02d",ano%100);
		
	}
	
	

}
