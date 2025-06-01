package tecsup.edu.pe.lab10_heredia_daw.modelo.daos;

import tecsup.edu.pe.lab10_heredia_daw.modelo.documents.Curso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CursoRepository extends MongoRepository<Curso, String>{
}
