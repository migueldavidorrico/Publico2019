package es.orricoquiles.jerarquia;

import javax.swing.*;

public class SeleccionPersonaje {
    public static void main(String[] args) {
        Mago miguel = new Mago("Fizban", Raza.HUMANO);
        JOptionPane.showMessageDialog(null, "<html>" + miguel.info());
        miguel.subirNivel();
        miguel.subirNivel();
        JOptionPane.showMessageDialog(null, "<html>" + miguel.info());

    }
}
