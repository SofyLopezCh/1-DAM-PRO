package misClases.teoria;

public class CExpresion {
	private double a;
    private double b;
    private double c;

    public void AsignarDatos(double coeficienteA, double coeficienteB, double coeficienteC) {
        a = coeficienteA;
        b = coeficienteB;
        c = coeficienteC;
    }

    public void VisualizarResultado() {
        double resultado = (b * b - 4 * a * c) / (2 * a);
        System.out.println("Resultado: " + resultado);
    }
}