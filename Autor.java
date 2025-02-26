public class Autor {
    // Atributos
    private String nombre;
    private String id;
    private String correoElectronico;

    //constructor
    public Autor(String nombre, String id, String correoElectronico) {
        this.nombre = nombre;
        this.id = id;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String toString() {
        return "\nAutor: " + nombre + "\nID: " + id + "\nCorreo Electronico: " + correoElectronico +"\n";
    }
}
