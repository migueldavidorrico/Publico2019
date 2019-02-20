package es.orricoquiles.boletin;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal {

    public static final String REGEX = ",";

    public static void main(String[] args) throws IOException {
        List<String> lineasFichero = Files.readAllLines(Paths.get("PrimeroA.csv"));
        System.out.println("CONTENIDO DEL FICHERO:\n________________________");
        for (String s : lineasFichero) {
            System.out.println(s);

        }
        System.out.println("Tenemos " + (lineasFichero.size() - 1) + " alumnos");
        String primeraLinea = lineasFichero.remove(0);
        String[] datosPrimera = primeraLinea.split(REGEX);
        ArrayList<Boletin> clase = new ArrayList<>();
        int posicion = 1;
        for (String linea : lineasFichero) {
            String[] datos = linea.split(REGEX);
            Alumno a = new Alumno(datos[1], datos[0], posicion++);
            System.out.println(a);
            Boletin boletin = new Boletin(a, Evaluacion.PRIMERA);
            clase.add(boletin);
            for (int i = 2; i < datos.length; i++) {
                Nota notaReal;
                switch (datos[i]) {
                    case "1":
                        notaReal = Nota.UNO;
                        break;
                    case "2":
                        notaReal = Nota.DOS;
                        break;
                    case "3":
                        notaReal = Nota.TRES;
                        break;
                    case "4":
                        notaReal = Nota.CUATRO;
                        break;
                    case "5":
                        notaReal = Nota.CINCO;
                        break;
                    case "6":
                        notaReal = Nota.SEIS;
                        break;
                    case "7":
                        notaReal = Nota.SIETE;
                        break;
                    case "8":
                        notaReal = Nota.OCHO;
                        break;
                    case "9":
                        notaReal = Nota.NUEVE;
                        break;
                    case "10":
                        notaReal = Nota.DIEZ;
                        break;
                    case "NE":
                        notaReal = Nota.NE;
                        break;
                    case "CV":
                        notaReal = Nota.CV;
                        break;
                    case "MH":
                        notaReal = Nota.MH;
                        break;
                    default:
                        notaReal = Nota.CV;
                        break;
                }
//                System.out.println("Voy a añadir " + datosPrimera[i]+"-"+datos[i]);
                boletin.anyadeNota(datosPrimera[i], notaReal);
//                System.out.println(boletin.salidaBoletinImpresora());
            }

        }
        //THREREG
        for (Boletin b :
                clase) {
            System.out.println("_________________________________");
            System.out.println(b.salidaBoletinImpresora());
        }
    }
}
