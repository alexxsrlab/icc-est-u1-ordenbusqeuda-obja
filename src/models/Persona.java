package models;

public class Persona {
    
    private String nombre;
    private int edad;
    private Direccion direccion;

    public Persona(String nombre, int edad, models.Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getCodigoDireccion(){
        return direccion.getCodigo();
    }

    public boolean compareCodigoDireccion(Persona persona){
        //boolean condicion = direccion.getCodigo() > persona.getDireccion().getCodigo();
        //return condicion;

        return getCodigoDireccion() > persona.getCodigoDireccion();
    }

    public boolean equalsByCodigoDireccion(int codigo){
        return getCodigoDireccion() == codigo;
    }

    public boolean compareCodigoDireccion(int codigo) {
        return getCodigoDireccion() > codigo;
    }

    @Override
    public String toString() {
        return "Persona su nombre es " + nombre + " su edad es " + edad + " y su direccion es " + direccion +"";
    }
    
}
