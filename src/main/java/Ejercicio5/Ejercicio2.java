package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcelReader.getUsuariosList();
        System.out.printf("Usuarios con correo dominio gmail.com: %s", getFiltroCorreo(listaUsuarios,"GMAIL.COM"));
    }

    private static List<Usuario> getFiltroCorreo(List<Usuario> listaTotal, String email) {
        final var listaFinal = new ArrayList<Usuario>();
        for (var elemento : listaTotal) {
            if (elemento.getCorreo().toUpperCase().contains(email)) {
                listaFinal.add(elemento);
            }
        }
        return listaFinal;
    }
}
