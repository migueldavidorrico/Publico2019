package es.orricoquiles.ips;

import java.util.Arrays;

public class IP {
    private final int[] octetos;


    public Clase getClase() {
        for (Clase c :
                Clase.values()) {
            if (c.pertenece(this)) {
                return c;
            }
        }
        return null;
    }

    public boolean enLaMismaRed(IP ip) {
        return this.getIdRed().esIgualA(ip.getIdRed());
    }

    public static boolean todasMismaRed(IP[] lista) {
        IP primera = lista[0];
        for (IP ip :
                lista) {
            if (!ip.enLaMismaRed(primera)) {
                return false;
            }
        }
        return true;
    }

    public static boolean estanMismaRed(IP a, IP b) {
        IP redA = a.getIdRed();
        IP redB = b.getIdRed();
        return redA.esIgualA(redB);
    }

    public String infoIP() {
        String salida = "";
        salida += "La IP: " + this.toString();
        salida += "\n   Es de clase " + this.getClase();
        salida += "\n   " + (esIdRed() ? "Es ID de Red" : "No es Id de Red");
        salida += "\n   Máscara de Red:" + this.getMascaraRed();
        salida += "\n   BroadCast:" + this.getBroadcast();
        salida += "\n   " + (esPrivada() ? "Es privada" : "Es pública");
        return salida;

    }

    public boolean esPrivada() {
        switch (this.getClase()) {
            case A:
                return this.getIdRed().esIgualA(new IP(10, 0, 0, 0));
            case B:
                if (octetos[0] != 172) {
                    return false;
                }
                return (octetos[1] >= 16 && octetos[1] < 32);
            case C:
                return octetos[0] == 192 && octetos[1] == 168;
        }
        return false;
    }

    public IP getBroadcast() {
        switch (this.getClase()) {
            case A:
                return new IP(octetos[0], 255, 255, 255);
            case B:
                return new IP(octetos[0], octetos[1], 255, 255);
            case C:
                return new IP(octetos[0], octetos[1], octetos[2], 255);
        }
        return null;
    }

    public boolean esIdRed() {
        IP id = getIdRed();
        return esIgualA(id);
    }

    private boolean esIgualA(IP id) {
        for (int i = 0; i < 4; i++) {
            if (this.octetos[i] != id.octetos[i]) {
                return false;
            }
        }
        return true;
    }

    private IP getIdRed() {
        switch (this.getClase()) {
            case A:
                return new IP(octetos[0], 0, 0, 0);
            case B:
                return new IP(octetos[0], octetos[1], 0, 0);
            case C:
                return new IP(octetos[0], octetos[1], octetos[2], 0);
        }
        return null;
    }

    private IP getMascaraRed() {
        return this.getClase().getMascara();
    }

    /*

        La clase (A, B, C) a la que pertenece la IP
        Si es una Id de Red
        La Id de Red de esa Dirección IP
        La máscara de red.
        Si es privada o pública

     */
    public IP(int[] octetos) {
        this.octetos = Arrays.copyOf(octetos, octetos.length);

    }


    public IP(int a, int b, int c, int d) {
        this.octetos = new int[4];
        octetos[0] = a;
        octetos[1] = b;
        octetos[2] = c;
        octetos[3] = d;

    }


    public IP(String ip) {
        octetos = new int[4];
        for (int i = 0; i < 3; i++) {
            octetos[i] = Integer.parseInt(ip.substring(0, ip.indexOf('.')));
            ip = ip.substring(ip.indexOf('.') + 1);
        }
        octetos[3] = Integer.parseInt(ip);

    }

    public int getPrimerOcteto() {
        return octetos[0];
    }

    @Override
    public String toString() {
        return octetos[0] + "." + octetos[1] + "." + octetos[2] + "." + octetos[3];
    }

    public static void main(String[] args) {
        IP servidor = new IP("172.16.0.10");
        IP[] clientes = servidor.obtenerIPs(2000);
        System.out.println(Arrays.toString(clientes));

    }

    public IP[] obtenerIPs(int i) {
        int numeroObtener = 0;
        numeroObtener = Math.min(this.getClase().getMaximoHosts(), i);
        /*
        if(this.getClase()==Clase.C){
            numeroObtener=Math.min(253,i);
        } else if(this.getClase()==Clase.B){
            numeroObtener=Math.min(65534,i);
        } else if(this.getClase()==Clase.A){
            numeroObtener=Math.min(16000000,i);
        }
        */
        IP[] salida = new IP[numeroObtener];
        int porElQueVoy = 0;
        int rellenar = 0;
        int penultimoOcteto = this.octetos[2];
        while (rellenar < numeroObtener) {

            int ultimoOcteto = (this.octetos[3] + porElQueVoy + 1) % 256;

            if (ultimoOcteto == 0) {
                penultimoOcteto = (penultimoOcteto + 1) % 256;
            }
            IP posible = new IP(this.octetos[0], this.octetos[1], penultimoOcteto, ultimoOcteto);
            porElQueVoy++;
            System.out.println(posible.getBroadcast());
            if (posible.esIdRed() || posible.getBroadcast().esIgualA(posible)) {
                continue;
            }
            salida[rellenar] = posible;
            System.out.println(porElQueVoy);
            rellenar++;


        }


        return salida;
    }
}


/*
Se implementará la clase DireccionIP con las siguientes características:

    Debe tener tres constructores: uno al que se le pasa una cadena con la IP p.e. "192.168.2.3", otro al que se le pasa cuatro enteros separados por comas p. e. 10,0,03 y otro al que se le pasa un array de cuatro enteros

 */