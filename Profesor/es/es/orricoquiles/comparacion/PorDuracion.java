package es.orricoquiles.comparacion;

import java.util.Comparator;

public class PorDuracion implements Comparator<Cancion> {

    @Override
    public int compare(Cancion o1, Cancion o2) {
        return o2.getDuracion() - o1.getDuracion();
    }
}
