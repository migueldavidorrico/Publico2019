package es.orricoquiles.oscars2019;

public abstract class Nominacion {


}

class NominacionPelicula extends Nominacion {
    Pelicula pelicula;

    @Override
    public String toString() {
        return pelicula.toString();
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public NominacionPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
}

class NominacionEspecial extends Nominacion {
    public NominacionEspecial(String persona, String motivo) {
        this.persona = persona;
        this.motivo = motivo;
    }

    private String persona;
    private String motivo;
}
