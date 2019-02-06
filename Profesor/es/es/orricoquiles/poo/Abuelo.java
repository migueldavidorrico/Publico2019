package es.orricoquiles.poo;

public class Abuelo {
    @Override
    public String toString() {
        return "Abuelo{}";
    }

    public static void main(String[] args) {
        int[] a = {0, 6, 7, 8};
        System.out.println(a);
    }
}

class Padre extends Abuelo {
    @Override
    public String toString() {
        return "Paramos ";
    }
}

class Hijo extends Padre {
    @Override
    public String toString() {
        return super.toString() + " Hijo{}";
    }
}