public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int yearPublicacion;
    private String isbn;

    // Constructor
    public Libro(String titulo, String autor, int yearPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.yearPublicacion = yearPublicacion;
        this.isbn = isbn;
    }

    // Métodos
    public String getInformacion() {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nAño de Publicación: " + yearPublicacion + "\nISBN: " + isbn + "\n";
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean esAntiguo() {
        int yearActual = java.time.Year.now().getValue();
        return (yearActual - yearPublicacion) > 20;
    }

    @Override
    public String toString() {
        return getInformacion();
    }
}