package tecsup.edu.pe.lab10_heredia_daw.servicios;

import tecsup.edu.pe.lab10_heredia_daw.modelo.documents.Curso;
import java.util.List;

public interface CursoService {

    public List<Curso> listar();

    public void grabar(Curso curso);

    public Curso buscar(String id);

    public void eliminar(String id);
}
