package es.orricoquiles.poo;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Texto {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lineas = (ArrayList<String>) Files.readAllLines(Paths.get("texto.txt"));
        System.out.println(lineas.size());
        BigDecimal precio1 = BigDecimal.valueOf(0.65);
        BigDecimal precio2 = BigDecimal.valueOf(0.65);
        BigDecimal total = precio1.add(precio2);
        System.out.println(total);

    }
}
