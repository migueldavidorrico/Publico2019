package es.orricoquiles.poo;

import java.util.Arrays;

public class ListaClase {

    public static void main(String[] args) {
        int[] numeros = {7, 9, 10, 67, 87, 239, 456};
        System.out.println(Arrays.binarySearch(numeros, 10));
        Movil[] moviles = {
                new Movil("Nokia", "Lumia", "6800")
        };


    }
}

class Movil {
    String marca;
    String modelo;
    String NS;

    public Movil(String marca, String modelo, String NS) {
        this.marca = marca;
        this.modelo = modelo;
        this.NS = NS;
    }
}



