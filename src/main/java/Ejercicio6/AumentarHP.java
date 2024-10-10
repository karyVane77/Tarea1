package Ejercicio6;

public class AumentarHP {
    public static Pokemon[] aumentarHPPokemon(Pokemon[] pokemonArray) {
        var nuevoArreglo = new Pokemon[pokemonArray.length];
        var i = 0;
        for (var elemento : pokemonArray) {
            elemento.setHp(elemento.getHp() + 500);
            nuevoArreglo[i] = elemento;
            i++;

        }
        return nuevoArreglo;
    }
}
