package Ejercicio5;

import com.poiji.bind.Poiji;

import java.io.File;
import java.util.List;

public class ExcelReader {
    private final static String excelPath = "src/main/resources/data/dataExcel.xlsx";

    public static List<Usuario> getUsuariosList() {
        return Poiji.fromExcel(new File(excelPath), Usuario.class);
    }

    public static Usuario[] getUsuariosArray(int size, List<Usuario> usuarioList) {
        final var usuarioArray = new Usuario[size];
        for (int i = 0; i < size; i++) {
            usuarioArray[i] = usuarioList.get(i);
        }
        return usuarioArray;

    }
}
