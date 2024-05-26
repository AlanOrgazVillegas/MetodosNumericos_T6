public class Truncamiento5 {
    public static void main(String[] args) {
        // Número de términos en la serie
        int n = 10;

        // Valor en el que evaluamos la serie
        double x = 0.5;

        // Aproximación de la serie mediante un número finito de términos
        double suma = aproximarSerie(x, n);

        // Valor verdadero de la serie (1 / (1 - x))
        double valorVerdadero = 1 / (1 - x);

        // Calculamos el error de truncamiento
        double errorTruncamiento = Math.abs(suma - valorVerdadero);

        // Imprimimos resultados
        System.out.println("Aproximación de la serie: " + suma);
        System.out.println("Valor verdadero de la serie: " + valorVerdadero);
        System.out.println("Error de truncamiento: " + errorTruncamiento);
    }

    // Método para aproximar la serie mediante un número finito de términos
    public static double aproximarSerie(double x, int n) {
        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += Math.pow(x, i);
        }
        return suma;
    }
}
