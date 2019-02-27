package es.orricoquiles.oscars2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Oscars2019 {
    public static void main(String[] args) {
        Pelicula p = new Pelicula("Green Book", "Peter Farrelli", "Vigo Mortenstein", "Linda Cardellini");
        Pelicula p2 = new Pelicula("Black Panther", "Ryan Coller", "Pepe", "Ana");
        Pelicula p3 = new Pelicula("300", "Juanito", "Antonio", "Bea");
        Pelicula p4 = new Pelicula("Star Wars", "Peter Jackson", "Frodo", "Salomé");
        Pelicula p5 = new Pelicula("La Bella y La Bestia", "John Travolta", "La Bestia", "La Bella");
        Pelicula p6 = new Pelicula("Roma", "Alfonso Couso", "Cesar", "Mesalina");

        Nominacion mejor1 = new NominacionPelicula(p);
        Nominacion mejor2 = new NominacionPelicula(p2);
        Nominacion mejor3 = new NominacionPelicula(p3);
        Nominacion mejor4 = new NominacionPelicula(p4);
        Nominacion nom1 = new NominacionPelicula(p5);
        Nominacion nom2 = new NominacionPelicula(p6);

        List<Premio> gala2019 = new ArrayList<Premio>();


        gala2019.add(new Premio("Mejor Director",
                15,
                2, PremiosPosibles.MEJOR_DIRECTOR));
        gala2019.add(new Premio("Mejor BSO",
                8,
                5, PremiosPosibles.MEJOR_BSO));
        gala2019.add(new Premio("Mejor Película",
                23,
                1, PremiosPosibles.MEJOR_PELICULA));
        gala2019.add(new Premio("Mejor ACtriz",
                21,
                3, PremiosPosibles.MEJOR_ACTRIZ));
        gala2019.add(new Premio("Mejor Actor",
                5,
                3, PremiosPosibles.MEJOR_ACTOR));


        gala2019.get(0).anyadeNominada(mejor1);
        gala2019.get(0).anyadeNominada(mejor2);
        gala2019.get(0).anyadeNominada(mejor3);
        gala2019.get(1).anyadeNominada(mejor1);
        gala2019.get(1).anyadeNominada(mejor2);
        gala2019.get(1).anyadeNominada(nom1);
        gala2019.get(1).anyadeNominada(nom2);
        gala2019.get(2).anyadeNominada(mejor1);
        gala2019.get(2).anyadeNominada(mejor2);
        gala2019.get(2).anyadeNominada(mejor3);
        gala2019.get(3).anyadeNominada(mejor1);
        gala2019.get(3).anyadeNominada(mejor2);
        gala2019.get(3).anyadeNominada(nom1);
        gala2019.get(3).anyadeNominada(nom2);
        gala2019.get(4).anyadeNominada(mejor1);
        gala2019.get(4).anyadeNominada(mejor2);
        gala2019.get(4).anyadeNominada(mejor3);

        //Collections.sort(gala2019);
        Collections.sort(gala2019);

        for (Premio premio :
                gala2019) {
            System.out.println(premio.informacion());
        }
    }
}
