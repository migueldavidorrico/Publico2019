package es.orricoquiles.interfaces;

public class Lombriz extends Animal {
    public Lombriz(String nombre) {
        super(nombre);
    }

    @Override
    public String info() {
        return "Anulus Longuis " + nombre;
    }
}
