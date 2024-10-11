package Ejercicio5;

public class Ejer05 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcelReader.getUsuariosList();
        System.out.printf("La lista de usuarios principal es : %s", listaUsuarios);
    }
}
