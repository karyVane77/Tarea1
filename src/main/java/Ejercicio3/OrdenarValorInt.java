package Ejercicio3;

public class OrdenarValorInt {

    public static int[] ordenarMenoraMayor(int[] arreglo) {
        final var n = arreglo.length;
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    final var temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo;
    }
}
