package Ejercicio6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {
    public static void main(String[] args) {
        final var pokemones = JsonReader.getPokemonLista();

        final var mapPokemones = convertirMap(pokemones);
        final var pokemon01 = mapPokemones.get("PKM-133");
        final var pokemon02 = mapPokemones.get("PKM-134");
        final var sumarDefensa = pokemon01.getDefensa() + pokemon02.getDefensa();

        System.out.printf("La suma de las defensas de los Pokemons 1 %s y 2 %s es %.2f", pokemon01, pokemon02,
                sumarDefensa);
    }

    private static Map<String, Pokemon> convertirMap(List<Pokemon> listPokemones) {
        final var mapPokemones = new HashMap<String, Pokemon>();
        for (var elemento : listPokemones) {
            mapPokemones.put(elemento.getId(), elemento);
        }
        return mapPokemones;
    }
}
