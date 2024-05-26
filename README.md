# Métodos Númericos

## índice
+ Introducción
+ Tema 1: Introducción a los métodos numéricos.
  - Overflow.
      - Definición.
      - Algoritmo.
      - Código en Java.
      - Ejercicios.
  - Redondeo.
      - Definición.
      - Algoritmo.
      - Código en Java.
      - Ejercicios.
  - Truncamiento.
      - Definición.
      - Algoritmo.
      - Código en Java.
      - Ejercicios.
+ Tema 2: Métodos de solución de ecuaciones.
  - Bisección.
      - Definición.
      - Algoritmo.
      - Código en Java.
      - Ejercicios.
  - Regla falsa.
      - Definición.
      - Algoritmo.
      - Código en Java.
      - Ejercicios.
  - Secante.
      - Definición.
      - Algoritmo.
      - Código en Java.
      - Ejercicios.
+ Tema 3: Métodos de solución de sistemas de ecuaciones.
  - Eliminación Gaussiana.
      - Definición.
      - Algoritmo.
      - Código en Java.
      - Ejercicios.
  - Gauss-Jordan.
      - Definición.
      - Algoritmo.
      - Código en Java.
      - Ejercicios.
  - Gauss-Seidel.
      - Definición.
      - Algoritmo.
      - Código en Java.
      - Ejercicios.
  - Jacobi.
      - Definición.
      - Algoritmo.
      - Código en Java.
      - Ejercicios.
+ Tema 4: Diferenciación e integración numérica.
  - Simpson 1/3.
      - Definición.
      - Algoritmo.
      - Código en Java.
      - Ejercicios.
  - Simpson 3/8.
      - Definición.
      - Algoritmo.
      - Código en Java.
      - Ejercicios.
  - Trapecio.
      - Definición.
      - Algoritmo.
      - Código en Java.
      - Ejercicios.
+ Tema 5: Interpolación y ajuste de funciones.
  - Interpolación cuadrática.
      - Definición.
      - Algoritmo.
      - Código en Java.
      - Ejercicios.
  - Interpolación lineal.
      - Definición.
      - Algoritmo.
      - Código en Java.
      - Ejercicios.
  - Lagrange.
      - Definición.
      - Algoritmo.
      - Código en Java.
      - Ejercicios.
  - Newton.
      - Definición.
      - Algoritmo.
      - Código en Java.
      - Ejercicios.
+ Tema 6: Solución de ecuaciones diferenciales.
  - Euler.
      - Definición.
      - Algoritmo.
      - Código en Java.
      - Ejercicios.
  - Runge-Kutta.
      - Definición.
      - Algoritmo.
      - Código en Java.
      - Ejercicios.
  - Taylor.
      - Definición.
      - Algoritmo.
      - Código en Java.
      - Ejercicios.

# Introducción
Los métodos numéricos son técnicas matemáticas que permiten encontrar soluciones aproximadas a problemas complejos que no pueden resolverse de manera analítica. Estos métodos son fundamentales en diversas áreas de la ingeniería, la física, la economía y otras disciplinas que requieren soluciones precisas a problemas matemáticos complicados. En este repositorio, exploraremos una variedad de métodos numéricos, desde los más básicos hasta los más avanzados, implementados en el lenguaje de programación Java.

********************************************************************************************************************************************
********************************************************************************************************************************************
********************************************************************************************************************************************

# Tema 1: Introducción a los Métodos Numéricos
Este primer tema proporciona una base sólida sobre conceptos esenciales como el overflow, el redondeo y el truncamiento. Se define cada concepto, se explica el algoritmo correspondiente y se proporciona código en Java junto con ejercicios prácticos.
# Overflow.
## Definición
El overflow (desbordamiento) es un fenómeno que ocurre en los cálculos numéricos cuando un resultado excede el rango máximo que puede ser representado por el tipo de dato utilizado en un sistema informático. Esto puede provocar resultados incorrectos y comportamientos inesperados en los programas.

## Algoritmo
1. Definir los límites del tipo de dato.
2. Verificar las condiciones de overflow antes de realizar la operación.
3. Implementar la lógica para lanzar una excepción o manejar el overflow si se detecta.

