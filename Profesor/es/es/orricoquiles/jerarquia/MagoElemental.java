package es.orricoquiles.jerarquia;

public class MagoElemental extends Mago {
    public MagoElemental(String nombre) {
        super(nombre, Raza.ELFO);
    }

    @Override
    public String info() {
        return "<h3>MAGO ELEMENTAL</h3>" + super.info();
    }

    @Override
    public int HP() {
        return this.raza.getHPRaza() - nivel * 5;
    }

    @Override
    public int MP() {
        return this.raza.getMPRaza() + nivel * 40;
    }
}
