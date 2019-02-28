package es.orricoquiles.lecturas;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Monedero implements Interactuable {
    int dineroInicial;
    List<Movimiento> movimientos = new ArrayList<>();

    public Monedero(String fichero) {
        List<String> lineaFichero = null;
        try {
            lineaFichero = Files.readAllLines(Paths.get(fichero));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.dineroInicial = Integer.parseInt(lineaFichero.get(0));
        lineaFichero.remove(0);
        for (String s :
                lineaFichero) {
            this.anyadeMovimiento(new Movimiento(Integer.parseInt(s)));
        }
    }

    public void anyadeMovimiento(Movimiento m) {
        this.movimientos.add(m);
    }

    public int getDineroActual() {
        int dinero = this.dineroInicial;
        for (Movimiento movimiento :
                movimientos) {
            dinero += movimiento.cambio;
        }
        return dinero;
    }

    @Override
    public String toString() {
        return this.dineroInicial +
                "Movimientos: " + Arrays.toString(this.movimientos.toArray());
    }

    @Override
    public void muestraUnoAUno() {
        JOptionPane.showMessageDialog(null, "Dinero: " + this.dineroInicial);
        for (Movimiento m :
                this.movimientos) {
            JOptionPane.showMessageDialog(null, "Cambio: " + m.cambio);
        }
        JOptionPane.showMessageDialog(null, "Dinero Final : " + this.getDineroActual());
    }

    @Override
    public void muestraLista() {
        String salida = "DINERO INICIAL:" + this.dineroInicial + "\n";
        for (Movimiento m :
                this.movimientos) {
            salida += m.cambio + "\n";
        }
        salida += "-------------------\n" + this.getDineroActual();
        JOptionPane.showMessageDialog(null, salida);
    }

    @Override
    public void anyadeUno() {
        this.anyadeMovimiento(new Movimiento(
                Integer.parseInt(
                        JOptionPane.showInputDialog("¿Movimiento?")
                )
        ));

    }
}
