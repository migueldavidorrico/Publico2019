package orricoquiles;

public class AnimalSinHerencia {


    public enum TipoAnimal {
        PERRO(15), GATO(10), PAJARO(5);

        private final int edad;

        TipoAnimal(int edad) {
            this.edad = edad;
        }

        public int getEdad() {
            return edad;
        }
    }

    String nombre;
    int esperanzaVida;

    public AnimalSinHerencia(String nombre, int esperanzaVida) {
        this.nombre = nombre;
        this.esperanzaVida = esperanzaVida;
    }

    public AnimalSinHerencia(String nombre, TipoAnimal tipo) {
        this.nombre = nombre;
        this.esperanzaVida = tipo.getEdad();
    }
}
