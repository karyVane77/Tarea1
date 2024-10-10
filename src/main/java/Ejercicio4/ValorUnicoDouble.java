package Ejercicio4;

public class ValorUnicoDouble {

    public static double[] valorUnico(double[] arreglo) {
        var nuevoArreglo = new double[500];
        var contador = 0;
        var index = 0;
        for (var i = 0; i < arreglo.length; i++) {
            var actual = arreglo[i];
            for (var j = 0; j < arreglo.length; j++) {
                if (actual == arreglo[j])
                    contador++;
            }
            if (contador == 1) {
                nuevoArreglo[index] = actual;
                index++;
            }
            contador = 0;
        }
        return nuevoArreglo;
    }
}
