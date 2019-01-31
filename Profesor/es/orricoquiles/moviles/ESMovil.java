package es.orricoquiles.moviles;

import javax.swing.*;
import java.math.BigDecimal;

public class ESMovil {
    public static void muestraMovil(Movil movil){
        String salida="";
        salida+="<html><pre style=\"font-size:24px;\">";
        salida+=movil.getPrecio()+"€<br>";
        salida+=movil.getGigasMemoria()+" Gigas<br>";
        salida+=movil.getMegaPixelesCamaraTrasera()+" Mpx de cámara";
        JOptionPane.showMessageDialog(
                null,
                salida,
                movil.getMarca().toUpperCase()+" - "+movil.getModelo(),
                JOptionPane.PLAIN_MESSAGE,
                movil.getFoto());
    }
    public static Movil leeMovil(){
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        String nombreFichero=chooser.getSelectedFile().getName();
        Movil nuevo=new Movil("Prueba","Prueba", BigDecimal.valueOf(9.80),4,7.6,nombreFichero);
        return nuevo;
    }
}
