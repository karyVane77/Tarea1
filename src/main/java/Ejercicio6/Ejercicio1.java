package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var pokemonesLista = JsonReader.getPokemonLista();
        final var pokemonesFiltrados = filtrarTipoGenero(pokemonesLista, "AIRE");
        System.out.printf("Pokemons con Tipo Aire y Hembras: %s", pokemonesFiltrados);
    }

    private static List<Pokemon> filtrarTipoGenero(List<Pokemon> listPokemones, String tipo) {
        final var listFiltro = new ArrayList<Pokemon>();
        for (var elemento : listPokemones) {
            if (elemento.getTipo().equalsIgnoreCase(tipo) && !elemento.isMacho())
                listFiltro.add(elemento);
        }
        return listFiltro;
    }
}
