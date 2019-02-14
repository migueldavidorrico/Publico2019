package es.orricoquiles.arraylist;

import java.util.ArrayList;

public class ExplicacionForEach {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 32, 32, 23, 4, 34, 54, 34, 67};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("-------------------");
        for (int valorActual :
                a) {
            System.out.println(valorActual);
        }
        System.out.println("---------------");
        ArrayList<String> poema = new ArrayList<>();
        poema.add("Cuentan de un sabio");
        poema.add("Que un día");
        poema.add("tan pobre y misero estaba");

        for (int i = 0; i < poema.size(); i++) {
            System.out.println(poema.get(i));
        }
        System.out.println("---------------------");
        for (String s :
                poema) {
            System.out.println(s.toUpperCase());
        }
    }
}
