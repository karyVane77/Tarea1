package Ejercicio3;

public class SumaInt {

    public static int sumarValores(int[] arreglo) {
        var suma = 0;
        for (var elemento : arreglo) {
            suma += elemento;
        }
        return suma;
    }
}
