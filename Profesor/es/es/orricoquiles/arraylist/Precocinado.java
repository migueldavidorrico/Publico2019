package es.orricoquiles.arraylist;

public class Precocinado extends Alimento {

    private String atmosferaProtectora;

    public Precocinado(String nombre, int precio, String atmosferaProtectora) {
        super(nombre, precio);
        this.atmosferaProtectora = atmosferaProtectora;
    }

    @Override
    public String toString() {
        return super.toString() + " Conservado en: " + atmosferaProtectora;
    }

    public String getAtmosferaProtectora() {
        return atmosferaProtectora;
    }

    public void setAtmosferaProtectora(String atmosferaProtectora) {
        this.atmosferaProtectora = atmosferaProtectora;
    }
}
