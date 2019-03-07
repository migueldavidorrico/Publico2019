package es.orricoquiles.jerarquia;

public class Mago extends PersonajeRPG {
    public Mago(String nombre, Raza raza) {
        super(nombre, raza);
    }

    @Override
    public String info() {
        return "<h3>MAGO</h3>" + super.info();
    }

    @Override
    public int HP() {
        return this.raza.getHPRaza();
    }

    @Override
    public int MP() {
        return this.raza.getMPRaza() + nivel * 20;
    }


}
