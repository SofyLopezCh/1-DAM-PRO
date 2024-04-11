package teoria.capitulo09;

import misClases.teoria.CFecha;
import misClases.teoria.Leer;

public class CApFecha2 {

	public static void visualizarFecha(CFecha fecha) {
		int [] f = new int[3];
		
		fecha.obtenerFecha(f);
		System.out.println(f[0] + "/" + f[1] + "/" + f[2]);
		
	}
	
	
	public static void main(String[] args) {
		
		CFecha fecha1 = new CFecha(); //objeto tipo CFecha
		CFecha fecha2 = new CFecha(3);
		CFecha fecha3 = new CFecha(15, 3);
		CFecha fecha4 = new CFecha(1,3,2002);
		
		visualizarFecha(fecha1);
		visualizarFecha(fecha2);
		visualizarFecha(fecha3);
		visualizarFecha(fecha4);
		System.out.println();
		
		fecha1.copiar(fecha2.copiar(fecha3));
		CFecha fecha5 = new CFecha();
		fecha5 = fecha1;
		visualizarFecha(fecha1);
		visualizarFecha(fecha2);
		visualizarFecha(fecha3);
		visualizarFecha(fecha5);
	}
		
		
}
