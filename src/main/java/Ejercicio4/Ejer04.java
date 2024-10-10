package Ejercicio4;

import com.github.javafaker.Faker;

import java.util.Arrays;

public class Ejer04 {
    public static void main(String[] args) {
        final var arreglo = crearArregloAleatorio(500);
        System.out.printf("El arreglo original es: %s%n", Arrays.toString(arreglo));

        System.out.printf("El arreglo divido entre 100 es: %s%n", Arrays.toString(DividirValor.dividirValor(arreglo)));
        System.out.printf("La suma de los valores del arreglo es: %,.2f%n", SumaDouble.sumarValores(arreglo));
        System.out.printf("El arreglo con valores unicos es: %s%n", Arrays.toString(ValorUnicoDouble.valorUnico(arreglo)));
        System.out.printf("El arreglo ordenado de mayor a menor es: %s%n", Arrays.toString(OrdenarValorDouble.ordenarMayoraMenor(arreglo)));
    }

    private static double[] crearArregloAleatorio(int longitud) {
        var faker = new Faker();
        var arreglo = new double[500];
        for (var i = 0; i < longitud; i++) {
            arreglo[i] = faker.number().randomDouble(2, 10000, 100000);
        }
        return arreglo;
    }
}
