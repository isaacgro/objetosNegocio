package itson.objetosNegocio;

public class Libro extends Publicacion{
    private String autor;
    private String edicion;

    public Libro(String autor, String edicion) {
        this.autor = autor;
        this.edicion = edicion;
    }

    public Libro(String isbn, String titulo, String editorial, String clasificacion, String autor, String edicion) {
        super(isbn, titulo, editorial, clasificacion);
        this.autor = autor;
        this.edicion = edicion;
    }

    public Libro(String isbn) {
        super(isbn);
        this.autor = null;
        this.edicion = null;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return this.isbn+","+this.titulo+","+this.editorial+","+this.clasificacion+","+this.autor+","+this.edicion;
    }
}





