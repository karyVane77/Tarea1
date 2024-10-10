package Ejercicio6;

import java.util.Arrays;

public class Ejer06 {
    public static void main(String[] args) {
        final var jsonPath = "src/main/resources/data/pokemones.json";
        
        final var pokemonArray = JsonReader.getPokemosArray(jsonPath);
        System.out.printf("Pokemons con Tipo Aire y Hembras: %s", Arrays.toString(FiltraTipoGenero.filtrarTipoGenero(pokemonArray)));

        final var electricidadLista = FiltraTipoOrdena.filtrarTipo(pokemonArray);
        final var electricidadArray = JsonReader.obtenerArrayPokemon(electricidadLista.size(), electricidadLista);
        FiltraTipoOrdena.ordenarMayoraMenorporNivel(electricidadArray);
        System.out.printf("Pokemons con Tipo Electricidad ordenados de mayor a menor: %s", Arrays.toString(electricidadArray));

        final var ubicacionLista = FiltraUbicacionOrdena.filtrarUbicacion(pokemonArray);
        final var ubicaArray = JsonReader.obtenerArrayPokemon(ubicacionLista.size(), ubicacionLista);
        FiltraUbicacionOrdena.ordenarMenoraMayorporNombre(ubicaArray);
        System.out.printf("Pokemons con Ubicacion CERULEAN CITY ordenados de menor a mayor por nombre: %s", Arrays.toString(ubicaArray));

        System.out.printf("Pokemos con HP incrementado en 500: %s", AumentarHP.aumentarHPPokemon(pokemonArray));

        final var idPokemon01 = "PKM-133";
        final var idPokemon02 = "PKM-134";
        System.out.printf("La suma de las defensas de los Pokemons con id %s y id %s es %.2f", idPokemon01, idPokemon02,
                SumaDefensas.sumaDefensaporId(pokemonArray, idPokemon01, idPokemon02));

    }
}
