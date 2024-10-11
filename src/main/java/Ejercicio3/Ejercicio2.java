package Ejercicio3;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var arreglo = RandomUtilities.crearArregloAleatorio(500,1,1000);
        System.out.printf("El arreglo multiplicado por 2 es: %s%n", Arrays.toString(Ejercicio2.multiplica2(arreglo)));

    }

    private static int[] multiplica2(int[] arreglo) {
        var tam=arreglo.length;
        var nuevoArreglo = new int[tam];
        for (var i = 0; i < tam; i++) {
            nuevoArreglo[i] = arreglo[i] * 2;
        }
        return nuevoArreglo;
    }
}
