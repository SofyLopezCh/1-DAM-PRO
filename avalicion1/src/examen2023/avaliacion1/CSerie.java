package examen2023.avaliacion1;

public class CSerie {

	private int num;

	public void amosaA_Bmulti34reves(int a, int b) {

		while (b >= a) {
			
			if (b%3 == 0 && b%4 ==0) 
				System.out.print(" (3-4)." + b);
			
			else if (b%3 == 0)
				System.out.print(" (3)." + b);
			
			else if (b%4 == 0)
				System.out.print(" (4)." + b);
			else 
				System.out.print(" " + b);
			
			b--;
		}

	}

}
