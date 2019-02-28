package es.orricoquiles.lecturas;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Agenda agenda = new Agenda("contactos.txt");
        System.out.println(agenda);
    }
}
