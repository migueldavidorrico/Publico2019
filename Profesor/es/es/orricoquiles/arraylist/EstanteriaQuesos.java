package es.orricoquiles.arraylist;

import java.util.ArrayList;

public class EstanteriaQuesos {
    public static void main(String[] args) {
        ArrayList<Alimento> estanteria = new ArrayList<>();
        estanteria.add(new Alimento("Queso Fresco", 5));
        estanteria.add(new Alimento("Queso de bola", 50));
        estanteria.add(new Precocinado("Queso de Pizza", 15, "Se calienta antes en CO2"));
        estanteria.add(new Precocinado("4 Quesos", 5, "Se mezclan 4 quesos en Nitrógeno"));
        estanteria.add(new Alimento("Queso", 65));


        //Aquí es donde tengo los datos
        for (Alimento a :
                estanteria) {
            System.out.println(a);
        }
        int precocinados = 0;
        for (Alimento a :
                estanteria) {
            if (a instanceof Precocinado) {
                precocinados++;
            }
        }
        int naturales = estanteria.size() - precocinados;
        System.out.println("Hay " + naturales + " naturales " + precocinados + " precocinados");


    }
}
