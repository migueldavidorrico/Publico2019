package es.orricoquiles.dentadura;

public class Dentadura {
    Diente[][] dientes;

    public void ponerMalo(PosicionesDientes pos) {
        this.dientes[pos.getFila()][pos.getColumna()].setEstado(EstadoDiente.MALO);


    }

    public void ponerMetalico(PosicionesDientes pos, String metal) {
        this.dientes[pos.getFila()][pos.getColumna()] = new DienteMetalico(metal);
    }

    public void ponerCeramico(PosicionesDientes pos, TipoCeramico tipo) {
        this.dientes[pos.getFila()][pos.getColumna()] = new DienteCeramico(tipo);
    }

    public Dentadura() {
        dientes = new Diente[2][16];
        for (int i = 0; i < dientes.length; i++) {
            for (int j = 0; j < dientes[i].length; j++) {
                dientes[i][j] = new Diente();
            }
        }
    }

    @Override
    public String toString() {
        String salida = "";
        for (int i = 0; i < dientes.length; i++) {
            for (int j = 0; j < dientes[i].length; j++) {
                salida += dientes[i][j].toString() + " ";
            }
            salida += "\n";
        }
        salida += "-----------------------------------\n";
        return salida;
    }


    public static void main(String[] args) {
        Dentadura d = new Dentadura();
        System.out.println(d);
        d.ponerMalo(PosicionesDientes.ID_TERCER_MOLAR);
        d.ponerCeramico(PosicionesDientes.ID_CANINO, TipoCeramico.IMPLANTE);

        System.out.println(d);


    }

}
