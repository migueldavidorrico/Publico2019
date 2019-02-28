package es.orricoquiles.lecturas;

public class Movimiento {
    int cambio;

    public Movimiento(int cambio) {
        this.cambio = cambio;
    }

    @Override
    public String toString() {
        return "" + cambio;
    }
}
