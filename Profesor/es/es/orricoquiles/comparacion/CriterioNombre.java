package es.orricoquiles.comparacion;

import java.util.Comparator;

public class CriterioNombre implements Comparator<Electrodomestico> {
    @Override
    public int compare(Electrodomestico o1, Electrodomestico o2) {
        if (o1.marca.equals(o2.marca)) {
            return o1.modelo.compareTo(o2.modelo);
        }
        return o1.marca.compareTo(o2.marca);
    }
}
