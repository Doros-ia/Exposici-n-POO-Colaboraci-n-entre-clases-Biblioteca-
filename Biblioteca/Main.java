package Biblioteca;

public class Main {
    public static void main(String[] args) {

        // 1. Creamos 10 objetos (instancias) de la clase Libro
        Libro libro1  = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2  = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
        Libro libro3  = new Libro("Huasipungo", "Jorge Icaza");
        Libro libro4  = new Libro("El principito", "Antoine de Saint-Exupéry");
        Libro libro5  = new Libro("1984", "George Orwell");
        Libro libro6  = new Libro("Rayuela", "Julio Cortázar");
        Libro libro7  = new Libro("La ciudad y los perros", "Mario Vargas Llosa");
        Libro libro8  = new Libro("Clean Code", "Robert C. Martin");
        Libro libro9  = new Libro("Pedro Páramo", "Juan Rulfo");
        Libro libro10 = new Libro("El túnel", "Ernesto Sabato");

        // Los agrupamos en un arreglo para recorrerlos fácilmente
        Libro[] biblioteca = {
            libro1, libro2, libro3, libro4, libro5,
            libro6, libro7, libro8, libro9, libro10
        };

        System.out.println("===== CATÁLOGO INICIAL =====");
        for (Libro libro : biblioteca) {
            libro.mostrarInfo();
        }

        // 2. Creamos préstamos y les pasamos un objeto Libro completo
        System.out.println("\n===== PRÉSTAMOS =====");
        Prestamo prestamo1 = new Prestamo("28/10/2026");
        prestamo1.procesarPrestamo(libro1);

        Prestamo prestamo2 = new Prestamo("29/10/2026");
        prestamo2.procesarPrestamo(libro3);

        Prestamo prestamo3 = new Prestamo("30/10/2026");
        prestamo3.procesarPrestamo(libro8);

        // Intento de prestar un libro que ya está prestado
        Prestamo prestamo4 = new Prestamo("31/10/2026");
        prestamo4.procesarPrestamo(libro1);

        // 3. Devolución
        System.out.println("\n===== DEVOLUCIONES =====");
        libro3.devolver();

        System.out.println("\n===== CATÁLOGO FINAL =====");
        for (Libro libro : biblioteca) {
            libro.mostrarInfo();
        }
    }
}
