package model;

/**
 * Clase que representa el tipo de financiamiento
 * asociado a un tour.
 */
public class Financiamiento {

    // Atributos privados
    private String tipo;
    private String descripcion;

    // Constructor de la clase
    public Financiamiento(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    // Getter y setter del tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        return "Tipo de financiamiento: " + tipo +
                ",\nDescripción: " + descripcion;
    }
}
