public class Libro {
    // Atributos
    private String titulo;
    private Autor autor;
    private int yearPublicacion;
    private String isbn;
    private boolean prestamo;

    // Constructor
    public Libro(String titulo, Autor autor, int yearPublicacion, String isbn, boolean prestamo) {
        this.titulo = titulo;
        this.autor = autor;
        this.yearPublicacion = yearPublicacion;
        this.isbn = isbn;
        this.prestamo = prestamo;
    }

    // Métodos
    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getYearPublicacion() {
        return yearPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean getPrestamo(){
        return prestamo;
    }

    public void setPrestamo(boolean prestamo){
        this.prestamo = prestamo;
    }

    public boolean esAntiguo() {
        int yearActual = java.time.Year.now().getValue();
        return (yearActual - yearPublicacion) > 20;
    }

    public String toString() {
        return "Titulo: " + titulo + "\n" + autor.toString() + "\nAño de Publicación: " 
        + yearPublicacion + "\nISBN: " + isbn +  "\nEstatus: " + prestamo + "\n";
    }
}