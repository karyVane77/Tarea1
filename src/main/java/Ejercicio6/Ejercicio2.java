package Ejercicio6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var pokemonLista = JsonReader.getPokemonLista();
        final var pokemonesFiltrados = filtrarTipo(pokemonLista, "ELECTRICIDAD");

        final var arrayPokemones = convertirListaArray(pokemonesFiltrados);
        final var arrayPokemonesOrdenados = ordenarMayoraMenorporNivel(arrayPokemones);
        System.out.printf("Pokemons con Tipo Electricidad ordenados de mayor a menor: : %s", Arrays.toString(arrayPokemonesOrdenados));
    }

    private static Pokemon[] convertirListaArray(List<Pokemon> listaPokemon) {
        final var tam= listaPokemon.size();
        final var pokemones = new Pokemon[tam];
        for (var i = 0; i < tam; i++) {
            pokemones[i] = listaPokemon.get(i);
        }
        return pokemones;
    }

    private static List<Pokemon> filtrarTipo(List<Pokemon> listPokemones, String tipo) {
        final var listaFiltro = new ArrayList<Pokemon>();
        for (var elemento : listPokemones) {
            if (elemento.getTipo().equalsIgnoreCase(tipo))
                listaFiltro.add(elemento);
        }
        return listaFiltro;
    }

    public static Pokemon[] ordenarMayoraMenorporNivel(Pokemon[] arreglo) {
        final var n = arreglo.length;
        for (var i = 0; i < n; i++) {
            if (arreglo[i] != null) {
                for (var j = 0; j < n - i - 1; j++) {
                    if (arreglo[j] != null) {
                        if (arreglo[j].getNivel() < arreglo[j + 1].getNivel()) {
                            final var temp = arreglo[j];
                            arreglo[j] = arreglo[j + 1];
                            arreglo[j + 1] = temp;
                        }
                    }
                }
            }
        }
        return arreglo;
    }
}
