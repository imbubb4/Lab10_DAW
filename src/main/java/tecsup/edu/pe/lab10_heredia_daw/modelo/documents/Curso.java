package tecsup.edu.pe.lab10_heredia_daw.modelo.documents;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "cursos")
public class Curso {
    @Id
    private String id;
    private String nombre;
    private int creditos;

    public Curso() {
    }
    public Curso(String id, String nombre, int creditos) {
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCreditos() {
        return creditos;
    }
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", nombre='" + nombre + '\'' + ", creditos=" + creditos + '}';
    }
}
