package Ejercicio5;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("usuarios")
public class Usuario {
    @ExcelCellName("ID")
    private String id;
    @ExcelCellName("NOMBRE")
    private String nombre;
    @ExcelCellName("APELLIDO")
    private String apellido;
    @ExcelCellName("EDAD")
    private int edad;
    @ExcelCellName("PESO")
    private double peso;
    @ExcelCellName("CORREO")
    private String correo;
    @ExcelCellName("USERNAME")
    private String username;
    @ExcelCellName("PASSWORD")
    private String password;
    @ExcelCellName("PAIS")
    private String pais;
    @ExcelCellName("UNIVERSIDAD")
    private String universidad;

    @Override
    public String toString() {
        final var multilinea = """
                {
                    id: %s
                    nombre: %s
                    apellido: %s
                    edad: %d
                    peso:%.2f
                    correo: %s
                    username: %s
                    password: %s
                    pais: %s
                    universidad: %s
                }
                """;
        return String.format(multilinea, id, nombre, apellido, edad, peso, correo, username, password, pais, universidad);
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUniversidad() {
        return universidad;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getPeso() {
        return peso;
    }

    public String getPais() {
        return pais;
    }
}
