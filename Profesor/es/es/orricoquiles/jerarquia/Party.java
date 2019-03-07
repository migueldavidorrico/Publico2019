package es.orricoquiles.jerarquia;

import javax.swing.*;
import java.util.ArrayList;

public class Party {
    ArrayList<PersonajeRPG> componentes;

    public Party() {
        this.componentes = new ArrayList<>();
    }

    public static void main(String[] args) {
        Party miParty = new Party();
        miParty.componentes.add(new Mago("Ana", Raza.HUMANO));
        miParty.componentes.add(new Guerrero("Bea", Raza.HUMANO));
        miParty.componentes.add(new Guerrero("Clara", Raza.ENANO));
        miParty.componentes.add(new MagoElemental("Delia"));
        miParty.componentes.add(new MagoGuerrero("Elena"));

        String salida = "<html>";
        for (PersonajeRPG p :
                miParty.componentes) {
            salida += "<hr><hr><hr>";
            salida += p.info();
        }
        JOptionPane.showMessageDialog(null, salida);

        for (PersonajeRPG p :
                miParty.componentes) {
            p.subirNivel();
        }

        salida = "<html>";
        for (PersonajeRPG p :
                miParty.componentes) {
            salida += "<hr><hr><hr>";
            salida += p.info();
        }
        JOptionPane.showMessageDialog(null, salida);

        int numeroMagos = 0;
        for (PersonajeRPG p :
                miParty.componentes) {
            if (p instanceof Mago) {
                numeroMagos++;
            }
        }
        System.out.println("Hay " + numeroMagos + " Magos");

    }
}
