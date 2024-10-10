package Ejercicio4;

public class SumaDouble {
    public static double sumarValores(double[] arreglo) {
        var suma = 0.0;
        for (var elemento : arreglo) {
            suma += elemento;
        }
        return suma;
    }
}
