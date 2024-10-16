package Ejercicio3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var arreglo = RandomUtilities.crearArregloAleatorio(500,1,1000);
        System.out.printf("Valores unicos %s", valorUnico(arreglo));
    }

    public static Set<Integer> valorUnico(int[] arreglo) {
        final var items = new HashSet<Integer>();
        for(var elemento:arreglo){
            items.add(elemento);
        }
        return items;
    }
}
