package es.orricoquiles.lecturas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LecturaMovimientos {
    public static void main(String[] args) {
        List<String> lineaFichero = null;
        try {
            lineaFichero = Files.readAllLines(Paths.get("movimientos.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String s :
                lineaFichero) {
            System.out.println(s);
        }
        int dineroInicial = Integer.parseInt(lineaFichero.get(0));
        System.out.println("Empiezo con:" + dineroInicial);
        lineaFichero.remove(0);
        for (String s :
                lineaFichero) {
            dineroInicial += Integer.parseInt(s);
        }
        System.out.println(dineroInicial);
    }
}
