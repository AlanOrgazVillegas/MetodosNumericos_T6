public class Lineal4 {
    public static void main(String[] args) {
        // Nuevos datos de ejemplo
         double x0 = 1.0;
         double x1 = 4.0;
         double y0 = 3.0;
         double y1 = 15.0;
         double x = 2.5;
 
          // Realizar interpolación lineal
         double resultado = interpolacionLineal(x0, x1, y0, y1, x);
         System.out.println("El resultado de la interpolación lineal en x = " + x + " es: " + resultado); 
     }
     public static double interpolacionLineal(double x0, double x1, double y0, double y1, double x) {
         // Fórmula de la interpolación lineal
         double result = y0 + ((y1 - y0) / (x1 - x0)) * (x - x0);
         return result;
     }
}
