package es.orricoquiles.boletin;

import java.util.ArrayList;

public class Boletin {
    Alumno alumno;
    ArrayList<String> asignaturas;
    ArrayList<Nota> notas;
    Evaluacion evaluacion;


    public Boletin(Alumno alumno, Evaluacion evaluacion) {
        this.alumno = alumno;
        this.evaluacion = evaluacion;
        asignaturas = new ArrayList<>();
        notas = new ArrayList<>();
    }

    public double media() {
        int suma = 0;
        for (Nota n :
                notas) {
            suma += n.getValoracionMedia();
        }
        return (double) suma / notas.size();
    }

    public void anyadeNota(String asignatura, Nota nota) {
        this.asignaturas.add(asignatura);
        this.notas.add(nota);
    }

    public String salidaBoletinImpresora() {
        String salida = "   EVALUACION: " + this.evaluacion;
        salida += "  ALUMNO:" + this.alumno.getApellidos() + ", " + this.alumno.getNombre() + "\n";
        for (int i = 0; i < asignaturas.size(); i++) {
            salida += asignaturas.get(i) + " - " + notas.get(i).getMostrar() + "\n";
        }
        int aprobadas = 0;
        int suspensas = 0;
        for (Nota n :
                notas) {
            if (n.estaAprobado()) {
                aprobadas++;
            } else {
                suspensas++;
            }
        }
        salida += "Ha aprobado " + aprobadas + " y ha suspendido " + suspensas + "\n";
        if (this.media() < 0) {
            salida += "ASIGNATURA ABANDONADA, NO PASARÁS";
        } else {
            salida += "La media es: " + String.format("%.2f", this.media());
        }
        return salida;
    }
}
