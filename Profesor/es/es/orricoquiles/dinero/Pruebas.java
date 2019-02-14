package es.orricoquiles.dinero;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Pruebas {
    public static void main(String[] args) {
        Currency local = Currency.getInstance(Locale.getDefault());
        System.out.println(local);
        NumberFormat formateador = NumberFormat.getCurrencyInstance(Locale.getDefault());
        System.out.println(formateador.format(new BigDecimal("25345438.90")));

    }
}
