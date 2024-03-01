package itson.objetosNegocio;

import java.util.Objects;

public class Usuario {
    private String numCredencial;
    private String nombre;
    private String direccion;
    private String telefono;


    public Usuario(){

    }
    public Usuario(String numCredencial,String nombre,String direccion, String telefono){
        this.numCredencial = numCredencial;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Usuario(String numCredencial){
        this.numCredencial = numCredencial;
    }

    public String getNumCredencial() {
        return numCredencial;
    }

    public void setNumCredencial(String numCredencial) {
        this.numCredencial = numCredencial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(getNumCredencial(), usuario.getNumCredencial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumCredencial());
    }



    @Override
    public String toString(){
        return this.numCredencial+","+this.nombre+","+this.direccion+","+this.telefono;
    }


}
