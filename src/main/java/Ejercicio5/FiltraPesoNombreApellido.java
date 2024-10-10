package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class FiltraPesoNombreApellido {

    public static List<Usuario> getFiltroPesoNombreApellido(List<Usuario> listaTotal) {
        final var listaFinal = new ArrayList<Usuario>();
        for (var elemento : listaTotal) {
            if (elemento.getPeso() > 50 && elemento.getNombre().toUpperCase().startsWith("R")
                    && elemento.getApellido().toUpperCase().endsWith("O")) {
                listaFinal.add(elemento);
            }
        }
        return listaFinal;
    }

}
