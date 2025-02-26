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

    @Override
    public String toString() {
        return getLibros();
    }
}