package compilador26_34;

public class compi29 {

	public static void main (String[]arg) {
		
	
	        int anterior = 0;
	        int actual = 1;

	       // System.out.println(anterior + " "); - Imprime el primer número de Fibonacci osea el 0

	        for (int siguiente = anterior + actual; siguiente <= 1000; siguiente = anterior + actual) {
	            System.out.println(siguiente + " "); // Imprime el número de Fibonacci actual

	            // Actualiza los valores de anterior y actual
	            anterior = actual;
	            actual = siguiente;
	        }
	    }
		
	}
	
