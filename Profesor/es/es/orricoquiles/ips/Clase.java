package es.orricoquiles.ips;

public enum Clase {
    A(0, 127, new IP(255, 0, 0, 0), 16000000),
    B(128, 191, new IP(255, 255, 0, 0), 65534),
    C(192, 223, new IP(255, 255, 255, 0), 254),
    D(224, 239, new IP(255, 0, 0, 0), 0),
    E(240, 255, new IP(255, 0, 0, 0), 0);

    private final int minimo;
    private final int maximo;
    private final IP mascara;
    private final int maximoHosts;

    public int getMaximoHosts() {
        return maximoHosts;
    }

    public boolean pertenece(IP ip) {
        return ip.getPrimerOcteto() >= this.minimo && ip.getPrimerOcteto() < this.maximo;
    }

    public IP getMascara() {
        return mascara;
    }

    Clase(int minimo, int maximo, IP ip, int maximoHosts) {
        this.minimo = minimo;
        this.maximo = maximo;
        this.mascara = ip;
        this.maximoHosts = maximoHosts;
    }
}
