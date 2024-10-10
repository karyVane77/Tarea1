package Ejercicio6;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonReader {
    public static Pokemon[] getPokemosArray(String path) {
        final var objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(path),
                    TypeFactory.defaultInstance().constructArrayType(Pokemon.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Pokemon[] obtenerArrayPokemon(int size, List<Pokemon> pokemonList) {
        final var pokemonArray = new Pokemon[size];
        for (int i = 0; i < size; i++) {
            pokemonArray[i] = pokemonList.get(i);
        }
        return pokemonArray;

    }
}
