public class Overflow4 {
    public static void main(String[] args) {
        // Ejemplo de desbordamiento en una operación de exponenciación con enteros
        int base = 2;
        int exponente = 31;

        // Intentamos calcular 2^31
        int resultado = potencia(base, exponente);

        // Imprimimos el resultado
        System.out.println("Resultado de 2^31: " + resultado); // Se produce un desbordamiento
    }

    // Método para calcular la potencia de un número entero
    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
