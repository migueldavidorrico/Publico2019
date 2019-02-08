package es.orricoquiles.arraylist;

import java.util.ArrayList;

public class Pruebas {
    public static void main(String[] args) {
        int[] array = new int[34];
        int a = 45;
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(new Integer(a));
        listaEnteros.add(new Integer(a + 1));
        listaEnteros.add(new Integer(a + 2));
        listaEnteros.add(new Integer(a));

        listaEnteros.add(2, 32);
        listaEnteros.set(2, 50);
        /*
        char c='r';

        listaEnteros.add(new Character(c));
        String linea="Perico";
        listaEnteros.add(linea);
        */
        System.out.println("******************************");
        for (int i = 0; i < listaEnteros.size(); i++) {
            System.out.print(listaEnteros.get(i) + " ");
        }
        System.out.println("");
        System.out.println(listaEnteros.indexOf(47));

    }
}
