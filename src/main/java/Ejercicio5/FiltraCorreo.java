package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class FiltraCorreo {
    public static List<Usuario> getFiltroCorreo(List<Usuario> listaTotal) {
        final var listaFinal = new ArrayList<Usuario>();
        for (var elemento : listaTotal) {
            if (elemento.getCorreo().toUpperCase().contains("GMAIL.COM")) {
                listaFinal.add(elemento);
            }
        }
        return listaFinal;
    }
}
