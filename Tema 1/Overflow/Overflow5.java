public class Overflow5 {
    public static void main(String[] args) {
        // Ejemplo de desbordamiento en una operación de multiplicación con enteros
        int a = 1000000; // Número grande
        int b = 1000000; // Número grande
        long producto = (long) a * b; // Multiplicación de dos enteros grandes

        // Imprimimos el resultado
        System.out.println("Resultado de la multiplicación: " + producto); // Se produce un desbordamiento
    }
}
