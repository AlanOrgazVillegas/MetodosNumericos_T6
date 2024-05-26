public class GaussSeidel {
    public static void main(String[] args) {
        double[][] coeficientes = {
            {4, -1, 0, 0},
            {-1, 4, -1, 10},
            {0, -1, 4, 10}
        };
        /*
            x1 = 0.8928489685058594
            x2 = 3.5714244842529297
            x3 = 3.3928561210632324
        */
        
        
        double[] valoresIniciales = {0, 0, 0}; // Valores iniciales de las incógnitas
        double tolerancia = 0.0001; // Tolerancia para el criterio de convergencia
        int iteracionesMaximas = 1000; // Número máximo de iteraciones
        
        double[] solucion = gaussSeidel(coeficientes, valoresIniciales, tolerancia, iteracionesMaximas);
        
        if (solucion != null) {
            System.out.println("Solución:");
            for (int i = 0; i < solucion.length; i++) {
                System.out.println("x[" + i + "] = " + solucion[i]);
            }
        } else {
            System.out.println("El método no converge.");
        }
    }
    
    public static double[] gaussSeidel(double[][] coeficientes, double[] valoresIniciales, double tolerancia, int iteracionesMaximas) {
        int n = valoresIniciales.length;
        double[] solucion = new double[n];
        double[] solucionAnterior = new double[n];
        int iteraciones = 0;
        double error = tolerancia + 1;
        
        // Inicializar la solución con los valores iniciales
        System.arraycopy(valoresIniciales, 0, solucion, 0, n);
        
        // Iterar hasta que se alcance la tolerancia o el número máximo de iteraciones
        while (error > tolerancia && iteraciones < iteracionesMaximas) {
            // Copiar la solución anterior
            System.arraycopy(solucion, 0, solucionAnterior, 0, n);
            
            // Calcular la nueva solución
            for (int i = 0; i < n; i++) {
                double suma = 0;
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma += coeficientes[i][j] * solucion[j];
                    }
                }
                solucion[i] = (coeficientes[i][n] - suma) / coeficientes[i][i];
            }
            
            // Calcular el error
            error = 0;
            for (int i = 0; i < n; i++) {
                error += Math.abs(solucion[i] - solucionAnterior[i]);
            }
            
            iteraciones++;
        }
        
        // Verificar la convergencia
        if (error <= tolerancia) {
            return solucion;
        } else {
            return null; // No converge
        }
    }
}
