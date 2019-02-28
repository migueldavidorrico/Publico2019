package es.orricoquiles.lecturas;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class
ProgramaPrincipal {
    public static void main(String[] args) {
        Agenda agenda = new Agenda("contactos.txt");
        System.out.println(agenda);
        Monedero m = new Monedero("movimientos.txt");
        System.out.println(m);
        System.out.println("Al final: " + m.getDineroActual());


        List<Interactuable> informacionPersonal = new ArrayList<>();
        informacionPersonal.add(agenda);
        informacionPersonal.add(m);

        JFrame pepe = new JFrame();
//        pepe.setBounds(10,10,300,300);
        JPanel ventana = new JPanel(new GridLayout(0, 2));
        pepe.add(ventana);
        ventana.add(new JLabel("Nombre"));
        ventana.add(new JTextField("Introduce Nombre"));
        ventana.add(new JLabel("Edad"));
        ventana.add(new JTextField(""));
        ventana.add(new JLabel("Apellidos"));
        ventana.add(new JTextField("Introduce texto"));
        for (int i = 0; i < 50; i++) {

            ventana.add(new JButton("Aceptar"));
        }
        pepe.pack();
        pepe.setVisible(true);

//        for (Interactuable i :
//                informacionPersonal) {
//            i.muestraLista();
//        }
//
//
//        for (Interactuable i :
//                informacionPersonal) {
//            i.anyadeUno();
//            i.anyadeUno();
//        }
//
//        //Mostrar todo
//        for (Interactuable i :
//                informacionPersonal) {
//            i.muestraLista();
//        }
    }
}
