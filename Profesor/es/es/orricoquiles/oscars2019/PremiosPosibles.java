package es.orricoquiles.oscars2019;

public enum PremiosPosibles {
    MEJOR_DIRECTOR("Mejor Director", new Informable() {
        @Override
        public String info(Premio p) {
            String salida = p.getTitulo() + "\n--------------------\n";
            salida += "LISTA DE NOMINADAS\n";
            for (Nominacion n :
                    p.getNominadas()) {
                NominacionPelicula nominacionPelicula = (NominacionPelicula) n;
                Pelicula peli = nominacionPelicula.getPelicula();
                salida += peli.getDirector() + " por " + peli.getTitulo();
                if (p.getGanadora() != null) {
                    if (p.getGanadora().equals(n)) {
                        salida += "<------ GANADORA";
                    }
                }
                salida += "\n";
            }
            return salida;
        }
    }), MEJOR_ACTOR("Mejor Actor Principal", new Informable() {
        @Override
        public String info(Premio p) {
            String salida = p.getTitulo() + "\n--------------------\n";
            salida += "LISTA DE NOMINADAS\n";
            for (Nominacion n :
                    p.getNominadas()) {
                NominacionPelicula nominacionPelicula = (NominacionPelicula) n;
                Pelicula peli = nominacionPelicula.getPelicula();
                salida += peli.getActorPrincipal() + " por " + peli.getTitulo();
                if (p.getGanadora() != null) {
                    if (p.getGanadora().equals(n)) {
                        salida += "<------ GANADORA";
                    }
                }
                salida += "\n";
            }
            return salida;
        }
    }), MEJOR_ACTRIZ("Mejor Actriz Principal", new Informable() {
        @Override
        public String info(Premio p) {
            String salida = p.getTitulo() + "\n--------------------\n";
            salida += "LISTA DE NOMINADAS\n";
            for (Nominacion n :
                    p.getNominadas()) {
                NominacionPelicula nominacionPelicula = (NominacionPelicula) n;
                Pelicula peli = nominacionPelicula.getPelicula();
                salida += peli.getActrizPrincipal() + " por " + peli.getTitulo();
                if (p.getGanadora() != null) {
                    if (p.getGanadora().equals(n)) {
                        salida += "<------ GANADORA";
                    }
                }
                salida += "\n";
            }
            return salida;
        }
    }),
    MEJOR_PELICULA("Mejor Película", new Informable() {
        @Override
        public String info(Premio p) {
            String salida = p.getTitulo() + "\n--------------------\n";
            salida += "LISTA DE NOMINADAS\n";
            for (Nominacion n :
                    p.getNominadas()) {
                NominacionPelicula nominacionPelicula = (NominacionPelicula) n;
                salida += nominacionPelicula.getPelicula().getTitulo() + "\n";
            }
            return salida;
        }
    }),
    MEJOR_BSO("Mejor BSO", new Informable() {
        @Override
        public String info(Premio p) {
            String salida = p.getTitulo() + "\n--------------------\n";
            salida += "LISTA DE NOMINADAS\n";
            for (Nominacion n :
                    p.getNominadas()) {
                NominacionPelicula nominacionPelicula = (NominacionPelicula) n;
                salida += nominacionPelicula.getPelicula().getTitulo() + "\n";
            }
            return salida;
        }
    });

    private final String titulo;
    private final Informable info;

    public String getTitulo() {
        return titulo;
    }

    public Informable getInfo() {
        return info;
    }

    PremiosPosibles(String s, Informable informable) {
        this.titulo = s;
        this.info = informable;
    }
}
