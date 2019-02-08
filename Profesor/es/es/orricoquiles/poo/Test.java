package es.orricoquiles.poo;

class Vehiculo {
    public void imprimirSonido() {
        System.out.println("Vehiculo");
    }
}

class Coche extends Vehiculo {
    public void imprimirSonido() {
        System.out.println("Coche");
    }
}

class Bicicleta extends Vehiculo {
    public void imprimirSonido() {
        System.out.println("Bicicleta");
    }
}

public class Test {
    public static void main(String[] args) {
        Vehiculo v = new Coche();
        Bicicleta b = (Bicicleta) v;
        v.imprimirSonido();
        b.imprimirSonido();
    }
}
