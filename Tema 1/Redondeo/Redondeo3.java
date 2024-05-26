public class Redondeo3 {
    public static void main(String[] args) {
        // Ejemplo de error de redondeo en división
        double numerador = 1.0e20; // Numerador grande
        double denominador = 1.0;  // Denominador pequeño
        double division = numerador / denominador;

        System.out.println("División: " + division); // Imprime un valor infinito
    }
}
