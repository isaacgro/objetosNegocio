package itson.objetosNegocio;

import java.util.Objects;

public class PublicacionED {
    private Publicacion publicacion;
    private int existencia;
    private int disponibilidad;

    public PublicacionED() {

    }

    public PublicacionED(Publicacion publicacion, int existencia, int disponibilidad) {
        this.publicacion = publicacion;
        this.existencia = existencia;
        this.disponibilidad = disponibilidad;
    }

    public PublicacionED(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PublicacionED)) return false;
        PublicacionED that = (PublicacionED) o;
        return Objects.equals(getPublicacion(), that.getPublicacion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPublicacion());
    }

    @Override
    public String toString() {
        return this.publicacion+","+this.existencia+","+this.disponibilidad;
    }
}




