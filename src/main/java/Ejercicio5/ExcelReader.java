package Ejercicio5;

import com.poiji.bind.Poiji;

import java.io.File;
import java.util.List;

public class ExcelReader {
    private final static String excelPath = "src/main/resources/data/dataExcel.xlsx";

    public static List<Usuario> getUsuariosList() {
        return Poiji.fromExcel(new File(excelPath), Usuario.class);
    }
}
