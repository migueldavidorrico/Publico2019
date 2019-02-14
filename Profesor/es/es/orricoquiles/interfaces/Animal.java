package es.orricoquiles.interfaces;

public abstract class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract String info();
}
