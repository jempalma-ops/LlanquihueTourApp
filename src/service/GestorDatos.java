package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import model.Tour;
import util.Validador;

/**
 * Clase encargada de leer los datos de los tours
 * desde un archivo de texto y almacenarlos en un ArrayList.
 */
public class GestorDatos {

    // Atributo de la clase para almacenar los tours
    private ArrayList<Tour> tours;

    // Constructor de la clase
    public GestorDatos() {
        this.tours = new ArrayList<>();
    }

    // Método para cargar los tours desde el archivo
    public void cargarTours() {

        // Limpiar la colección antes de cargar nuevamente
        tours.clear();

        // Leer el archivo
        try (BufferedReader lector = new BufferedReader(
                new FileReader("resources/tours.txt"))) {

            String linea;

            while ((linea = lector.readLine()) != null) {

                // Ignorar líneas vacías
                if (linea.trim().isEmpty()) {
                    continue;
                }

                // Separar los datos utilizando punto y coma
                String[] datos = linea.split(";", -1);

                // Validar que existan los siete datos
                if (datos.length != 7) {
                    System.out.println("Registro inválido: " + linea);
                    continue;
                }

                try {
                    // Obtener los datos del archivo
                    String nombre = datos[0].trim();
                    String ubicacion = datos[1].trim();
                    int precio = Integer.parseInt(datos[2].trim());
                    String tipoFinanciamiento = datos[3].trim();
                    String descripcionFinanciamiento = datos[4].trim();
                    String nombreCategoria = datos[5].trim();
                    String descripcionCategoria = datos[6].trim();

                    // Validar los datos utilizando la clase Validador
                    if (!Validador.validarTexto(nombre) ||
                            !Validador.validarTexto(ubicacion) ||
                            !Validador.validarPrecio(precio) ||
                            !Validador.validarTexto(tipoFinanciamiento) ||
                            !Validador.validarTexto(descripcionFinanciamiento) ||
                            !Validador.validarTexto(nombreCategoria) ||
                            !Validador.validarTexto(descripcionCategoria)) {

                        System.out.println("Datos incorrectos: " + linea);
                        continue;
                    }

                    // Crear un objeto Tour
                    // Tour crea internamente Financiamiento y CategoriaTour
                    Tour tour = new Tour(
                            nombre,
                            ubicacion,
                            precio,
                            tipoFinanciamiento,
                            descripcionFinanciamiento,
                            nombreCategoria,
                            descripcionCategoria
                    );

                    // Agregar el objeto a la colección
                    tours.add(tour);

                } catch (NumberFormatException e) {
                    System.out.println("Error en el precio del registro: " + linea);
                }
            }

            System.out.println("Carga de tours finalizada.");

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    // Método para obtener la lista de tours
    public ArrayList<Tour> getTours() {
        return tours;
    }
}