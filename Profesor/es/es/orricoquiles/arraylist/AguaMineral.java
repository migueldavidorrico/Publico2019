package es.orricoquiles.arraylist;

import java.math.BigDecimal;

public class AguaMineral extends Bebida {
    private final String procedencia;

    public AguaMineral(String identificador, int cantidadLitros, BigDecimal precio, String marca, String procedencia) {
        super(identificador, cantidadLitros, precio, marca);
        this.procedencia = procedencia;
    }

    public String getProcedencia() {
        return procedencia;
    }

    @Override
    public String toString() {
        return super.toString() + " procedencia: " + procedencia;
    }
}