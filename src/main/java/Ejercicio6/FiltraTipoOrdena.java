package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class FiltraTipoOrdena {
    public static List<Pokemon> filtrarTipo(Pokemon[] pokemonArray) {
        var nuevoArreglo = new ArrayList<Pokemon>();
        for (var elemento : pokemonArray) {
            if (elemento.getTipo().equalsIgnoreCase("ELECTRICIDAD")) {
                nuevoArreglo.add(elemento);
            }
        }

        return nuevoArreglo;
    }

    public static void ordenarMayoraMenorporNivel(Pokemon[] arreglo) {
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
    }


}
