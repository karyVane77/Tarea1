package Ejercicio3;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var arreglo = Ejercicio1.crearArregloAleatorio(500);
        mostrarValoresUnicos(obtenerVectorMap(arreglo));
    }

    private static Map<Integer, Integer> obtenerVectorMap(int[] arreglo) {
        final var map = new HashMap<Integer, Integer>();
        for (var elemento : arreglo) {
            map.put(elemento, elemento);
        }
        return map;
    }

    private static void mostrarValoresUnicos(Map<Integer, Integer> mapaUnico) {
        System.out.println("El arreglo con valores unicos es:");
        for (var key : mapaUnico.keySet()) {
            System.out.printf("%d ,", mapaUnico.get(key));
        }
    }
}
