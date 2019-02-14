package es.orricoquiles.comparacion;

import java.util.Arrays;

public class Pruebas {
    public static void main(String[] args) {
        String[] lista = {"cancion", "poblacion", "oracion", "arbol", "caracol", "col"};
        Arrays.sort(lista);
        System.out.println(Arrays.toString(lista));

        Arrays.sort(lista, new ComparaTamanyo());
        System.out.println(Arrays.toString(lista));

        Persona[] clase = {
                new Persona("Ana", "López", 32, 5.0),
                new Persona("Bea", "López", 67, 7.0),
                new Persona("Clarita", "Abadía", 23, 9.0),
                new Persona("Delila", "López", 19, 2.0),
                new Persona("Elena", "López", 45, 5.5),
        };
        Arrays.sort(clase, (o1, o2) -> o1.nombre.length() - o2.nombre.length());
        System.out.println(Arrays.toString(clase));

    }
}
