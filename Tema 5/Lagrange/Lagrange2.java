import java.util.ArrayList;
import java.util.List;
public class Lagrange2 {
    List<Double> xValues;
    List<Double> yValues;

    public Lagrange2(List<Double> xValues, List<Double> yValues) {
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

        // Agregar puntos conocidos (x, y)
        x.add(1.0);
        x.add(2.0);
        x.add(3.0);
        y.add(2.0);
        y.add(3.0);
        y.add(5.0);

        // Crear una instancia de InterpolacionLagrange
        Lagrange2 interpolacion = new Lagrange2(x, y);

        // Punto donde queremos aproximar
        double xi = 2.5;

        // Calcular el valor aproximado
        double resultado = interpolacion.interpolar(xi);
        System.out.println("El valor aproximado en x = " + xi + " es: " + resultado);
    }
}
