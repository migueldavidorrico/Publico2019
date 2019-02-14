package es.orricoquiles.interfaces;

public class Perro extends Animal implements Audible {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String info() {
        return "Canis Vulgaris " + this.nombre;
    }

    @Override
    public String suena() {
        return this.nombre + ": GUAU GUAU";
    }
}
