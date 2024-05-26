import java.util.ArrayList;
import java.util.List;
public class Lagrange4 {
    private List<Double> xValues;
    private List<Double> yValues;

    public Lagrange4(List<Double> xValues, List<Double> yValues) {
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

        // Definir los puntos conocidos (x, y) para la función cuadrática
        int numPoints = 3; // Número de puntos conocidos
        for (int i = 0; i < numPoints; i++) {
            double xi = 4.0 / (numPoints - 1) * i; // Puntos equidistantes en el intervalo [0, 4]
            x.add(xi);
            y.add(xi * xi - 3 * xi + 2); // Función cuadrática f(x) = x^2 - 3x + 2
        }

        // Crear una instancia de Lagrange4
        Lagrange4 interpolacion = new Lagrange4(x, y);

        // Punto donde queremos aproximar
        double xi = 2.0; // Por ejemplo, aproximaremos en x = 2

        // Calcular el valor aproximado
        double resultado = interpolacion.interpolar(xi);
        System.out.println("El valor aproximado en x = " + xi + " es: " + resultado);
    }
}
