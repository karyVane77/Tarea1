package Ejercicio3;

public class ValorUnicoInt {

    public static int[] valorUnico(int[] arreglo) {
        var nuevoArreglo = new int[500];
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
