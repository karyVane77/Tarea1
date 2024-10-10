package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class FiltrarPais {
    public static List<Usuario> getFiltroPais(List<Usuario> listaTotal) {
        final var listaFinal = new ArrayList<Usuario>();
        for (var elemento : listaTotal) {
            if (elemento.getPais().equalsIgnoreCase("CHINA")) {
                listaFinal.add(elemento);
            }
        }
        return listaFinal;
    }
}
