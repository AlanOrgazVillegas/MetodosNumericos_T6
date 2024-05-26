import java.util.ArrayList;
import java.util.List;
public class Lagrange {
    // Método para calcular el polinomio de Lagrange
    public static double lagrange(List<Double> x, List<Double> y, double xi) {
        double result = 0;

        for (int i = 0; i < x.size(); i++) {
            double term = y.get(i);
            for (int j = 0; j < x.size(); j++) {
                if (j != i) {
                    term = term * (xi - x.get(j)) / (x.get(i) - x.get(j));
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

        // Agregar puntos conocidos (x, y)
        x.add(1.0);
        x.add(2.0);
        x.add(3.0);
        y.add(2.0);
        y.add(3.0);
        y.add(5.0);

        // Punto donde queremos aproximar
        double xi = 2.5;

        // Calcular el valor aproximado usando el método de Lagrange
        double result = lagrange(x, y, xi);
        System.out.println("El valor aproximado en x = " + xi + " es: " + result);
    }
}
