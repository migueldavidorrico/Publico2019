package es.orricoquiles.boletin;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PruebaAlumnos {
    public static void main(String[] args) throws IOException {
        List<String> lineasFichero = Files.readAllLines(Paths.get("PrimeroA.csv"));
        System.out.println("CONTENIDO DEL FICHERO:\n________________________");
        for (String s : lineasFichero) {
            System.out.println(s);

        }
        System.out.println("Tenemos " + (lineasFichero.size() - 1) + " alumnos");
        lineasFichero.remove(0);
        ArrayList<Alumno> clase = new ArrayList<>();
        for (String linea : lineasFichero) {
            String[] datos = linea.split(",");
            Alumno a = new Alumno(datos[1], datos[0], 0);
            clase.add(a);

        }

    }
}
