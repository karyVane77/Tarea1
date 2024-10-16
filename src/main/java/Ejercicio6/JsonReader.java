package Ejercicio6;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonReader {
    private static final String path = "src/main/resources/data/pokemones.json";

    public static List<Pokemon> getPokemonLista() {
        final var objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(path),
                    TypeFactory.defaultInstance().constructCollectionType(List.class, Pokemon.class));
        } catch (IOException ioException) {
            throw new RuntimeException(ioException.getLocalizedMessage());
        }
    }
}
