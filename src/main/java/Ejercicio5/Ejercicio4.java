package Ejercicio5;

import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcelReader.getUsuariosList();
        var arrayUsuarios = getUsuariosArray(listaUsuarios.size(), listaUsuarios);
        Ejercicio4.ordenarApellidoDesendente(arrayUsuarios);
        System.out.printf("Usuarios ordenados por Apellido de forma Z-A %s", Arrays.toString(arrayUsuarios));
    }

    private static Usuario[] getUsuariosArray(int size, List<Usuario> usuarioList) {
        final var usuarioArray = new Usuario[size];
        for (int i = 0; i < size; i++) {
            usuarioArray[i] = usuarioList.get(i);
        }
        return usuarioArray;

    }

    private static void ordenarApellidoDesendente(Usuario[] arrayTotal) {
        final var n = arrayTotal.length;
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (arrayTotal[j].getApellido().compareTo(arrayTotal[j + 1].getApellido()) > 0) {
                    final var temp = arrayTotal[j];
                    arrayTotal[j] = arrayTotal[j + 1];
                    arrayTotal[j + 1] = temp;
                }
            }
        }
    }
}
