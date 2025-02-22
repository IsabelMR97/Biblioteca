import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear objeto Biblioteca vacío
        Biblioteca biblioteca = new Biblioteca();
        
        // Usar Scanner para interactuar con el usuario
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Menú de opciones
            System.out.println("\n--- Menu de la Biblioteca ---");
            System.out.println("1. Agregar un libro");
            System.out.println("2. Mostrar todos los libros");
            System.out.println("3. Buscar un libro por titulo");
            System.out.println("4. Verificar si un libro es antiguo");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion (1-5): ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer del scanner
            
            switch (opcion) {
                case 1:
                    // Agregar un libro
                    System.out.println("\n--- Agregar un libro ---");
                    System.out.print("Ingresa el titulo del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingresa el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingresa el año de publicación: ");
                    int yearPublicacion = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer
                    System.out.print("Ingresa el ISBN del libro: ");
                    String isbn = scanner.nextLine();
                    
                    // Crear un nuevo libro y agregarlo a la biblioteca
                    Libro nuevoLibro = new Libro(titulo, autor, yearPublicacion, isbn);
                    biblioteca.agregarLibro(nuevoLibro);
                    System.out.println("¡Libro agregado exitosamente!");
                    break;
                
                case 2:
                    // Mostrar todos los libros
                    System.out.println("\n--- Libros en la biblioteca ---");
                    String libros = biblioteca.getLibros();
                    if (libros.isEmpty()) {
                        System.out.println("No hay libros en la biblioteca.");
                    } else {
                        System.out.println(libros);
                    }
                    break;
                
                case 3:
                    // Buscar un libro por título
                    System.out.println("\n--- Buscar un libro ---");
                    System.out.print("Ingresa el titulo del libro a buscar: ");
                    String tituloBusqueda = scanner.nextLine();
                    System.out.println(biblioteca.buscarLibroPorTitulo(tituloBusqueda));
                    break;
                
                case 4:
                    // Verificar si un libro es antiguo
                    System.out.println("\n--- Verificar si un libro es antiguo ---");
                    System.out.print("Ingresa el titulo del libro: ");
                    String tituloAntiguo = scanner.nextLine();
                    boolean encontrado = false;
                    for (Libro libro : biblioteca.libros) {
                        if (libro.toString().contains(tituloAntiguo)) {
                            System.out.println(libro.esAntiguo() ? "Sí, es antiguo." : "No, no es antiguo.");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontro el libro con ese titulo.");
                    }
                    break;
                
                case 5:
                    // Salir del programa
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Opcion no válida. Intenta de nuevo.");
            }
        }
    }
}
