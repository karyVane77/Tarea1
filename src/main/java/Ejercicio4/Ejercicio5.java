package Ejercicio4;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        final var arreglo = Utiles.crearArregloAleatorio(500, 10000, 100000);
        System.out.printf("El arreglo ordenado de mayor a menor es: %s%n", Arrays.toString(Ejercicio5.ordenarMayoraMenor(arreglo)));
    }

    public static double[] ordenarMayoraMenor(double[] arreglo) {
        final var n = arreglo.length;
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    final var temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo;
    }
}
