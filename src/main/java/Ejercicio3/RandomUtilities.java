package Ejercicio3;

import com.github.javafaker.Faker;

public class RandomUtilities {
    public static int[] crearArregloAleatorio(int longitud,int min,int max) {
        final var faker = new Faker();
        final var arreglo = new int[longitud];
        for (var i = 0; i < longitud; i++) {
            arreglo[i] = faker.number().numberBetween(min, max);
        }
        return arreglo;
    }
}
