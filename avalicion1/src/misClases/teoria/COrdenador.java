package misClases.teoria;

public class COrdenador {	


	public String Marca;
	public String Procesador;
	public String Pantalla;
	
	boolean OrdenadorEncendido;
	boolean Presentacion;	
	
	
	public void EncenderOrdenador() {
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
	
	public void Estado()
	{
		System.out.println("\nEstado del ordenador:" + 
							"\n- Marca: " + Marca + 
							"\n- Procesador: " + Procesador +
							"\n- Pantalla: " + Pantalla + "\n"
				);
		if(OrdenadorEncendido == true) {
			System.out.println("El ordenador está encendido.");
		}
		else {
			System.out.println("El ordenador está apagado.");
		}
		
	}
	
	public void ApagarOrdenador() {
		OrdenadorEncendido = false;
		System.out.println("========================================");
		System.out.println("El ordenador se ha apagado.");		
		System.out.println("========================================");
		
	}
	
	public void modificar(String marca,String procesador, String pantalla) {
		
		this.Marca = marca;
		this.Procesador = procesador;
		this.Pantalla = pantalla;		
		
	}

}
