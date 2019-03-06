package es.orricoquiles.dentadura;

public enum PosicionesDientes {
    SI_TERCER_MOLAR(0, 0),
    SI_SEGUNDO_MOLAR(0, 1),
    SI_PRIMER_MOLAR(0, 2),
    SI_SEGUNDO_PREMOLAR(0, 3),
    SI_PRIMER_PREMOLAR(0, 4),
    SI_CANINO(0, 5),
    SI_INCISIVO_LATERAL(0, 6),
    SI_INCISIVO_CENTRAL(0, 7),
    SD_TERCER_MOLAR(0, 15),
    SD_SEGUNDO_MOLAR(0, 14),
    SD_PRIMER_MOLAR(0, 13),
    SD_SEGUNDO_PREMOLAR(0, 12),
    SD_PRIMER_PREMOLAR(0, 11),
    SD_CANINO(0, 10),
    SD_INCISIVO_LATERAL(0, 9),
    SD_INCISIVO_CENTRAL(0, 8),
    II_TERCER_MOLAR(1, 0),
    II_SEGUNDO_MOLAR(1, 1),
    II_PRIMER_MOLAR(1, 2),
    II_SEGUNDO_PREMOLAR(1, 3),
    II_PRIMER_PREMOLAR(1, 4),
    II_CANINO(1, 5),
    II_INCISIVO_LATERAL(1, 6),
    II_INCISIVO_CENTRAL(1, 7),
    ID_TERCER_MOLAR(1, 15),
    ID_SEGUNDO_MOLAR(1, 14),
    ID_PRIMER_MOLAR(1, 13),
    ID_SEGUNDO_PREMOLAR(1, 12),
    ID_PRIMER_PREMOLAR(1, 11),
    ID_CANINO(1, 10),
    ID_INCISIVO_LATERAL(1, 9),
    ID_INCISIVO_CENTRAL(1, 8),
    ;

    private final int fila;
    private final int columna;

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    PosicionesDientes(int i, int i1) {
        this.fila = i;
        this.columna = i1;
    }
}
