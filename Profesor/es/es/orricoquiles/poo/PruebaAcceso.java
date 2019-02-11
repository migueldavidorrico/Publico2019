package es.orricoquiles.poo;

import javax.swing.*;
import java.util.ArrayList;

public class PruebaAcceso {
    public static void main(String[] args) {
        ArrayList<Acceso> lista = new ArrayList<>();
        lista.add(new RecienInstalado("admin", ""));
        lista.add(new UsoNormal("usuario", "perico"));
        lista.add(new UsoNormal("root", "123"));

        for (Acceso a :
                lista) {
            if (a.intento(JOptionPane.showInputDialog("Contraseña de " + a.nombre))) {
                JOptionPane.showMessageDialog(null, "Has desbloqueado a " + a.nombre);
            }
        }

    }
}
