package Ejercicio4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio3 {
    public static void main(String[] args){
        final var arreglo = Utiles.crearArregloAleatorio(500,10000,100000);
        System.out.printf("Valores unicos %s", valorUnico(arreglo));
    }

    public static Set<Double> valorUnico(double[] arreglo) {
        final  var items =  new HashSet<Double>();
        for(var elemento:arreglo){
            items.add(elemento);
        }
        return items;
    }
}
