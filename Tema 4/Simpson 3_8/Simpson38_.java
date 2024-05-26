import java.util.function.Function;
public class Simpson38_ {
// Función para calcular la integral utilizando la regla de Simpson 3/8
public static double simpson38(Function<Double, Double> f, double a, double b, int n) {
    double h = (b - a) / n;
    double suma = f.apply(a) + f.apply(b);
    
    for (int i = 1; i < n; i++) {
        double x = a + i * h;
        if (i % 3 == 0) {
            suma += 2 * f.apply(x);
        } else {
            suma += 3 * f.apply(x);
        }
    }
    
    return (3 * h / 8) * suma;
}

// Ejemplo de uso
public static void main(String[] args) {
    // Definir la función que queremos integrar
    Function<Double, Double> funcion = x -> 0.2 + (25*x) - (200*Math.pow(x, 2)) + (675*Math.pow(x, 3)) - (900*Math.pow(x, 4)) + (400*Math.pow(x, 5));

    // Definir los límites de integración
    double a = 0; // Límite inferior
    double b = 0.8; // Límite superior

    // Definir el número de subdivisiones (debe ser múltiplo de 3)
    int n = 3;

    // Calcular la aproximación de la integral
    double integral = simpson38(funcion, a, b, n);

    // Imprimir el resultado
    System.out.println("Aproximación de la integral: " + integral);
}
}
