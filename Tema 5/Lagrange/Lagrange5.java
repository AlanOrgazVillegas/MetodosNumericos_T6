import java.util.ArrayList;
import java.util.List;
public class Lagrange5 {
    List<Double> xValues;
    List<Double> yValues;

    public Lagrange5(List<Double> xValues, List<Double> yValues) {
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

        // Definir los puntos conocidos (x, y) para la función trigonométrica
        int numPoints = 4; // Número de puntos conocidos
        for (int i = 0; i < numPoints; i++) {
            double xi = Math.PI / (numPoints - 1) * i; // Puntos equidistantes en el intervalo [0, pi]
            x.add(xi);
            y.add(Math.cos(xi)); // Función trigonométrica f(x) = cos(x)
        }

        // Crear una instancia de InterpolacionLagrange
        Lagrange5 interpolacion = new Lagrange5(x, y);

        // Punto donde queremos aproximar
        double xi = Math.PI / 2; // Por ejemplo, aproximaremos en x = pi/2

        // Calcular el valor aproximado
        double resultado = interpolacion.interpolar(xi);
        System.out.println("El valor aproximado en x = " + xi + " es: " + resultado);
    }
}
