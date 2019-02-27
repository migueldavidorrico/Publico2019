package es.orricoquiles.oscars2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Pelicula implements Comparable<Pelicula> {
    private final String titulo;
    private final ArrayList<String> director;
    private final String actorPrincipal;
    private final String actrizPrincipal;
    private final ArrayList<String> actoresReparto;
    private final ArrayList<String> actricesReparto;

    public Pelicula(String titulo, String director) {
        this(titulo, director, "", "");
    }

    public Pelicula(String titulo,
                    String director,
                    String actorPrincipal,
                    String actrizPrincipal
    ) {
        this.titulo = titulo;
        this.director = new ArrayList<>();
        this.director.add(director);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
        this.actoresReparto = new ArrayList<>();
        this.actricesReparto = new ArrayList<>();
    }


    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director=" + Arrays.toString(director.toArray()) +
                ", actorPrincipal='" + actorPrincipal + '\'' +
                ", actrizPrincipal='" + actrizPrincipal + '\'' +
                ", actoresReparto=" + Arrays.toString(actoresReparto.toArray()) +
                ", actricesReparto=" + Arrays.toString(actricesReparto.toArray()) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pelicula)) return false;
        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(titulo, pelicula.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<String> getDirector() {
        return director;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public ArrayList<String> getActoresReparto() {
        return actoresReparto;
    }

    public ArrayList<String> getActricesReparto() {
        return actricesReparto;
    }

    @Override
    public int compareTo(Pelicula o) {
        return this.titulo.compareTo(o.titulo);
    }


    //Añadir el anyadeDirector
    //Añadir el anyadeactorReparto y anyadeactrizReparto
}

/*

Pelicula
Titulo
Director -->ArrayList String
Actor Principal
Actriz Principal
Actores de Reparto
Actrices de Reparto
 */
