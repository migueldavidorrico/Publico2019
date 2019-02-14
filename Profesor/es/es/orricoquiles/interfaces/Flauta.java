package es.orricoquiles.interfaces;

public class Flauta extends InstrumentoMusical implements Audible {

    int numeroTeclas;

    public Flauta(String nombre, int numeroTeclas) {
        super(nombre);
        this.numeroTeclas = numeroTeclas;
    }

    @Override
    public String info() {
        return "Soy una flauta con " + this.numeroTeclas + " teclas.";
    }

    @Override
    public String suena() {
        return "Flauta: PIRIRI PIRIRI";
    }
}
