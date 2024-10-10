package Ejercicio6;

public class SumaDefensas {
    public static double sumaDefensaporId(Pokemon[] listaTotal, String idUser01, String idUser02) {
        var suma = 0.0;
        for (var elemento : listaTotal) {
            if (elemento.getId().equalsIgnoreCase(idUser01) || elemento.getId().equalsIgnoreCase(idUser02)) {
                suma += elemento.getDefensa();
            }
        }
        return suma;
    }
}
