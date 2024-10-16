package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var pokemonLista = JsonReader.getPokemonLista();
        final var pokemonesFinal = aumentarHPPokemon(pokemonLista, 500);

        System.out.printf("Pokemos con HP incrementado en 500: : %s", pokemonesFinal);
    }

    private static List<Pokemon> aumentarHPPokemon(List<Pokemon> listPokemones, int valorHp) {
        final var listaFinal= new ArrayList<Pokemon>();
        for (var pokemon : listPokemones) {
            pokemon.setHp(pokemon.getHp() + valorHp);
            listaFinal.add(pokemon);
        }
        return listaFinal;
    }
}
