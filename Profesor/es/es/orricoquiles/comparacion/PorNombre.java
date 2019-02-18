package es.orricoquiles.comparacion;

import java.util.Comparator;

public class PorNombre implements Comparator<Cancion> {
    @Override
    public int compare(Cancion o1, Cancion o2) {
        if (o1.getTitulo().equals(o2.getTitulo())) {
            return o1.getPremios().size() - o2.getPremios().size();
        }
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
}
