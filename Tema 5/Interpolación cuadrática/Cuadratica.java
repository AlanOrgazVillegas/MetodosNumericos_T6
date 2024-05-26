public class Cuadratica {
    public static void main(String[] args) {
        // Datos de ejemplo
       double x0 = 1.0;
       double x1 = 2.0;
       double x2 = 3.0;
       double y0 = 3.0;
       double y1 = 5.0;
       double y2 = 9.0;
       double x = 2.5;
       // Realizar interpolación cuadrática
       double resultado = interpolacionCuadratica(x0, x1, x2, y0, y1, y2, x);
       System.out.println("El resultado de la interpolación cuadrática en x = " + x + " es: " + resultado);
   }
   
   public static double interpolacionCuadratica(double x0, double x1, double x2, double y0, double y1, double y2, double x) {
       double L0 = ((x - x1) * (x - x2)) / ((x0 - x1) * (x0 - x2));
       double L1 = ((x - x0) * (x - x2)) / ((x1 - x0) * (x1 - x2));
       double L2 = ((x - x0) * (x - x1)) / ((x2 - x0) * (x2 - x1));

       double result = (y0 * L0) + (y1 * L1) + (y2 * L2);
       return result;
   }
}
