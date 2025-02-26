import java.util.ArrayList;

public class Biblioteca {
    // Atributos
    public ArrayList<Libro> libros;

    // Constructor
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // Métodos
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public String getLibros() {
        StringBuilder sb = new StringBuilder();
        for (Libro libro : libros) {
            sb.append(libro.toString()).append("\n");
        }
        return sb.toString();
    }

    public String buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro.toString(); // Regresa la información del libro
            }
        }
        return "Libro no encontrado: " + titulo; // Si no encuentra el libro, regresa un mensaje de error
    }

    public String librosPrestados(boolean prestamo) {
        StringBuilder resultado = new StringBuilder();
    
        for (Libro libro : libros) {
            // Si prestamo es true, mostrar solo libros prestados
            if (prestamo && libro.getPrestamo()) {
                resultado.append(libro.toString()).append("\n");
            }
            // Si prestamo es false, mostrar solo libros no prestados
            else if (!prestamo && !libro.getPrestamo()) {
                resultado.append(libro.toString()).append("\n");
            }
        }
    
        // Si no se encontraron libros, devolver un mensaje
        if (resultado.length() == 0) {
            return "No se encontraron libros " + (prestamo ? "prestados." : "no prestados.");
        }
    
        return resultado.toString(); // Devolver la lista de libros
    }

    @Override
    public String toString() {
        return getLibros();
    }
}