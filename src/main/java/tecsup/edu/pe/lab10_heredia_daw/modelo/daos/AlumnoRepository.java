package tecsup.edu.pe.lab10_heredia_daw.modelo.daos;

import org.springframework.data.mongodb.repository.MongoRepository;
import tecsup.edu.pe.lab10_heredia_daw.modelo.documents.Alumno;

public interface AlumnoRepository extends MongoRepository<Alumno, String> {
}
