package Ejercicio6;

public class FiltraTipoGenero {

    public static Pokemon[] filtrarTipoGenero(Pokemon[] pokemonArray) {
        var nuevoArreglo = new Pokemon[pokemonArray.length];
        var i = 0;
        for (var elemento : pokemonArray) {
            if (elemento.getTipo().equalsIgnoreCase("AIRE") && !elemento.isMacho()) {
                nuevoArreglo[i] = elemento;
                i++;
            }

        }
        return nuevoArreglo;
    }
}
