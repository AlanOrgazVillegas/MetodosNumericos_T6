public class Truncamiento2 {
    public static void main(String[] args) {
        // Ejemplo de error de truncamiento al aproximar una función mediante un polinomio
        double x = 0.5; // Valor en el que evaluamos la función
        double resultadoAproximado = aproximarFuncion(x);

        // Valor verdadero de la función en x=0.5
        double valorVerdadero = Math.sin(x);

        System.out.println("Aproximación de la función: " + resultadoAproximado);
        System.out.println("Valor verdadero de la función: " + valorVerdadero);
        System.out.println("Error de truncamiento: " + Math.abs(resultadoAproximado - valorVerdadero));
    }

    // Método para aproximar la función seno mediante un polinomio de grado 1 (sin(x) ≈ x)
    public static double aproximarFuncion(double x) {
        return x;
    }
}
