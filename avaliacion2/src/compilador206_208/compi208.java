package compilador206_208;
import misClases.avaliacion2.CVectorAleatorio;
public class compi208 {
	public static void main(String[] args) {
		CVectorAleatorio objeto = new CVectorAleatorio();
		int num;
		do {
			num=objeto.recolleOpcion();
			switch(num) {
			case 1:
				objeto.inicilizaAleatorio();
				break;
			case 2:
				objeto.amosaVector();
				break;
			case 3:
				objeto.ordenaAscendente();
				break;
			case 4:
				objeto.ordenaDescendente();
				break;
			case 5:
				System.out.println("FINAL");
				break;
			default:
				System.out.println("OPCION Erronea");
					
			}
			
		}while(num!=5);
	}

}