```
function safeAdd(x, y):
    if x > 0 and y > 0 and x > MAX_INT - y:
        throw OverflowException("Overflow positivo detectado")
    else if x < 0 and y < 0 and x < MIN_INT - y:
        throw OverflowException("Overflow negativo detectado")
    else:
        return x + y

function main():
    a = MAX_INT
    b = 1
    
    try:
        result = safeAdd(a, b)
        print("Resultado de la suma: " + result)
    except OverflowException as e:
        print("Overflow detectado: " + e.message)
```
## Código en Java
```
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
```
### Salida
![Captura de pantalla (374)](https://github.com/AlanOrgazVillegas/MetodosNumericos_T6/assets/147757830/6f3ccc8e-502d-4196-b214-1b5e7ae937a9)
## Ejercicios
[Enlace de ejercicios](https://github.com/AlanOrgazVillegas/MetodosNumericos_T6/tree/main/Tema%201/Overflow) 

********************************************************************************************************************************************

# Redondeo.
## Definición.

## Algoritmo.

## Código en Java.

### Salida

## Ejercicios

********************************************************************************************************************************************
# Truncamiento.
## Definición.

## Algoritmo.

## Código en Java.

### Salida

## Ejercicios

********************************************************************************************************************************************
********************************************************************************************************************************************
********************************************************************************************************************************************

# Tema 2: Métodos de Solución de Ecuaciones
Aquí se exploran técnicas para resolver ecuaciones no lineales. Los métodos de bisección, regla falsa y secante se presentan con sus definiciones, algoritmos detallados, implementaciones en Java y ejercicios prácticos.
# Bisección.
## Definición.

## Algoritmo.

## Código en Java.

### Salida

## Ejercicios

********************************************************************************************************************************************
# Regla Falsa.
## Definición.

## Algoritmo.

## Código en Java.

### Salida

## Ejercicios

********************************************************************************************************************************************
# Secante.
## Definición.

## Algoritmo.

## Código en Java.

### Salida

## Ejercicios

********************************************************************************************************************************************
********************************************************************************************************************************************
********************************************************************************************************************************************

# Tema 3: Métodos de Solución de Sistemas de Ecuaciones
Este tema aborda métodos para resolver sistemas de ecuaciones lineales. Se incluyen la eliminación gaussiana, Gauss-Jordan, Gauss-Seidel y Jacobi.
# Eliminación Gaussiana.
## Definición.

## Algoritmo.

## Código en Java.

### Salida

## Ejercicios

********************************************************************************************************************************************
# Gauss-Jordan.
## Definición.

## Algoritmo.

## Código en Java.

### Salida

## Ejercicios

********************************************************************************************************************************************
# Gauss-Seidel.
## Definición.

## Algoritmo.

## Código en Java.

### Salida

## Ejercicios

********************************************************************************************************************************************
# Jacobi.
## Definición.

## Algoritmo.

## Código en Java.

### Salida

## Ejercicios

********************************************************************************************************************************************
********************************************************************************************************************************************
********************************************************************************************************************************************

# Tema 4: Diferenciación e Integración Numérica
Aquí se cubren métodos para la diferenciación e integración de funciones. Se incluyen los métodos de Simpson 1/3, Simpson 3/8 y el método del trapecio.

# Simpson 1/3.
## Definición.

## Algoritmo.

## Código en Java.

### Salida

## Ejercicios

********************************************************************************************************************************************
# Simpson 3/8.
## Definición.

## Algoritmo.

## Código en Java.

### Salida

## Ejercicios
********************************************************************************************************************************************
# Trapecio.
## Definición.

## Algoritmo.

## Código en Java.

### Salida

## Ejercicios

********************************************************************************************************************************************
# Tema 5: Interpolación y Ajuste de Funciones
En este tema se estudian técnicas de interpolación y ajuste de funciones, como la interpolación cuadrática, lineal, de Lagrange y de Newton.

# Interpolación Cuadrática.
## Definición.

## Algoritmo.

## Código en Java.

### Salida

## Ejercicios

********************************************************************************************************************************************
# Interpolación Lineal.
## Definición.

## Algoritmo.

## Código en Java.

### Salida

## Ejercicios

********************************************************************************************************************************************
# Lagrange.
## Definición.

## Algoritmo.

## Código en Java.

### Salida

## Ejercicios

********************************************************************************************************************************************
# Newton.
## Definición.

## Algoritmo.

## Código en Java.

### Salida

## Ejercicios

********************************************************************************************************************************************
********************************************************************************************************************************************
********************************************************************************************************************************************

# Tema 6: Solución de Ecuaciones Diferenciales
Finalmente, se presentan métodos numéricos para la solución de ecuaciones diferenciales, incluyendo los métodos de Euler, Runge-Kutta y Taylor.

# Euler.
## Definición.

## Algoritmo.

## Código en Java.

### Salida

## Ejercicios

********************************************************************************************************************************************
# Runge-Kutta.
## Definición.

## Algoritmo.

## Código en Java.

### Salida

## Ejercicios

********************************************************************************************************************************************
# Taylor.
## Definición.

## Algoritmo.

## Código en Java.

### Salida

## Ejercicios

********************************************************************************************************************************************

Cada tema está estructurado para ofrecer una comprensión completa del método, proporcionando definiciones claras, algoritmos detallados, ejemplos de código en Java y ejercicios prácticos para consolidar el aprendizaje. Esperamos que este repositorio sea una herramienta útil para estudiantes y profesionales interesados en el fascinante campo de los métodos numéricos.
