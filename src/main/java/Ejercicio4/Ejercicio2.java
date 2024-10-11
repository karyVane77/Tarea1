package Ejercicio4;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var arreglo = Utiles.crearArregloAleatorio(500,10000,100000);
        System.out.printf("El arreglo divido entre 100 es: %s%n", Arrays.toString(dividirValor(arreglo)));

    }
    private static double[] dividirValor(double[] arreglo) {
        final var nuevoArreglo = new double[500];
        for (var i = 0; i < arreglo.length; i++) {
            nuevoArreglo[i] = Math.round(arreglo[i]) / Math.pow(10, 2);
        }
        return nuevoArreglo;
    }
}
