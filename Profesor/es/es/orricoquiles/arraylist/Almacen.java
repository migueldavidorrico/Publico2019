package es.orricoquiles.arraylist;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Almacen {
    private final ArrayList<Bebida> estanteria;

    public Almacen() {
        this.estanteria = new ArrayList<>();
    }

    public ArrayList<Bebida> getEstanteria() {
        return estanteria;
    }

    public BigDecimal precioTotalAlmacen() {
        if (estanteria.size() == 0) {
            return BigDecimal.valueOf(0);
        }
        BigDecimal sumaPrecio = BigDecimal.valueOf(0);
        for (Bebida bebidaActual : estanteria) {
            sumaPrecio = sumaPrecio.add(bebidaActual.getPrecio());
        }
        return sumaPrecio;
    }

    public BigDecimal precioEstanteria(ArrayList<Bebida> estanteria) {
        if (estanteria.size() == 0) {
            return BigDecimal.valueOf(0);
        }
        BigDecimal sumaPrecio = BigDecimal.valueOf(0);
        for (Bebida bebidaActual : estanteria) {
            sumaPrecio.add(bebidaActual.getPrecio());
        }
        return sumaPrecio;
    }

    public BigDecimal precioDeMarca(String marca) {
        BigDecimal sumaPrecioMarca = BigDecimal.valueOf(0);
        for (Bebida bebidaActual : estanteria) {
            if (bebidaActual.getMarca().equalsIgnoreCase(marca)) {
                sumaPrecioMarca.add(bebidaActual.getPrecio());
            }
        }
        return sumaPrecioMarca;
    }

    public boolean addBebida(Bebida nuevaBebida) {
        for (Bebida bebidaActual : estanteria) {
            if (bebidaActual.getIdentificador().equalsIgnoreCase(nuevaBebida.getIdentificador())) {
                return false;
            }
        }
        estanteria.add(nuevaBebida);
        return true;
    }

    public boolean removeBebida(String identificadorParaBorrar) {
        for (Bebida bebidaActual : estanteria) {
            if (bebidaActual.getIdentificador().equalsIgnoreCase(identificadorParaBorrar)) {
                estanteria.remove(bebidaActual);
                return true;
            }
        }
        return false;
    }

    public String inventario() {
        String salida = "";
        for (Bebida bebidaActual : estanteria) {
            salida += bebidaActual + "\n";
        }
        return salida;
    }

}