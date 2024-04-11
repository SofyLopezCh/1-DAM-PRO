package teoria.capitulo04;

import misClases.teoria.CComputador;

class CApComputador {
public static void main(String[] args) {
		
		CComputador computador = new CComputador();
		
		System.out.println("===================================================");
		computador.EncenderOrdenador();
		System.out.println("===================================================");
		computador.AsignarValores("Ast","Intel Pentium","TFT");
		CComputador.garantia();
		computador.Estado();
		System.out.println("===================================================");
		computador.ApagarOrdenador();
		System.out.println("===================================================");
		computador.Estado();
		System.out.println("===================================================");
		computador.EncenderOrdenador();
		System.out.println("===================================================");
		computador.AsignarValores("HP","AMD","CRT");
		computador.Estado();
		System.out.println("===================================================");
		computador.ApagarOrdenador();
		System.out.println("===================================================");
		computador.Estado();
		
		
		
		
		
		
	}

}