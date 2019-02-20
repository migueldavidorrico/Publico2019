package es.orricoquiles.boletin;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
    protected final String nombre;
    protected final String apellidos;
    protected final int numeroLista;

    public Alumno(String nombre, String apellidos, int numeroLista) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroLista = numeroLista;
    }

    @Override
    public int compareTo(Alumno o) {
        return this.numeroLista - o.numeroLista;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getNumeroLista() {
        return numeroLista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno)) return false;
        Alumno alumno = (Alumno) o;
        return numeroLista == alumno.numeroLista;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroLista);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numeroLista=" + numeroLista +
                '}';
    }
}
