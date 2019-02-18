package es.orricoquiles.comparacion;

import java.util.Comparator;

public enum ComparacionesCanciones {
    POR_NOMBRE((o1, o2) -> {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }),
    POR_PREMIOS((o1, o2) -> o1.getPremios().size() - o2.getPremios().size());


    private final Comparator<Cancion> comparador;

    public Comparator<Cancion> getComparador() {
        return comparador;
    }

    ComparacionesCanciones(Comparator<Cancion> cancionComparator) {
        this.comparador = cancionComparator;
    }
}
