package es.orricoquiles.comparacion;

import java.util.ArrayList;
import java.util.Comparator;

public class Cancion implements Comparable {
    private final String titulo;
    private final int duracion;
    private final String letra;
    private final ArrayList<String> premios;

    public Cancion(String titulo, int duracion, String letra) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.letra = letra;
        premios = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                ", letra='" + letra.substring(0, 10) + "...\'" +
                ", Nº premios=" + premios.size() +
                '}';
    }

    public ArrayList<String> getPremios() {
        return premios;
    }

    public void anyadirPremio(String premio) {
        this.premios.add(premio);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getLetra() {
        return letra;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Cancion)) {
            return -1;
        }
        Cancion pasada = (Cancion) o;
        return pasada.premios.size() - this.premios.size();
    }

    enum ComparacionesCanciones {
        POR_NOMBRE(new Comparator<Cancion>() {
            @Override
            public int compare(Cancion o1, Cancion o2) {
                return o1.getTitulo().compareTo(o2.getTitulo());
            }

        }),
        POR_PREMIOS(new Comparator<Cancion>() {
            @Override
            public int compare(Cancion o1, Cancion o2) {
                return o1.getPremios().size() - o2.getPremios().size();
            }
        });


        private final Comparator<Cancion> comparador;

        public Comparator<Cancion> getComparador() {
            return comparador;
        }

        ComparacionesCanciones(Comparator<Cancion> cancionComparator) {
            this.comparador = cancionComparator;
        }
    }
}
