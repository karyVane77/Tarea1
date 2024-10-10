package Ejercicio5;

public class OrdenaApellido {
    public static void ordenarApellidoDesendente(Usuario[] arrayTotal) {
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
