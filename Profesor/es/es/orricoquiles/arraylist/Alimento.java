package es.orricoquiles.arraylist;

import java.util.Objects;

public class Alimento {
    private final String nombre;
    private int precio;

    public Alimento(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " - " + precio +
                '€';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alimento)) return false;
        Alimento alimento = (Alimento) o;
        return Objects.equals(nombre, alimento.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}

