package es.orricoquiles.poo;

public abstract class Acceso {
    protected int intentos;
    protected String nombre;
    protected String password;

    Acceso(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
        intentos = 0;
    }

    public abstract boolean intento(String password);

    public abstract boolean cuentaBloqueada();
}

class UsoNormal extends Acceso {
    public UsoNormal(String nombre, String password) {
        super(nombre, password);
    }

    @Override
    public boolean intento(String password) {
        this.intentos++;
        return this.password.equals(password);
    }

    @Override
    public boolean cuentaBloqueada() {
        return this.intentos > 5;
    }
}

class RecienInstalado extends Acceso {

    public RecienInstalado(String nombre, String password) {
        super(nombre, password);
    }

    @Override
    public boolean intento(String password) {
        return password.equals("12345");
    }

    @Override
    public boolean cuentaBloqueada() {
        return true;
    }
}
