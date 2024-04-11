package misClases.avaliacion1;

import java.util.Scanner;

public class CHora {
	
	private Scanner teclado = new Scanner(System.in);

	private int segundos, minuto, hora;

	
	public void recogeSegundo() {
		
		
		do {
			
			System.out.print("Dame Segundos (entre 0 e 59): ");
			segundos = teclado.nextInt();

		} while (segundos <0 || segundos >59);

	}
	public void recogeMinuto() {
		
						
		do {
			
			System.out.print("Dame Minuto (entre 0 e 59): ");
			minuto = teclado.nextInt();

		} while (minuto <0 || minuto >59);
		
	}
	
	public void recogeHora() {
		
			
		do {
			
			System.out.print("Dame Hora (entre 0 e 23): ");
			hora = teclado.nextInt();

		} while (hora <0 || hora >23);
	}
	
	
	public void amosaResultado() {
		
		
		 System.out.print(Horas() + ":" + Minutos()+ ":"+ Segundos());

			
		}
		
		private String Segundos() {
			
		return String.format("%02d", segundos);
		
			
		}
		
		
		private String Minutos() {
			
			return String.format("%02d", minuto);
			
		}
		
		private String Horas() {
			
			return String.format("%02d", hora);
			
		}
		
		

	}
	
	


