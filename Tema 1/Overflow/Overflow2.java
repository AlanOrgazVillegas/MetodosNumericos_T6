public class Overflow2 {
    public static void main(String[] args) {
        // Ejemplo de desbordamiento en multiplicación con enteros
        int a = Integer.MAX_VALUE; // Valor máximo para un entero
        int b = 2; // Multiplicación por 2

        // Intentamos multiplicar el valor máximo de un entero por 2
        int producto = a * b;

        // Imprimimos el resultado
        System.out.println("Resultado de la multiplicación: " + producto); // Se produce un desbordamiento
    }
}
