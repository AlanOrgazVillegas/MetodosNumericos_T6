public class Truncamiento {
    public static void main(String[] args) {
        // Ejemplo de error de truncamiento en la aproximación de una serie infinita
        int n = 10; // Número de términos a considerar en la serie
        double x = 0.5; // Valor en el que evaluamos la serie
        double suma = 0.0;

        for (int i = 0; i < n; i++) {
            suma += Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
        }

        System.out.println("Aproximación de la serie: " + suma); // Imprime un valor aproximado
    }

    // Método para calcular el factorial de un número
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
