package misClases.teoria;

public class CListaTfnos {

	private CPersona[] listaTelefonos;
	int nElementos;

	public CListaTfnos() {

		nElementos = 0;
		listaTelefonos = new CPersona[nElementos];

	}

	private void unElmentoMas(CPersona[] listaActual) {
		nElementos = listaActual.length;
		listaTelefonos = new CPersona[nElementos + 1];
		// copiar lista actual
		for (int i = 0; i < nElementos; i++)
			listaTelefonos[i] = listaActual[i];
		nElementos++;

	}

	private void unElementoMenos(CPersona[] listaActual) {
		nElementos = listaActual.length;
		listaTelefonos = new CPersona[nElementos - 1];
		// copiar lista actual
		for (int i = 0; i < nElementos; i++)
			if (listaActual[i] != null)
				listaTelefonos[i] = listaActual[i];
		nElementos--;
	}

	public void ponerValorEn(int i, CPersona objeto) {
		if (i >= 0 && i < nElementos)
			listaTelefonos[i] = objeto;
		else
			System.out.println("Índice fuera de límites");
	}

	public CPersona valorEn(int i) {
		if (i >= 0 && i < nElementos)
			return listaTelefonos[i];
		else {
			System.out.println("Índice fuera de límites");
			return null;
		}

	}

	public int longitud() {
		return nElementos;

	}

	public void anhadir(CPersona obj) {

	}

	public boolean eliminar(long tel) {
		for (int i = 0; i < nElementos; i++)
			if (listaTelefonos[i].obtenerTelefono() == tel) {
				listaTelefonos[i] = null;
				unElementoMenos(listaTelefonos);
				return true;
			}
		return false;

	}

	public int buscar(String str, int pos) {

		String nom;
		if (str == null)
			return -1;
		if (pos < 0)
			pos = 0;
		for (int i = pos; i < nElementos; i++) {

			nom = listaTelefonos[i].obtenerNombre();
			if (nom == null)
				continue;
			// ¿str está contenida en nom?
			if (nom.indexOf(str) > -1)
				return i;
		}
		return -1;

	}

	public void mostrarListaTFnos() {

	}

}
