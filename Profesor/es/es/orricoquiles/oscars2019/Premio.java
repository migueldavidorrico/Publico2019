package es.orricoquiles.oscars2019;

import java.util.ArrayList;

public class Premio implements Comparable<Premio> {
    private final String titulo;
    private final ArrayList<Nominacion> nominadas;
    private Nominacion ganadora;
    private final int orden;
    private final int importancia;
    private final PremiosPosibles informacion;

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<Nominacion> getNominadas() {
        return nominadas;
    }

    public Nominacion getGanadora() {
        return ganadora;
    }

    public int getOrden() {
        return orden;
    }

    public int getImportancia() {
        return importancia;
    }

    public PremiosPosibles getInformacion() {
        return informacion;
    }

    public Premio(String titulo, int orden, int importancia, PremiosPosibles informacion) {
        this.titulo = titulo;
        this.informacion = informacion;
        this.orden = orden;
        this.importancia = importancia;
        nominadas = new ArrayList<>();
        this.ganadora = null;
    }

    public void anyadeNominada(Nominacion nominada) {
        this.nominadas.add(nominada);
    }

    public String informacion() {
        return this.informacion.getInfo().info(this);
    }

    public void anyadeGanadora(Nominacion ganadora) {
        this.ganadora = ganadora;
    }


    @Override
    public int compareTo(Premio o) {
        return this.importancia - o.importancia;
    }
}
