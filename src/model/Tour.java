package model;

/**
 * Clase que representa un tour de la agencia.
 * Contiene nombre, ubicación, precio, financiamiento y categoría.
 */
public class Tour {

    // Atributos privados
    private String nombre;
    private String ubicacion;
    private int precio;
    private Financiamiento financiamiento;
    private CategoriaTour categoria;

    // Constructor de la clase
    public Tour(String nombre, String ubicacion, int precio,
                String tipoFinanciamiento, String descripcion,
                String nombreCategoria, String descripcionCategoria) {

        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.precio = precio;

        // Crear el objeto Financiamiento
        this.financiamiento = new Financiamiento(
                tipoFinanciamiento,
                descripcion
        );

        // Crear el objeto CategoriaTour
        this.categoria = new CategoriaTour(
                nombreCategoria,
                descripcionCategoria
        );
    }

    // Getter y setter del nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y setter de la ubicación
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Getter y setter del precio
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // Getter del financiamiento
    public Financiamiento getFinanciamiento() {
        return financiamiento;
    }

    // Getter de la categoría
    public CategoriaTour getCategoria() {
        return categoria;
    }

    // Método toString
    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", Ubicación: " + ubicacion +
                ", Precio: " + precio +
                ", \n" + financiamiento +
                ", " + categoria;
    }
}
