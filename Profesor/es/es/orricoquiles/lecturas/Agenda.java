package es.orricoquiles.lecturas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Agenda {
    List<Contacto> contactos = new ArrayList<>();

    public void anyadeContacto(Contacto c) {
        this.contactos.add(c);
    }

    public Agenda(String nombreFichero) {
        List<String> lineaFichero = null;
        try {
            lineaFichero = Files.readAllLines(Paths.get(nombreFichero));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String s :
                lineaFichero) {
            this.anyadeContacto(new Contacto(s));
        }
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contactos=" + Arrays.toString(contactos.toArray()) +
                '}';
    }
}
