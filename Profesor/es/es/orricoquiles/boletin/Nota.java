package es.orricoquiles.boletin;

public enum Nota {
    NE("No Evaluado", false, Integer.MIN_VALUE),
    CV("Convalidado", true, 5),
    UNO("1", false, 1),
    DOS("2", false, 2),
    TRES("3", false, 3),
    CUATRO("4", false, 4),
    CINCO("5", true, 5),
    SEIS("6", true, 6),
    SIETE("7", true, 7),
    OCHO("8", true, 8),
    NUEVE("9", true, 9),
    DIEZ("10", true, 10),
    MH("Matrícula de Honor", true, 10);

    private final String mostrar;
    private final boolean aprobado;
    private final int valoracionMedia;

    public int getValoracionMedia() {
        return valoracionMedia;
    }

    public String getMostrar() {
        return mostrar;
    }

    public boolean estaAprobado() {
        return aprobado;
    }

    Nota(String s, boolean b, int i) {
        this.mostrar = s;
        this.aprobado = b;
        this.valoracionMedia = i;
    }
}
