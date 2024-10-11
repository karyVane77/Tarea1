package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcelReader.getUsuariosList();

        System.out.printf("Usuarios con Peso mayor a 50, nombre comienza en R y apellido termina en O: %s",
                getFiltroPesoNombreApellido(listaUsuarios,50,"R","O"));
    }

    private static List<Usuario> getFiltroPesoNombreApellido(List<Usuario> listaTotal,int peso,String nombre,String apellido) {
        final var listaFinal = new ArrayList<Usuario>();
        for (var elemento : listaTotal) {
            if (elemento.getPeso() > peso && elemento.getNombre().toUpperCase().startsWith(nombre)
                    && elemento.getApellido().toUpperCase().endsWith(apellido)) {
                listaFinal.add(elemento);
            }
        }
        return listaFinal;
    }

}
