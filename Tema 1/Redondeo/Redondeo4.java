public class Redondeo4 {
    public static void main(String[] args) {
        // Ejemplo de error de redondeo en suma con números muy pequeños
        double num1 = 1.0e-16; // Número muy pequeño
        double num2 = 1.0e-16; // Otro número muy pequeño
        double suma = num1 + num2;

        System.out.println("Suma: " + suma); // Imprime 0.0 en lugar de un valor muy pequeño
    }
}
