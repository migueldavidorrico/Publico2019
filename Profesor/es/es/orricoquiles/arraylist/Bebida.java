package es.orricoquiles.arraylist;

import java.math.BigDecimal;

public abstract class Bebida {
    private final String identificador;
    private final int cantidadLitros;
    private BigDecimal precio;
    private final String marca;

    public Bebida(String identificador, int cantidadLitros, BigDecimal precio, String marca) {
        this.identificador = identificador;
        this.cantidadLitros = cantidadLitros;
        this.precio = precio;
        this.marca = marca;
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getCantidadLitros() {
        return cantidadLitros;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return identificador + " - " + marca + " " + cantidadLitros + " litros, " + precio + " €";
    }

}
