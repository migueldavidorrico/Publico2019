package es.orricoquiles.boletin;

import java.util.Comparator;

public class ComparaPorApellido implements Comparator<Alumno> {
    @Override
    public int compare(Alumno o1, Alumno o2) {
        if (o1.apellidos.equals(o2.apellidos)) { //Lopez lopez con Lopez Lopez
            if (o1.nombre.equals(o2.nombre)) {
                return o1.numeroLista - o2.numeroLista;
            } else {
                return o1.nombre.compareTo(o2.nombre);
            }
        }
        return o1.apellidos.compareTo(o2.apellidos);
    }
}
