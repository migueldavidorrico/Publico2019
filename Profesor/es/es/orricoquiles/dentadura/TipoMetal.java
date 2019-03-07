package es.orricoquiles.dentadura;

public enum TipoMetal {
    TITANIO(20000), RODIO(100000);

    private final int precio;

    public int getPrecio() {
        return precio;
    }

    TipoMetal(int i) {
        this.precio = i;
    }
}
//Un metálico de Titanio cuesta 200€ y de RODIO cuesta 1000€
