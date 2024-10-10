package Ejercicio4;

public class DividirValor {
    public static double[] dividirValor(double[] arreglo) {
        var nuevoArreglo = new double[500];
        for (var i = 0; i < arreglo.length; i++) {
            nuevoArreglo[i] = Math.round(arreglo[i]) / Math.pow(10, 2);
        }
        return nuevoArreglo;
    }
}
