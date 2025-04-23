package Models;

public class Book {
    
    private String nombre;
    private int año;
    public Book(String nombre, int año) {
        this.nombre = nombre;
        this.año = año;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    @Override
    public String toString() {
        return "Book [nombre=" + nombre + ", año=" + año + "]";
    }
    
    
    

    
}
