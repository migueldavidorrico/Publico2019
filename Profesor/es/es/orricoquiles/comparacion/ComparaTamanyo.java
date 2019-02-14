package es.orricoquiles.comparacion;

import java.util.Comparator;

public class ComparaTamanyo implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String una = (String) o1;
        String dos = (String) o2;

        return inversa(una).compareTo(inversa(dos));
    }

    public String inversa(String cad) {
        String salida = "";
        for (char c :
                cad.toCharArray()) {
            salida = c + salida;
        }
        return salida;
    }
}
