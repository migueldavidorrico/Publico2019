package es.orricoquiles.comparacion;

import java.util.Comparator;

public class CriterioEficiencia implements Comparator<Electrodomestico> {
    @Override
    public int compare(Electrodomestico o1, Electrodomestico o2) {
        if (o1.eficiencia.equals(o2.eficiencia)) {
            return o1.consumo - o2.consumo;
        }
        return o1.eficiencia.compareTo(o2.eficiencia);
    }
}
