package itson.objetosNegocio;

import itson.objectosServicio.Fecha;

public class Revista extends Publicacion {
    private String Periodicidad;
    private Fecha fecha;

    public Revista(String Periodicidad, Fecha fecha) {
        this.Periodicidad = Periodicidad;
        this.fecha = fecha;
    }


    public Revista(String isbn, String titulo, String editorial, String clasificacion, String periodicidad, Fecha fecha)
        {
            super(isbn, titulo, editorial, clasificacion);
            Periodicidad = periodicidad;
            this.fecha = fecha;
        }

    public Revista(String isbn) {
            super(isbn);
            this.Periodicidad = null;
            this.fecha = null;
        }


        public String getPeriodicidad () {
            return Periodicidad;
        }

        public void setPeriodicidad (String periodicidad){
            Periodicidad = periodicidad;
        }

        public Fecha getFecha () {
            return fecha;
        }

        public void setFecha (Fecha fecha){
            this.fecha = fecha;
        }

        @Override
        public String toString () {
            return this.isbn + "," + this.titulo + "," + this.editorial + "," + this.clasificacion + "," + this.Periodicidad + "," + this.fecha;
        }
    }
