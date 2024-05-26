public class Redondeo2 {
    public static void main(String[] args) {
        // Ejemplo de error de redondeo en sustracción
        double num1 = 1.0;
        double num2 = 0.9999999999999999; // Este número es muy cercano a 1
        double resta = num1 - num2;

        System.out.println("Resta: " + resta); // Imprime un valor muy pequeño en lugar de 0
    }
}
