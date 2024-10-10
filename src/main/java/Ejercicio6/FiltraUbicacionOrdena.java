package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class FiltraUbicacionOrdena {
    public static List<Pokemon> filtrarUbicacion(Pokemon[] pokemonArray) {
        var nuevoArreglo = new ArrayList<Pokemon>();
        for (var elemento : pokemonArray) {
            if (elemento.getUbicacion().equalsIgnoreCase("CERULEAN CITY")) {
                nuevoArreglo.add(elemento);
            }
        }

        return nuevoArreglo;
    }

    public static void ordenarMenoraMayorporNombre(Pokemon[] arreglo) {
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
    }
}
