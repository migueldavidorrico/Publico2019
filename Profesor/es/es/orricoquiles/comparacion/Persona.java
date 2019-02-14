package es.orricoquiles.comparacion;

public class Persona {
    String nombre;
    String apellidos;
    int edad;
    double notaCorte;

    public Persona(String nombre, String apellidos, int edad, double notaCorte) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.notaCorte = notaCorte;
    }

    @Override
    public String toString() {
        return nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", notaCorte=" + notaCorte + "\n";
    }
}
