package es.orricoquiles.jerarquia;

public enum Raza {
    ELFO(80, 120), HUMANO(100, 100), ENANO(120, 30), TROLL(150, 0);

    private final int HPRaza;
    private final int MPRaza;

    public int getHPRaza() {
        return HPRaza;
    }

    public int getMPRaza() {
        return MPRaza;
    }

    Raza(int HPRaza, int MPRaza) {
        this.HPRaza = HPRaza;
        this.MPRaza = MPRaza;
    }
}
