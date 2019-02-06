package es.orricoquiles.letras;

public class listaLetras {


    private static final int TAMANYO = 30000;
    private static char[] lista = new char[TAMANYO];
    private static int indice = 0;

    @Override
    public String toString() {
        return "listaLetras{}";
    }

    public static void anyadir(char letra) {
        lista[indice++] = letra;
    }

    public static void anyadir(String palabra) {
        /* Está la funcion que lo hace
        for (char c
                :palabra.toCharArray()){


        }
        */
        for (int i = 0; i < palabra.length(); i++) {
            anyadir(palabra.charAt(i));
        }
    }

    public static String elementos() {
        String salida = "";
        for (int i = 0; i < indice; i++) {
            salida += lista[i] + " ";
            if ((i % 20 + 1) == 0) {
                salida += "\n";
            }
        }
        return salida;
    }

    public static boolean borrar(char c) {
        int posicion = -1;
        for (int i = 0; i < indice; i++) {
            if (lista[i] == c) {
                posicion = i;
                break;
            }
        }
        if (posicion == -1) {
            return false;
        }
        for (int i = posicion + 1; i < indice; i++) {
            lista[i - 1] = lista[i];
        }
        indice--;
        return true;
    }

    public static boolean borrar(String palabra) {
        boolean toda = true;
        for (int i = 0; i < palabra.length(); i++) {
            if (!borrar(palabra.charAt(i))) {
                toda = false;
            }
        }
        return toda;
    }



    public static void main(String[] args) {
        /*anyadir('a');
        anyadir('c');
        anyadir('r');
        anyadir('i');
        anyadir('t');
        anyadir('u');
        anyadir('d');
        anyadir('e');
        anyadir('s');
        System.out.println(elementos());
        System.out.println(borrar('r'));
        System.out.println(borrar('d'));
        System.out.println(borrar('s'));
        System.out.println(borrar('a'));
        System.out.println(elementos());
        */
        anyadir("Perico");
        System.out.println(elementos());
        borrar("rice");
        System.out.println(elementos());


    }
}
