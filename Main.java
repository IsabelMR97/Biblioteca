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
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa el ID del autor: ");
                    String id = scanner.nextLine();
                    System.out.print("Ingresa el correo electronico del autor: ");
                    String correoElectronico = scanner.nextLine();
                    System.out.print("Ingresa el año de publicación: ");
                    int yearPublicacion = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer
                    System.out.print("Ingresa el ISBN del libro: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Ingresa el estatus del libro (¿esta prestado? true/false): ");
                    boolean prestamo = scanner.nextBoolean();
                    scanner.nextLine();
                    
                    // Crear un nuevo libro y agregarlo a la biblioteca
                    Autor nuevoAutor = new Autor(nombre, id, correoElectronico);
                    Libro nuevoLibro = new Libro(titulo, nuevoAutor, yearPublicacion, isbn, prestamo);
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

                case 0:
                    // Prueba rapida de ingreso de libros
                    Autor autor1 = new Autor("Antoine de Saint-Exupery", "A001", "antoine@example.com");
                    Autor autor2 = new Autor("J.K. Rowling", "A002", "jkrowling@example.com");
                    Autor autor3 = new Autor("Arthur Conan Doyle", "A003", "arthur@example.com");
                    Autor autor4 = new Autor("Lewis Carroll", "A004", "lewis@example.com");
                    Autor autor5 = new Autor("Michelle Roche Rodrigez", "A005", "michelle@example.com");
                
                    Libro libro1 = new Libro("El principito", autor1, 1943, "978-0156013925", true);
                    Libro libro2 = new Libro("Harry Potter y la piedra filosofal", autor2, 1997, "978-8478884452", false);
                    Libro libro3 = new Libro("Las aventuras de Sherlock Holmes", autor3, 1892, "978-8497643658", true);
                    Libro libro4 = new Libro("Alicia en el pais de las maravillas", autor4, 1865, "978-8494326738", false);
                    Libro libro5 = new Libro("Malasangre", autor5, 2021, "978-8433998903", false);
                
                    biblioteca.agregarLibro(libro1);
                    biblioteca.agregarLibro(libro2);
                    biblioteca.agregarLibro(libro3);
                    biblioteca.agregarLibro(libro4);
                    biblioteca.agregarLibro(libro5);
                    System.out.println("¡Libros agregados exitosamente!");
                    break;

                default:
                    System.out.println("Opcion no válida. Intenta de nuevo.");
            }
        }
    }
}
