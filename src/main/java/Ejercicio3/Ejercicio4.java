package Ejercicio3;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var arreglo = Ejercicio1.crearArregloAleatorio(500);
        System.out.printf("La suma de los valores del arreglo es: %d%n", Ejercicio4.sumarValores(arreglo));
    }

    private static int sumarValores(int[] arreglo) {
        var suma = 0;
        for (var elemento : arreglo) {
            suma += elemento;
        }
        return suma;
    }
}
