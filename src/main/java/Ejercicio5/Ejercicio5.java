package Ejercicio5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcelReader.getUsuariosList();

        final var mapUsuarios = convertirMap(listaUsuarios);
        final var user01 = mapUsuarios.get("USR-1");
        final var user02 = mapUsuarios.get("USR-4");
        final var sumaEdades = user01.getEdad() + user02.getEdad();

        System.out.printf("La suma de las edades de los usuarios 1:  %s y 2: %s es %d", user01, user02,
               sumaEdades);
    }

    private static Map<String, Usuario> convertirMap(List<Usuario> listaUsuarios) {
        final var mapUsers = new HashMap<String, Usuario>();
        for (var elemento : listaUsuarios) {
            mapUsers.put(elemento.getId(), elemento);
        }
        return mapUsers;
    }

    private static int sumaEdadesporId(List<Usuario> listaTotal, String idUser01, String idUser02) {
        var suma = 0;
        for (var elemento : listaTotal) {
            if (elemento.getId().equalsIgnoreCase(idUser01) || elemento.getId().equalsIgnoreCase(idUser02)) {
                suma += elemento.getEdad();
            }
        }
        return suma;
    }
}
