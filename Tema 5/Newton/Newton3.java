import java.util.ArrayList;
import java.util.List;

public class Newton3 {
    List<Double> xValues;
    List<Double> yValues;
    double[][] dividedDifferences;

    public Newton3(List<Double> xValues, List<Double> yValues) {
        this.xValues = xValues;
        this.yValues = yValues;
        calculateDividedDifferences();
    }

    // Método para calcular las diferencias divididas
    private void calculateDividedDifferences() {
        int n = xValues.size();
        dividedDifferences = new double[n][n];
        
        // Inicializar la primera columna con los valores de y
        for (int i = 0; i < n; i++) {
            dividedDifferences[i][0] = yValues.get(i);
        }

        // Calcular las diferencias divididas
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < n - j; i++) {
                dividedDifferences[i][j] = (dividedDifferences[i + 1][j - 1] - dividedDifferences[i][j - 1]) /
                                           (xValues.get(i + j) - xValues.get(i));
            }
        }
    }

    // Método para evaluar el polinomio interpolante de Newton en un punto xi
    public double interpolate(double xi) {
        double result = dividedDifferences[0][0];
        double term = 1.0;

        for (int i = 1; i < xValues.size(); i++) {
            term *= (xi - xValues.get(i - 1));
            result += term * dividedDifferences[0][i];
        }

        return result;
    }

    public static void main(String[] args) {
        // Puntos conocidos
        List<Double> x = new ArrayList<>();
        List<Double> y = new ArrayList<>();

        // Definir los puntos conocidos (x, y) para la función cúbica
        int numPoints = 5; // Número de puntos conocidos
        for (int i = 0; i < numPoints; i++) {
            double xi = -2.0 + (4.0 / (numPoints - 1)) * i; // Puntos equidistantes en el intervalo [-2, 2]
            x.add(xi);
            y.add(xi * xi * xi - 2 * xi * xi + xi + 1); // Función cúbica f(x) = x^3 - 2x^2 + x + 1
        }

        // Crear una instancia de MetodoNewton
        Newton3 interpolacion = new Newton3(x, y);

        // Punto donde queremos aproximar
        double xi = 1.0; // Por ejemplo, aproximaremos en x = 1

        // Calcular el valor aproximado
        double resultado = interpolacion.interpolate(xi);
        System.out.println("El valor aproximado en x = " + xi + " es: " + resultado);
    }
}
