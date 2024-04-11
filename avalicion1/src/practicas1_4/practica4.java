package practicas1_4;
import java.io.IOException;
import misClases.avaliacion1.CTecla;

public class practica4 {
	public static void main(String[] args) throws IOException{

		CTecla objeto = new CTecla();

		objeto.recogedixito();
		objeto.recogevocal();
		objeto.recogevocalm();
		objeto.recogeconsonante();
		objeto.recogeconsonantem();
		;

		objeto.amosaResultado();

	}
}
