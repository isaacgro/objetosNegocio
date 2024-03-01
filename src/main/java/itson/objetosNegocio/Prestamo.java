package itson.objetosNegocio;

import java.util.Objects;
import itson.objectosServicio.Fecha;

public class Prestamo {
    private Usuario usuario;
    private Publicacion publicacion;
    private Fecha fechaPrestamo;
    private int tiempoPrestamo;

    public Prestamo(){

    }

    public Prestamo(Usuario usuario, Publicacion publicacion, Fecha fechaPrestamo, int tiempoPrestamo){
        this.usuario = usuario;
        this.publicacion = publicacion;
        this.fechaPrestamo = fechaPrestamo;
        this.tiempoPrestamo = tiempoPrestamo;
    }

    public Prestamo(Usuario usuario) {
        this.usuario = usuario;
    }
    public Prestamo(Publicacion publicacion){
    this.publicacion = publicacion;
    }

    public Fecha getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Fecha fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public void setTiempoPrestamo(int tiempoPrestamo) {
        this.tiempoPrestamo = tiempoPrestamo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prestamo)) return false;
        Prestamo prestamo = (Prestamo) o;
        return Objects.equals(usuario, prestamo.usuario) && Objects.equals(publicacion, prestamo.publicacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, publicacion);
    }

    @Override
    public String toString() {
        return this.usuario+","+this.publicacion+","+this.fechaPrestamo+","+this.tiempoPrestamo;
    }
}

