package es.orricoquiles.dentadura;

public enum EstadoDiente {
    BUENO("OK"), MALO("KO");

    private final String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    EstadoDiente(String ko) {
        this.mensaje = ko;
    }
}
