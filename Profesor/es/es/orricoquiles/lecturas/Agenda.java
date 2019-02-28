package es.orricoquiles.lecturas;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Agenda implements Interactuable {
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

    @Override
    public void muestraUnoAUno() {
        for (Contacto c :
                this.contactos) {
            JOptionPane.showMessageDialog(null, c.nombre);
        }

    }

    @Override
    public void muestraLista() {
        String salida = "";
        for (Contacto c :
                this.contactos) {
            salida += c.nombre + "\n";
        }
        JOptionPane.showMessageDialog(null, salida);

    }

    @Override
    public void anyadeUno() {
        this.anyadeContacto(new Contacto(JOptionPane.showInputDialog("Nombre del contacto?")));
    }
}
