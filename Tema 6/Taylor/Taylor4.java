public class Taylor4 {
     // Definimos la ecuación diferencial dy/dx = f(x, y)
    // En este ejemplo, vamos a usar dy/dx = 2x + y
    public static double f(double x, double y) {
        return 2 * x + y;
    }

    // Método de Taylor de segundo orden
    public static void metodoTaylor(double x0, double y0, double h, int n) {
        double x = x0;
        double y = y0;

        System.out.printf("x0: %.4f, y0: %.4f%n", x, y);

        // Iteramos n veces para obtener las aproximaciones
        for (int i = 0; i < n; i++) {
            double y1 = y + h * f(x, y) + (h * h / 2) * (2 * f(x, y) + x);
            y = y1;
            x = x + h;

            System.out.printf("x%d: %.4f, y%d: %.4f%n", i + 1, x, i + 1, y);
        }
    }

    public static void main(String[] args) {
        // Valores iniciales
        double x0 = 0.0;
        double y0 = 1.0;
        // Tamaño del paso
        double h = 0.1;
        // Número de iteraciones
        int n = 10;

        // Llamamos al método de Taylor
        metodoTaylor(x0, y0, h, n);
    }
}
