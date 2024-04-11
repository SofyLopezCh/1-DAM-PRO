package teoria.capitulo09;

import misClases.teoria.CFecha;
import misClases.teoria.Leer;

public class CApFecha1 {

	public static void visualizarFecha(CFecha fecha) {
		int [] f = new int[3];
		
		fecha.obtenerFecha(f);
		System.out.println(f[0] + "/" + f[1] + "/" + f[2]);
		
	}
	
	
	public static void main(String[] args) {
		
		CFecha fecha = new CFecha(); //objeto tipo CFecha
		int dia, mes, anio;
		
		do {
			
			System.out.println("dia,  ##   : ");
			dia = Leer.datoInt();
			System.out.println("mes,  ##   : ");
			mes = Leer.datoInt();
			System.out.println("anio, #### : ");
			anio = Leer.datoInt();
			fecha.asignarFecha(dia, mes, anio);
			
		}
		while (!fecha.fechaCorrecta());
		visualizarFecha(fecha);
		
	}
	
}
