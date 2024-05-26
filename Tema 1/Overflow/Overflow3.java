public class Overflow3 {
    public static void main(String[] args) {
        // Ejemplo de desbordamiento en una operación aritmética con enteros grandes
        long a = Long.MAX_VALUE; // Valor máximo para un long
        long suma = a + 1; // Intentamos sumar 1 al valor máximo de un long

        // Imprimimos el resultado
        System.out.println("Resultado de la suma: " + suma); // Se produce un desbordamiento
    }
}
