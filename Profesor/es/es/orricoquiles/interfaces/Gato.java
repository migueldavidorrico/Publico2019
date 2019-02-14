package es.orricoquiles.interfaces;

public class Gato extends Animal implements Audible {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String info() {
        return "Felix Domesticus " + nombre;
    }

    @Override
    public String suena() {
        return this.nombre + ": MIAU MIAU";
    }
}
