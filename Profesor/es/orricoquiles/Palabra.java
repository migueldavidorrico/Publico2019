package orricoquiles;

import java.util.ArrayList;

public class Palabra implements Unible {
    private String palabra;
    private Alfabeto alfabeto;
    private String definicion;
    private ArrayList<Palabra> sinonimos;
    private ArrayList<Palabra> antonimos;

    public Palabra(String palabra, String definicion) {
        this.palabra = palabra;
        this.definicion = definicion;
        this.alfabeto = Alfabeto.ESPAÑOL;
        this.sinonimos = new ArrayList<>();
        this.antonimos = new ArrayList<>();
    }

    public void anyadirAntonimo(Palabra p) {
        this.antonimos.add(p);
    }

    public void anyadirSinonimo(Palabra p) {
        this.sinonimos.add(p);
    }

    public String salidaDiccionario() {
        String sinonimosSalida = "";
        for (Palabra palabra :
                sinonimos) {
            sinonimosSalida += palabra.palabra + " ; ";
        }
        String antonimosSalida = "";
        for (Palabra palabra :
                antonimos) {
            antonimosSalida += palabra.palabra + " ; ";

        }

        return this.palabra + " - " + this.getDefinicion() + "\nSINÓNIMOS: " + sinonimosSalida + "\nANTÓNIMOS: " +
                antonimosSalida;
    }

    public String getDefinicion() {
        return definicion;
    }

    public static void main(String[] args) {
        Polisemica banco = new Polisemica("banco");
        banco.anyadirDefinicion("asiento para varias personas");
        banco.anyadirDefinicion("mesa de trabajo");
        banco.anyadirDefinicion("conjunto de peces");
        banco.anyadirDefinicion("entidad financiera");
        System.out.println(banco.salidaDiccionario());
        Palabra ordenador = new Palabra("ordenador", "PC");
        System.out.println(ordenador.salidaDiccionario());
        banco.anyadirSinonimo(ordenador);
        ordenador.anyadirSinonimo(banco);
        System.out.println(ordenador.salidaDiccionario());
        System.out.println(banco.salidaDiccionario());
    }

    @Override
    public String unir(Unible otraCosa) {
        if (!(otraCosa instanceof Palabra)) {
            return "ERROR AL UNIR";
        } else {
            Palabra laOtra = (Palabra) otraCosa;
            return this.palabra + laOtra.palabra;
        }
    }
}

class Polisemica extends Palabra {
    private ArrayList<String> definiciones = new ArrayList<>();

    public Polisemica(String palabra) {
        super(palabra, null);
    }

    public void anyadirDefinicion(String definicion) {
        this.definiciones.add(definicion);
    }

    @Override
    public String getDefinicion() {
        String salida = "";
        for (int i = 0; i < definiciones.size(); i++) {
            salida += String.format("%2d - %s%n", i + 1, definiciones.get(i));
        }
        return salida;
    }
}
