package tecsup.edu.pe.lab10_heredia_daw.modelo.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "alumnos")
public class Alumno {

    @Id
    private String id;
    private String nombre;
    private String apellido;
    private String dni;

    public Alumno() {
    }

    public Alumno(String id, String nombre, String apellido, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    // Getters y Setters

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getDni() { return dni; }

    public void setDni(String dni) { this.dni = dni; }
}
