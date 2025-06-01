package tecsup.edu.pe.lab10_heredia_daw.servicios;

import tecsup.edu.pe.lab10_heredia_daw.modelo.documents.Alumno;

import java.util.List;

public interface AlumnoService {
    void grabar(Alumno alumno);
    void eliminar(String id);
    Alumno buscar(String id);
    List<Alumno> listar();
}
