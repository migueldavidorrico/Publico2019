package es.orricoquiles.jerarquia;

public class Guerrero extends PersonajeRPG {
    public Guerrero(String nombre, Raza raza) {
        super(nombre, raza);
    }

    @Override
    public String info() {
        return "<h3>GUERRERO</h3>" + super.info();
    }

    @Override
    public int HP() {
        return this.raza.getHPRaza() + nivel * 20;
    }

    @Override
    public int MP() {
        return this.raza.getMPRaza() - 40;
    }
}
