import java.util.ArrayList;
import java.util.List;
public class Lagrange3 {
    private List<Double> xValues;
    private List<Double> yValues;

    public Lagrange3(List<Double> xValues, List<Double> yValues) {
        this.xValues = xValues;
        this.yValues = yValues;
    }

    public double interpolar(double xi) {
        double result = 0.0;

        for (int i = 0; i < xValues.size(); i++) {
            double term = yValues.get(i);
            for (int j = 0; j < xValues.size(); j++) {
                if (j != i) {
                    term *= (xi - xValues.get(j)) / (xValues.get(i) - xValues.get(j));
                }
            }
            result += term;
        }

        return result;
    }

    public static void main(String[] args) {
        // Puntos conocidos
        List<Double> x = new ArrayList<>();
        List<Double> y = new ArrayList<>();

        // Definir los puntos conocidos (x, y) para la función sin(x) en el intervalo [0, pi]
        int numPoints = 5; // Número de puntos conocidos
        for (int i = 0; i < numPoints; i++) {
            double xi = Math.PI / (numPoints - 1) * i;
            x.add(xi);
            y.add(Math.sin(xi));
        }

        // Crear una instancia de InterpolacionLagrange
        Lagrange3 interpolacion = new Lagrange3(x, y);

        // Punto donde queremos aproximar
        double xi = Math.PI / 4; // Por ejemplo, aproximaremos en x = pi/4

        // Calcular el valor aproximado
        double resultado = interpolacion.interpolar(xi);
        System.out.println("El valor aproximado en x = " + xi + " es: " + resultado);
    }
}
