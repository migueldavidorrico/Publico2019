package es.orricoquiles.arraylist;


import java.math.BigDecimal;

public class BebidaAzucarada extends Bebida {
    private final double porcentajeAzucar;
    private final boolean promocion;
    private final static String DESCUENTO_APLICABLE = " 10%";
    private static BigDecimal DESCUENTO_DEL_10 = BigDecimal.valueOf(10, 2);

    public BebidaAzucarada(String identificador, int cantidadLitros, BigDecimal precio, String marca, double porcentajeAzucar, boolean promocion) {
        super(identificador, cantidadLitros, precio, marca);
        this.porcentajeAzucar = porcentajeAzucar;
        this.promocion = promocion;
        if (promocion) {
            setPrecio(precio.subtract(precio.multiply(DESCUENTO_DEL_10)).setScale(2, BigDecimal.ROUND_DOWN));
        }
    }

    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public boolean getPromocion() {
        return promocion;
    }

    @Override
    public String toString() {
        String salida = "";
        salida += super.toString();
        salida += " tiene un % de azúcar del " + porcentajeAzucar;
        salida += getPromocion() ? " y una promoción del" + DESCUENTO_APLICABLE : " y no esta en promoción";
        return salida;
    }
}

