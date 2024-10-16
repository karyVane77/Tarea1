package Ejercicio3;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        final var arreglo = RandomUtilities.crearArregloAleatorio(500,1,1000);
        System.out.printf("El arreglo ordenado de menor a mayor es: %s%n", Arrays.toString(Ejercicio5.ordenarMenoraMayor(arreglo)));
    }

    private static int[] ordenarMenoraMayor(int[] arreglo) {
        final var n = arreglo.length;
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    final var temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo;
    }
}
