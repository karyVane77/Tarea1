package Ejercicio6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var pokemonLista = JsonReader.getPokemonLista();
        final var pokemonesFiltro = filtrarUbicacion(pokemonLista, "CERULEAN CITY");
        final var arrayPokemones = convertirListaArray(pokemonesFiltro);
        final var arrayPokemonesOrdenados = ordenarMenoraMayorporNombre(arrayPokemones);
        System.out.printf("Pokemons con Ubicacion CERULEAN CITY ordenados de menor a mayor por nombre : %s", Arrays.toString(arrayPokemonesOrdenados));
    }

    private static List<Pokemon> filtrarUbicacion(List<Pokemon> listPokemones, String ubicacion) {
        final var listaFiltro = new ArrayList<Pokemon>();
        for (var elemento : listPokemones) {
            if (elemento.getUbicacion().equals(ubicacion))
                listaFiltro.add(elemento);
        }
        return listaFiltro;
    }

    private static Pokemon[] convertirListaArray(List<Pokemon> listPokemones) {
        final var tam = listPokemones.size();
        final var pokemones = new Pokemon[tam];
        for (var i = 0; i < tam; i++) {
            pokemones[i] = listPokemones.get(i);
        }
        return pokemones;
    }

    private static Pokemon[] ordenarMenoraMayorporNombre(Pokemon[] arreglo) {
        final var n = arreglo.length;
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (arreglo[j].getNombre().compareTo(arreglo[j + 1].getNombre()) > 0) {
                    final var temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo;
    }
}
