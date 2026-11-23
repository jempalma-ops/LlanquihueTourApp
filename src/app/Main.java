package app;

import service.GestorDatos;
import model.Tour;
import java.util.ArrayList;

/**
 * Clase principal encargada de ejecutar
 * el sistema de gestión de tours.
 */
public class Main {

    public static void main(String[] args) {

        // Crear un objeto de GestorDatos
        GestorDatos gestor = new GestorDatos();

        // Cargar los datos desde el archivo
        gestor.cargarTours();

        // Obtener la lista de tours
        ArrayList<Tour> listaTours = gestor.getTours();

        // Mostrar todos los tours
        System.out.println("\n===== SISTEMA LLANQUIHUE TOUR =====");
        System.out.println("\n===== LISTADO DE TOURS =====");

        for (Tour tour : listaTours) {
            System.out.println(tour);
        }

        // Filtrar tours con precio mayor a 15000
        System.out.println("\n===== TOURS CON PRECIO MAYOR A 15000 =====");

        for (Tour tour : listaTours) {
            if (tour.getPrecio() > 15000) {
                System.out.println(tour);
            }
        }
    }
}
