package misClases.teoria;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CFecha {

	private int dia, mes, anio;

	public CFecha() {

	}

	public CFecha(int dd) {

	}

	public CFecha(int dd, int mm) {

	}

	public CFecha(int dd, int mm, int aaaa) {

	}

	protected void finalize() throws Throwable {

	}

	protected boolean bisiesto() {
		return ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0));

	}

	public void asignarFecha() {
		GregorianCalendar fechaActual = new GregorianCalendar();
		dia = fechaActual.get(Calendar.DAY_OF_MONTH);
		mes = fechaActual.get(Calendar.MONTH) + 1;
		anio = fechaActual.get(Calendar.YEAR);

	}

	public void asignarFecha(int dd) {
		asignarFecha();
		dia = dd;

	}

	public void asignarFecha(int dd, int mm) {
		asignarFecha();
		dia = dd;
		mes = mm;

	}

	public void asignarFecha(int dd, int mm, int aaaa) {

		dia = dd;
		mes = mm;
		anio = aaaa;

	}

	public void obtenerFecha(int[] fecha) {

		fecha[0] = dia;
		fecha[1] = mes;
		fecha[2] = anio;

	}

	public boolean fechaCorrecta() {

		boolean diaCorrecto, mesCorrecto, anioCorrecto;
		// año correto?
		anioCorrecto = (anio >= 1582);

		// mes Correcto?
		mesCorrecto = (mes >= 1) && (mes <= 12);

		// dia Correcto?

		switch (mes) {

		case 2:
			if (bisiesto())
				diaCorrecto = (dia >= 1 && dia <= 29);
			else
				diaCorrecto = (dia >= 1 && dia <= 28);
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = (dia >= 1 && dia <= 30);
			break;
		default:
			diaCorrecto = (dia >= 1 && dia <= 31);

		}
		return diaCorrecto && mesCorrecto && anioCorrecto;
	}

	public  CFecha  copiar(CFecha obj) 
	{
	dia = obj.dia;
	mes = obj.mes;
	anio = obj.anio;
	return this;
		
		
	}

}
