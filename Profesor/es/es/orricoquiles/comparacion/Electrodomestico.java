package es.orricoquiles.comparacion;

public class Electrodomestico implements Comparable<Electrodomestico> {
    String marca;
    String modelo;
    int precio;
    EficienciaEnergetica eficiencia;
    int consumo;

    @Override
    public int compareTo(Electrodomestico o) {
        return this.precio - o.precio;
        //return Integer.compare(this.precio,o.precio);
    }
}
