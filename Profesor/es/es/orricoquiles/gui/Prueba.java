package es.orricoquiles.gui;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prueba {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setBounds(30, 30, 500, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();

        panel.add(new JLabel("Nombre"));
        panel.add(new JTextField("Escriba su nombre", 15));
        panel.add(new JLabel("Edad"));
        panel.add(new JTextField("edad", 3));
        JButton boton = new JButton("Púlsame");

        panel.add(boton);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 100; i++) {
                    JOptionPane.showMessageDialog(ventana, "Cierrame");
                }
            }
        });


        ventana.add(panel);
        ventana.setVisible(true);


    }
}
