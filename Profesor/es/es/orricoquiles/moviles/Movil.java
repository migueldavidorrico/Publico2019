package es.orricoquiles.moviles;

import javax.swing.*;
import java.math.BigDecimal;

public class Movil {
    private final String marca;
    private final String modelo;
    private BigDecimal precio;
    private final int gigasMemoria;
    private final double megaPixelesCamaraTrasera;

    private final Icon foto;

    public Movil(String marca, String modelo, BigDecimal precio, int gigasMemoria, double megaPixelesCamaraTrasera, String fichero) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.gigasMemoria = gigasMemoria;
        this.megaPixelesCamaraTrasera = megaPixelesCamaraTrasera;
        this.foto = new ImageIcon(fichero);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public int getGigasMemoria() {
        return gigasMemoria;
    }

    public double getMegaPixelesCamaraTrasera() {
        return megaPixelesCamaraTrasera;
    }

    public Icon getFoto() {
        return foto;
    }

    @Override
    public String toString() {
        return "Movil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", gigasMemoria=" + gigasMemoria +
                ", megaPixelesCamaraTrasera=" + megaPixelesCamaraTrasera +
                ", foto=" + foto +
                '}';
    }


    public static void main(String[] args) {
        Movil lumia=new Movil("Lumia","950XL",BigDecimal.valueOf(349.00),4,13.4,"lumia.jpg");
        es.orricoquiles.moviles.ESMovil.muestraMovil(lumia);
        es.orricoquiles.moviles.ESMovil.muestraMovil(es.orricoquiles.moviles.ESMovil.leeMovil());
    }
}
