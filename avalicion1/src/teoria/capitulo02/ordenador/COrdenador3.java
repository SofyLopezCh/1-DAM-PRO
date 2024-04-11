package teoria.capitulo02.ordenador;

public class COrdenador3 {	

	
	String Marca;
	String Procesador;
	String Pantalla;
	
	boolean OrdenadorEncendido;
	boolean Presentacion;	
	
	
	void EncenderOrdenador() {
		if(OrdenadorEncendido == true) {
			System.out.println("========================================");
			System.out.println("El ordenador ya está encendido.");
			System.out.println("========================================");
		}else {
			System.out.println("========================================");
			System.out.println("El ordenador se ha encendido.");
			System.out.println("========================================");
			OrdenadorEncendido = true;
		}
			
	}
	
	void Estado()
	{
		System.out.println("\nEstado del ordenador3:" + 
							"\n -Marca: " + Marca + 
							"\n -Procesador: " + Procesador +
							"\n -Pantalla: " + Pantalla + "\n"
				);
		if(OrdenadorEncendido == true) {
			System.out.println("El ordenador3 está encendido.");
		}
		else {
			System.out.println("El ordenador3 está apagado.");
		}
		
	}
	
	void ApagarOrdenador() {
		OrdenadorEncendido = false;
		System.out.println("========================================");
		System.out.println("El ordenador se ha apagado.");		
		System.out.println("========================================");
		
	}

}
