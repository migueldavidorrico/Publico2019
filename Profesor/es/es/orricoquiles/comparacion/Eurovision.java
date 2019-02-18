package es.orricoquiles.comparacion;

import java.util.ArrayList;

public class Eurovision {
    public static void main(String[] args) {
        ArrayList<Cancion> concursantes;
        concursantes = new ArrayList<>();

        concursantes.add(new Cancion("Macarena", 176, "Dale a tu cuerpo"));
        concursantes.add(new Cancion("Hey", 243, "No vayas presumiendo por ahí"));
        concursantes.add(new Cancion("Baby Shark", 400, "Baby Shark, nanananan"));
        concursantes.add(new Cancion("The trooper", 120, "Super trooper, NANANA"));
        concursantes.add(new Cancion("El tamborilero", 398, "El camino que lleva a Belén"));

        concursantes.get(0).anyadirPremio("Oscar Mejor Banda sonora");
        concursantes.get(1).anyadirPremio("Oscar Mejor Banda sonora");
        concursantes.get(1).anyadirPremio("Mayores Ventas 2019");
        concursantes.get(1).anyadirPremio("León de Oro");
        concursantes.get(2).anyadirPremio("Cadena Dial de Plata");

        concursantes.sort(ComparacionesCanciones.POR_NOMBRE.getComparador());
        System.out.println(imprimeCanciones(concursantes));
        concursantes.sort(ComparacionesCanciones.POR_PREMIOS.getComparador());
        System.out.println(imprimeCanciones(concursantes));


    }

    public static String imprimeCanciones(Object[] c) {
        String s = "";
        for (Object cancion :
                c) {
            s += cancion + "\n";
        }
        return s;
    }

    public static String imprimeCanciones(ArrayList<Cancion> c) {
        String s = "";
        for (Cancion cancion :
                c) {
            s += cancion + "\n";
        }
        return s;
    }
}
