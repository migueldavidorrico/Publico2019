package orricoquiles;

public class Animal {
    private final String nombre;
    private final int esperanzaVida;

    public Animal(String nombre, int esperanzaVida) {
        this.nombre = nombre;
        this.esperanzaVida = esperanzaVida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEsperanzaVida() {
        return esperanzaVida;
    }

    @Override
    public String toString() {
        return nombre + '\'' +
                ", esperanzaVida=" + esperanzaVida;
    }
}

class Perro extends Animal implements Unible {
    public Perro(String nombre) {
        super(nombre, 15);
    }

    @Override
    public String toString() {
        return "PERRO - " + super.toString();
    }

    @Override
    public String unir(Unible otraCosa) {
        if (!(otraCosa instanceof Animal)) {
            return "ERROR AL UNIR";
        }

        if (otraCosa instanceof Perro) {
            return "CACHORRILLOS";
        }

        if (otraCosa instanceof Gato) {
            return "PELEA, PELEA";
        }

        return "UNIÓN EXTRAÑA";

    }
}

class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre, 10);
    }

    @Override
    public String toString() {
        return "GATO - " + super.toString();
    }
}

class Pajaro extends Animal {

    public Pajaro(String nombre) {
        super(nombre, 5);
    }

    @Override
    public String toString() {
        return "PAJARO - " + super.toString();
    }
}

class Pez extends Animal {
    public Pez(String nombre) {
        super(nombre, 2);
    }

    @Override
    public String toString() {
        return "PEZ - " + super.toString();
    }
}