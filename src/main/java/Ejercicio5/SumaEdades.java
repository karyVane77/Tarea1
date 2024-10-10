package Ejercicio5;

import java.util.List;

public class SumaEdades {
    public static int sumaEdadesporId(List<Usuario> listaTotal, String idUser01, String idUser02) {
        var suma = 0;
        for (var elemento : listaTotal) {
            if (elemento.getId().equalsIgnoreCase(idUser01) || elemento.getId().equalsIgnoreCase(idUser02)) {
                suma += elemento.getEdad();
            }
        }
        return suma;
    }
}
