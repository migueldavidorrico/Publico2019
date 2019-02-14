package es.orricoquiles.comparacion;

import java.util.Comparator;

public class OrdenNombre implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Persona p1 = (Persona) o1;
        Persona p2 = (Persona) o2;
        return (int) (p1.notaCorte - p2.notaCorte);
    }
}
