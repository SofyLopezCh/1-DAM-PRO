package pruebasJUnit;

public class Persona {
	
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		
	}
	
	
	public String getNombre() {
		return nombre;
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public boolean esMayorDeEdad(int edad) {
		edad = 18;
		//return edad >= 18;
		return edad <= this.getEdad();
		
	}
	
	public static void main(String[] args) {
		Persona p1 = new Persona("Ana", 25);
		
		System.out.println("El nombre es: " + p1.getNombre());
		
		p1.setNombre("Antonio");
		p1.setEdad(30);
		System.out.println("El nombre es: " + p1.getNombre());
		System.out.println("La edad es: " + p1.getEdad());
		System.out.println("Mayor de edad: " + p1.esMayorDeEdad(p1.getEdad()));
		
	}
	

}
