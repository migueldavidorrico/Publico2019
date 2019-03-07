package es.orricoquiles.jerarquia;

public abstract class PersonajeRPG {
    String nombre;
    protected Raza raza;
    int nivel = 1;
    int HPActual;
    int MPActual;
    int experiencia = 0;

    public PersonajeRPG(String nombre, Raza raza) {
        this.nombre = nombre;
        this.raza = raza;
        this.HPActual = this.HP();
        this.MPActual = this.MP();
    }

    public void subirNivel() {
        this.nivel++;
        this.HPActual = this.HP();
        this.MPActual = this.MP();
    }

    public String getNombre() {
        return nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public int getNivel() {
        return nivel;
    }

    public int getHPActual() {
        return HPActual;
    }

    public int getMPActual() {
        return MPActual;
    }

    public String info() {
        String salida = "<h2>" + this.nombre + "</h2><hr>";
        salida += "<p>" + this.raza + " NIVEL: " + this.nivel + "</p>";
        salida += "<p>Salud: " + this.getHPActual() + "/" + this.HP() + "</p>";
        salida += "<p>Maná: " + this.getMPActual() + "/" + this.MP() + "</p>";
        return salida;
    }

    @Override
    public String toString() {
        return "PersonajeRPG{" +
                "nombre='" + nombre + '\'' +
                ", raza=" + raza +
                ", nivel=" + nivel +
                ", HPActual=" + HPActual +
                ", MPActual=" + MPActual +
                '}';
    }

    public abstract int HP();

    public abstract int MP();

}
