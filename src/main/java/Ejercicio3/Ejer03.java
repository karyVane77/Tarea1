package Ejercicio3;

import com.github.javafaker.Faker;

import java.util.Arrays;

public class Ejer03 {

    public static void main(String[] args) {
        final var arreglo = crearArregloAleatorio(500);
        System.out.printf("El arreglo original es: %s%n", Arrays.toString(arreglo));

        System.out.printf("El arreglo multiplicado por 2 es: %s%n", Arrays.toString(Multiplica.multiplica2(arreglo)));
        System.out.printf("La suma de los valores del arreglo es: %d%n", SumaInt.sumarValores(arreglo));
        System.out.printf("El arreglo con valores unicos es: %s%n", Arrays.toString(ValorUnicoInt.valorUnico(arreglo)));
        System.out.printf("El arreglo ordenado de menor a mayor es: %s%n", Arrays.toString(OrdenarValorInt.ordenarMenoraMayor(arreglo)));
    }

    private static int[] crearArregloAleatorio(int longitud) {
        var faker = new Faker();
        var arreglo = new int[500];
        for (var i = 0; i < longitud; i++) {
            arreglo[i] = faker.number().numberBetween(1, 1000);
        }
        return arreglo;
    }
}
