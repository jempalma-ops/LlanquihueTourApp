package util;

/**
 * Clase encargada de comprobar que los datos
 * de los tours sean correctos.
 */
public class Validador {

    // Método para validar textos
    public static boolean validarTexto(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    // Método para validar precios
    public static boolean validarPrecio(int precio) {
        return precio >= 0;
    }
}

