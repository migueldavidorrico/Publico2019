package es.orricoquiles.arraylist;

import java.util.ArrayList;

public class Supermercado {
    public static void main(String[] args) {
        ArrayList<Alimento> listaCompra = new ArrayList<>();
        listaCompra.add(new Alimento("PATATAS", 200));
        listaCompra.add(new Alimento("MANZANAS", 200));

        Alimento peras = new Alimento("PERAS", 200);
        listaCompra.add(peras);
        listaCompra.add(new Precocinado("ATUN EN CONSERVA", 200, "ACEITE OLIVA"));
        listaCompra.add(new Precocinado("PAELLA", 200, "Congelado"));

        for (Alimento a :
                listaCompra) {
            System.out.println(a);
        }

        listaCompra.remove(1);
        System.out.println("*************************");
        for (Alimento a :
                listaCompra) {
            System.out.println(a);
        }
        System.out.println(listaCompra.indexOf(new Alimento("PAELLA", 0)));

    }
}
