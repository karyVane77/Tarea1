package Ejercicio3;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var arreglo = Ejercicio1.crearArregloAleatorio(500);
        System.out.printf("El arreglo multiplicado por 2 es: %s%n", Arrays.toString(Ejercicio2.multiplica2(arreglo)));

    }

    private static int[] multiplica2(int[] arreglo) {
        var nuevoArreglo = new int[500];
        for (var i = 0; i < arreglo.length; i++) {
            nuevoArreglo[i] = arreglo[i] * 2;
        }
        return nuevoArreglo;
    }
}
