package model;

/**
 * Clase que representa la categoría
 * a la que pertenece un tour.
 */
public class CategoriaTour {

    // Atributos privados
    private String nombre;
    private String descripcion;

    // Constructor de la clase
    public CategoriaTour(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Getter y setter del nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y setter de la descripción
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método toString
    @Override
    public String toString() {
        return "Categoría: " + nombre +
                ", \nDescripción: " + descripcion + "\n";
    }
}
