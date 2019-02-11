package es.orricoquiles.poo;

import java.util.ArrayList;

public class Orquesta {
    public static void main(String[] args) {
        ArrayList<Instrumento> orquesta = new ArrayList<>();
        orquesta.add(new Flauta());
        orquesta.add(new Flauta());
        orquesta.add(new Flauta());
        orquesta.add(new Clarinete());
        orquesta.add(new Clarinete());
        orquesta.add(new Clarinete());
        orquesta.add(new Violin());
        orquesta.add(new Violin());
        orquesta.add(new Violin());
        for (Instrumento i :
                orquesta) {
            if (i.tipo == Instrumento.Tipo.VIENTO) {
                System.out.print("VIENTO: ");
            }
            System.out.println(i);
        }
//        Instrumento[] orquesta = new Instrumento[5];
//        orquesta[0] = new Flauta();
//        orquesta[1] = new Flauta();
//        orquesta[2] = new Flauta();
//        orquesta[3] = new Clarinete();
//        orquesta[4] = new Violin();
//
//        for (Instrumento i :
//                orquesta) {
//            System.out.println(i);
//        }

    }

}

abstract class Instrumento {
    enum Tipo {
        CUERDA, VIENTO, PERCUSION;
    }

    Tipo tipo;

    public abstract String tocar();

    @Override
    public String toString() {
        return "Soy de tipo " + this.tipo + " Y :" + this.tocar();
    }
}

abstract class Cuerda extends Instrumento {
    Cuerda() {
        this.tipo = Tipo.CUERDA;
    }
}

abstract class Viento extends Instrumento {
    Viento() {
        this.tipo = Tipo.VIENTO;
    }
}

class Violin extends Cuerda {

    @Override
    public String tocar() {
        return "Soy un Violín: ÑaÑAÑA    ÑA";
    }
}

class Clarinete extends Viento {

    @Override
    public String tocar() {
        return "Soy un clarinete:TURUTURÚ";
    }
}

class Flauta extends Viento {
    @Override
    public String tocar() {
        return "Soy una Flauta: SILBIDITO";
    }
}
