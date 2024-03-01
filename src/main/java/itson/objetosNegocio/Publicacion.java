package itson.objetosNegocio;

import java.util.Objects;

public class Publicacion {

    protected String isbn;
    protected String titulo;
    protected String editorial;
    protected String clasificacion;

    public Publicacion(){

    }

    public Publicacion(String isbn, String titulo, String editorial, String clasificacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
        this.clasificacion = clasificacion;
    }

    public Publicacion(String isbn) {
        this.isbn = isbn;
        this.titulo = null;
        this.editorial = null;
        this.clasificacion = null;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publicacion)) return false;
        Publicacion that = (Publicacion) o;
        return Objects.equals(getIsbn(), that.getIsbn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIsbn());
    }

    @Override
    public String toString() {
        return this.isbn+","+this.titulo+","+this.editorial+","+this.clasificacion;
    }
}
