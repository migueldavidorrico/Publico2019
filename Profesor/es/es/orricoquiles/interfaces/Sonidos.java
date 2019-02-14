package es.orricoquiles.interfaces;

import java.util.ArrayList;

public class Sonidos {
    public static void main(String[] args) {
        ArrayList<Audible> objetos = new ArrayList<>();
        Perro bobby = new Perro("Bobby");
        objetos.add(bobby);
        Perro pluto = new Perro("Pluto");
        objetos.add(pluto);
        Perro sultan = new Perro("Sultán");
        objetos.add(sultan);
        Flauta travesera = new Flauta("Travesera", 20);
        objetos.add(travesera);
        for (Audible a : objetos) {
            System.out.println(a.suena());
        }


    }
}
