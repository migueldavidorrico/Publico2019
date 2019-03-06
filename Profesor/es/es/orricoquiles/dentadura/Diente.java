package es.orricoquiles.dentadura;

public class Diente {
    private EstadoDiente estado = EstadoDiente.BUENO;

    public EstadoDiente getEstado() {
        return estado;
    }

    public void setEstado(EstadoDiente estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return estado.getMensaje();
    }
}

abstract class DientePostizo extends Diente {
    Duracion duracion;


    @Override
    public String toString() {
        return super.toString() + this.duracion.mensaje();
    }

    abstract class Duracion {
        public abstract String mensaje();
    }

    class DuracionAnyos extends Duracion {
        int anyos;

        public DuracionAnyos(int anyos) {
            this.anyos = anyos;
        }

        @Override
        public String mensaje() {
            return "Caduca en " + anyos + " años";
        }
    }

    class DuracionEstimada extends Duracion {
        String estimacion;

        public DuracionEstimada(String estimacion) {

            this.estimacion = estimacion;
        }

        @Override
        public String mensaje() {
            return estimacion;
        }
    }


}


class DienteMetalico extends DientePostizo {
    String metal;

    @Override
    public String toString() {
        return super.toString() + " DE: " + this.metal;
    }

    public DienteMetalico(String metal) {
        this.metal = metal;
        this.duracion = new DuracionAnyos(5);
    }
}

class DienteCeramico extends DientePostizo {
    TipoCeramico tipoCeramico;

    @Override
    public String toString() {
        return super.toString() + " " + this.tipoCeramico;
    }

    public DienteCeramico(TipoCeramico tipoCeramico) {
        this.tipoCeramico = tipoCeramico;
        this.duracion = new DuracionEstimada("Toda la vida");
    }
}
/*
    El problema planteado se trata en imprimir en una matriz
    la representación de la dentadura de un paciente que asiste
    a una cita odontológica. La matriz debe ser de 2X16
    (dientes superiores e inferiores). La dentadura humana
    consta de 32 dientes. Se debe leer es estado de cada diente
    siendo bueno: 1 y malo: 0. Al final mostrar la matriz
    resultante.

    Hay DientesPostizos (también pjueden estar buenos y malos)
    que serán (solo de habrá de estos tipos):
       -Metálico: Guardará el metal y tienen una duración de 5 años.
       -Cerámico: Guardan si son de rosca o implantes maxilares. Tienen una duración de Toda la vida


 */
/*Representar a un paciente con la dentadura sana,
se le ponen malos tres dientes (los que querais)
Se le sustituyen por dos cerámicos y uno de Titanio
Representar a otros 10 pacientes
 */