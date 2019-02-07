package es.orricoquiles.poo;

public class Abstractas {
    public static void main(String[] args) {
        System.out.println("Ejemplos de clases abstractas");
        Tarjeta ana = new ChristmasNavidenyo("Ana");
        Tarjeta bea = new TarjetaCumpleanyos("Bea", 35);
        Tarjeta clara = new TarjetaSanValentin("Clara", 3);
        System.out.println(ana.felicitar());
        System.out.println(bea.felicitar());
        System.out.println(clara.felicitar());

        Tarjeta c;
        TarjetaCumpleanyos b;
        TarjetaSanValentin v;
        ChristmasNavidenyo h;

        c = new TarjetaSanValentin("Debby", 8);
        //b = new TarjetaSanValentin ("Elroy", 3);
        v = new TarjetaSanValentin("Fiona", 3);
        //h = new TarjetaCumpleanyos ("Greg", 35);
    }

}


abstract class Tarjeta {
    String dirigidaA;

    Tarjeta(String receptor) {
        this.dirigidaA = receptor.toUpperCase();
    }

    public abstract String felicitar();

}

class ChristmasNavidenyo extends Tarjeta {
    ChristmasNavidenyo(String receptor) {
        super(receptor);
    }

    @Override
    public String felicitar() {
        return "Feliz Navidad, " + this.dirigidaA;
    }
}

class TarjetaCumpleanyos extends Tarjeta {
    private final int edad;

    TarjetaCumpleanyos(String receptor, int edad) {
        super(receptor);
        this.edad = edad;
    }

    @Override
    public String felicitar() {
        return "Cumpleaños Feliz, " + this.dirigidaA + " ya tienes " + this.edad + " años";
    }
}

class TarjetaSanValentin extends Tarjeta {
    private final int besos;

    TarjetaSanValentin(String receptor, int besos) {
        super(receptor);
        this.besos = besos;
    }

    @Override
    public String felicitar() {
        String salida = "";
        salida += this.dirigidaA + " Te quiero mucho.\n";
        String equis = "";
        String circulos = "";
        for (int i = 0; i < this.besos; i++) {
            equis += "x";
            circulos += "o";
        }
        salida += equis + circulos + equis + "\n";
        return salida;
    }
}