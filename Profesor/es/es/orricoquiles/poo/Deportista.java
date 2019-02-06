package es.orricoquiles.poo;

public class Deportista {
    String nombre;
    String pais;
    int edad;

    public boolean mayorEdad() {
        return edad >= 18;
    }

    public Deportista(String nombre, String pais, int edad) {
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
    }

    public Deportista(String nombre, int edad) {
        this(nombre, "España", edad);
    }

    @Override
    public String toString() {
        return nombre.toUpperCase() + " pais=" + pais +
                ", edad=" + edad;
    }

    public static void main(String[] args) {
        Tenista nadal = new Tenista("Rafael Nadal", "España", 35, 320, 1);
        Deportista paugasol = new Deportista("Pau Gasol", "EE UU", 35);

        System.out.println(nadal);
        System.out.println(paugasol);
    }
}

class Tenista extends Deportista {
    int velocidadSaque;
    int rankingATP;

    Tenista(String nombre, String pais, int edad, int velocidadSaque, int rankingATP) {
        super(nombre, pais, edad);
        this.velocidadSaque = velocidadSaque;
        this.rankingATP = rankingATP;
    }

    @Override
    public String toString() {
        return super.toString() + " Puesto ATP:" + this.rankingATP + " Saca a " +
                this.velocidadSaque + " km/h";
    }


    public void infoTenista() {
        System.out.println(this.nombre + " tiene " + this.edad);
        System.out.println("Está en el puesto " + this.rankingATP);
        System.out.println(this.mayorEdad() ? "Es mayor de edad" : "Es menor");
    }

}



