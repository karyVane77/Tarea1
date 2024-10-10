package Ejercicio3;

public class Multiplica {


    public static int[] multiplica2(int[] arreglo) {
        var nuevoArreglo = new int[500];
        for (var i = 0; i < arreglo.length; i++) {
            nuevoArreglo[i] = arreglo[i] * 2;
        }
        return nuevoArreglo;
    }
}
