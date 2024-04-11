package misClases.teoria;

public class CPersona {

	private String nombre;
	private String direccion;
	private long telefono;

	// métodos
	public CPersona() {
	}

	public CPersona(String nom, String dir, long tel) {

		nombre = nom;
		direccion = dir;
		telefono = tel;

	}

	public void asignarNombre(String nom) {
		nombre = nom;

	}

	public String obtenerNombre() {
		return nombre;
	}

	public void asignarDirección(String dir) {
		direccion = dir;

	}

	public String obtenerDirección() {
		return direccion;
	}

	public void asignarTelefono(long tel) {
	telefono = tel;
	
	}
	
	
	public long obtenerTelefono() {
		
		return telefono;
	}
	
	
}
