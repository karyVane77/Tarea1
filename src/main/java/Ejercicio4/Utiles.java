package Ejercicio4;

import com.github.javafaker.Faker;

public class Utiles {
    public static double[] crearArregloAleatorio(int longitud,int min,int max) {
        final var faker = new Faker();
        final var arreglo = new double[500];
        for (var i = 0; i < longitud; i++) {
            arreglo[i] = faker.number().randomDouble(2, min, max);
        }
        return arreglo;
    }
}