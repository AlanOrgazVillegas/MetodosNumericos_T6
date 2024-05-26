public class Overflow {
    public static void main(String[] args) {
        // Ejemplo de desbordamiento en operaciones aritméticas con enteros
        int a = Integer.MAX_VALUE; // Valor máximo para un entero
        int b = 1; // Incremento en 1

        // Intentamos incrementar el valor máximo de un entero
        int suma = a + b;

        // Imprimimos el resultado
        System.out.println("Resultado de la suma: " + suma); // Se produce un desbordamiento
    }
}
