package Ejercicio6;

import java.util.Arrays;

public class Ejer06 {
    public static void main(String[] args) {
        final var pokemonesLista = JsonReader.getPokemonLista();
        System.out.printf("Pokemones: %s", pokemonesLista);
    }
}
