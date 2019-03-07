package es.orricoquiles.comparacion;

public enum EficienciaEnergetica {
    A, B, C, D, E;

    public static void main(String[] args) {
        EficienciaEnergetica e1 = A;
        EficienciaEnergetica e2 = B;
        System.out.println(e2.compareTo(e1) > 0 ? "Es mayor " + e1 : "Es mayor " + e2);
    }
}
