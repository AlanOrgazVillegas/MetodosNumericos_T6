import java.util.function.DoubleUnaryOperator;
public class Truncamiento3 {
    public static void main(String[] args) {
        // Definimos la función a integrar: f(x) = x^2
        DoubleUnaryOperator funcion = x -> x * x;

        // Definimos los límites de integración
        double limiteInferior = 0.0;
        double limiteSuperior = 1.0;

        // Número de términos en la suma de Riemann
        int numTerminos = 1000;

        // Aproximación de la integral mediante la suma de Riemann
        double integralAproximada = calcularSumaRiemann(funcion, limiteInferior, limiteSuperior, numTerminos);

        // Valor verdadero de la integral definida
        double valorVerdadero = calcularValorIntegralVerdadero(limiteInferior, limiteSuperior);

        // Calculamos el error de truncamiento
        double errorTruncamiento = Math.abs(integralAproximada - valorVerdadero);

        // Imprimimos resultados
        System.out.println("Aproximación de la integral: " + integralAproximada);
        System.out.println("Valor verdadero de la integral: " + valorVerdadero);
        System.out.println("Error de truncamiento: " + errorTruncamiento);
    }

    // Método para calcular la suma de Riemann de una función en un intervalo dado
    public static double calcularSumaRiemann(DoubleUnaryOperator funcion, double a, double b, int n) {
        double suma = 0.0;
        double delta_x = (b - a) / n;

        for (int i = 0; i < n; i++) {
            double x_i = a + i * delta_x;
            suma += funcion.applyAsDouble(x_i) * delta_x;
        }

        return suma;
    }

    // Método para calcular el valor verdadero de la integral definida de x^2 en el intervalo [a, b]
    public static double calcularValorIntegralVerdadero(double a, double b) {
        return (Math.pow(b, 3) - Math.pow(a, 3)) / 3.0;
    }
}
