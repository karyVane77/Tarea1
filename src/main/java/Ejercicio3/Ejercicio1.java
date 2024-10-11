package Ejercicio3;

import com.github.javafaker.Faker;

import java.util.Arrays;

public class Ejercicio1 {

    public static void main(String[] args) {
        final var arreglo = crearArregloAleatorio(500);
        System.out.printf("El arreglo original es: %s%n", Arrays.toString(arreglo));
    }

    public static int[] crearArregloAleatorio(int longitud) {
        var faker = new Faker();
        var arreglo = new int[500];
        for (var i = 0; i < longitud; i++) {
            arreglo[i] = faker.number().numberBetween(1, 1000);
        }
        return arreglo;
    }
}
