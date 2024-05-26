public class Gaussiana5 {
    public static void main(String[] args) {
        //paso 1 declarar matriz a resolver
        double[][] matriz = {
            {1,1,-1,7},
            {4,-1,5, 4},
            {2,2,-3,0}   
        };
        /*
        x1=-9
        x2=30
        x3=14
         */
        //paso 2 declarar un vector de la solucion
        double[] solucion = resolverSistema(matriz);
        //mostrar la solución
        System.out.println("Solución:");
        for (int i = 0; i < solucion.length; i++) {
            System.out.println("x[" + i + "] = " + solucion[i]);
        }
    }

    //metodo para resolver la matriz que retorna un vevtor de tipo double que reciba la matriz
    public static double[] resolverSistema(double[][] matriz) {
        //declaro una variable donde guarde la longitud de la matriz
        int n = matriz.length;
        //declaro un vector del tamaño de la solucion
        double[] solucion = new double[n];
        for (int i = 0; i < n; i++) {
            // Hacer los elementos debajo de la diagonal i-ésima igual a cero
            for (int j = i + 1; j < n; j++) {
                double factor = matriz[j][i] / matriz[i][i];
                for (int k = i; k < n + 1; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
        // Sustitución hacia atrás
        for (int i = n - 1; i >= 0; i--) {
            solucion[i] = matriz[i][n] / matriz[i][i];
            for (int j = i - 1; j >= 0; j--) {
                matriz[j][n] -= matriz[j][i] * solucion[i];
            }
        }

        return solucion;
    }
}
