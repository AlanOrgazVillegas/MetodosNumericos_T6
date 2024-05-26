import java.util.function.DoubleUnaryOperator;
public class Truncamiento4 {
    public static void main(String[] args) {
        // Definimos la función f(x) = x^3
        DoubleUnaryOperator funcion = x -> x * x * x;

        // Punto en el que aproximamos la derivada
        double punto = 2.0;

        // Tamaño del paso para las diferencias finitas
        double h = 0.01;

        // Aproximación de la derivada mediante diferencias finitas hacia adelante
        double derivadaAproximada = diferenciaFinitaAdelante(funcion, punto, h);

        // Valor verdadero de la derivada de f(x) = x^3 en x = 2
        double valorVerdadero = 3 * punto * punto;

        // Calculamos el error de truncamiento
        double errorTruncamiento = Math.abs(derivadaAproximada - valorVerdadero);

        // Imprimimos resultados
        System.out.println("Aproximación de la derivada: " + derivadaAproximada);
        System.out.println("Valor verdadero de la derivada: " + valorVerdadero);
        System.out.println("Error de truncamiento: " + errorTruncamiento);
    }

    // Método para calcular la derivada mediante diferencias finitas hacia adelante
    public static double diferenciaFinitaAdelante(DoubleUnaryOperator funcion, double x, double h) {
        return (funcion.applyAsDouble(x + h) - funcion.applyAsDouble(x)) / h;
    }
}
