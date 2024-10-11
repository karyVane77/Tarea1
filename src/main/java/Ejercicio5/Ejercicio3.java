package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcelReader.getUsuariosList();
        System.out.printf("Usuarios con Pais China: %s", getFiltroPais(listaUsuarios,"CHINA"));
    }

    private static List<Usuario> getFiltroPais(List<Usuario> listaTotal, String pais) {
        final var listaFinal = new ArrayList<Usuario>();
        for (var elemento : listaTotal) {
            if (elemento.getPais().equalsIgnoreCase(pais)) {
                listaFinal.add(elemento);
            }
        }
        return listaFinal;
    }
}
