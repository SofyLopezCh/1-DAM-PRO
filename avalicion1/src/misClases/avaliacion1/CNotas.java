package misClases.avaliacion1;

public class CNotas {
	private float[] notas = { 3.2F, 7.45F, 8.15F, 5.6F, 5.35F, 9.15F, 2.45F, 4.4F, 6.7F, 1.8F };

//------------PIZA 37 --------------------------------------------	
	public void mostrarNotas() {
		int i; // la i es la posición del dato dentro del array, es 0-1-2-3 etc.

		System.out.println("Relacion de NOTAS");
		System.out.println("=================");
		for (i = 0; i < 10; i++)
			System.out.println("Alumno " + (i + 1) + ": " + notas[i]);
	}

//----------------PIZA 38 ------------------------------------------
	public void mostrarAprobados() {
		int indice; // posición es decir {0, 1, 2, ..., 9} si es 0 indice = 0, si es 5 indice=5

		for (indice = 0; indice <= 9; indice++) {

			if (notas[indice] >= 5) {
				System.out.println("Alumno " + indice + " : " + notas[indice]);

			}

		}

	}

//------------------PIZA 39----------------------------------------	

	public void mostraSuspensos() {
		int indice;

		System.out.print("Relación de SUSPENSOS");
		System.out.println("\n=====================");
		for (indice = 0; indice <= 9; indice++) {
			if (notas[indice] < 5)
				System.out.println("Alumno" + indice + ": " + notas[indice]);

		}

	}
//---------------PIZA40------------------------------------------
	
	public void dameMaior() {

		int indice, indice2 = 0; 
		float maior = 0;
		
		System.out.println("Alumno con MAIOR nota");
		System.out.println("=====================");
		
		for (indice=0; indice <=9; indice++) {
			
			if (notas[indice] >= maior) {
				maior = notas[indice];
				indice2 = indice;
			}	
			
		}
		System.out.println("Alumno " + indice2 + ": " + maior);
		
	}

//--------------------------PIZA 41----------------------------
	
	
	public void dameMenor() {
		
		int indice, indice2=0;
		float menor= 10;
		
		
		
		System.out.println("Alumno con MENOR nota");
		System.out.println("=====================");
		for(indice=0 ; indice<=9; indice++) {
			if (notas[indice] <= menor) {
				menor = notas[indice];
				indice2 = indice;
			}
			
		}
		System.out.println("Alumno " + indice2 + ": " + menor);
		
	}
	

	
//-------------------PIZA 42-----------------------------------------------------	
	
	public void NotaMedia() {
		
		int indice, cont=0;
		float media = 0, total = 0;
		
		for ( indice = 0; indice <=9; indice++) {
			cont++;
			total = total + notas[indice];
						
		}
		media = total/cont;
		System.out.println("=====================");
		System.out.println("Nota Media: " + media);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
