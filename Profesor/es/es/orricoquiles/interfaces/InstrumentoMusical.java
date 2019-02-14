package es.orricoquiles.interfaces;

public abstract class InstrumentoMusical {
    String nombre;

    public InstrumentoMusical(String nombre) {
        this.nombre = nombre;
    }

    public abstract String info();
}
