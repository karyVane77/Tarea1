package Ejercicio5;

import java.util.Arrays;

public class Ejer05 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcelReader.getUsuariosList();
        ;
        System.out.printf("Usuarios con Peso mayor a 50, nombre comienza en R y apellido termina en O: %s",
                FiltraPesoNombreApellido.getFiltroPesoNombreApellido(listaUsuarios));

        System.out.printf("Usuarios con correo dominio gmail.com: %s", FiltraCorreo.getFiltroCorreo(listaUsuarios));

        System.out.printf("Usuarios con Pais China: %s", FiltrarPais.getFiltroPais(listaUsuarios));
        
        var arrayUsuarios = ExcelReader.getUsuariosArray(listaUsuarios.size(), listaUsuarios);
        OrdenaApellido.ordenarApellidoDesendente(arrayUsuarios);
        System.out.printf("Usuarios ordenados por Apellido de forma Z-A %s", Arrays.toString(arrayUsuarios));

        final var idUser01 = "USR-1";
        final var idUser02 = "USR-3";
        System.out.printf("La suma de las edades de los usuarios con id %s y id %s es %d", idUser01, idUser02,
                SumaEdades.sumaEdadesporId(listaUsuarios, idUser01, idUser02));
    }
}
