package es.orricoquiles.jerarquia;

public class MagoGuerrero extends Mago {
    public MagoGuerrero(String nombre) {
        super(nombre, Raza.HUMANO);
    }

    @Override
    public String info() {
        return "<h3>MAGO GUERRERO</h3>" + super.info();
    }

    @Override
    public int HP() {
        return this.raza.getHPRaza() + this.nivel * 10;
    }

}
