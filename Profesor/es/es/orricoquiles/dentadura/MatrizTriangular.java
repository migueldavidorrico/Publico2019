package es.orricoquiles.dentadura;


import javax.swing.*;

public class MatrizTriangular {


    public static void main(String[] args) {
        int NColumnas;
        int contador = 1;
        int[][] tabla;
        NColumnas = Integer.parseInt(JOptionPane.showInputDialog("De cuantas filas y columnas será la tabla"));
        tabla = new int[NColumnas][NColumnas];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < contador; j++) {
                tabla[i][j] = 1;
            }
            contador++;
        }

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j]);
            }
            System.out.println("");
        }
    }
}
