package Ejercicio4;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var arreglo = Utiles.crearArregloAleatorio(500,10000,100000);
        System.out.printf("La suma de los valores del arreglo es: %,.2f%n", sumarValores(arreglo));
    }

    private static double sumarValores(double[] arreglo) {
        var suma = 0.0;
        for (var elemento : arreglo) {
            suma += elemento;
        }
        return suma;
    }
}
