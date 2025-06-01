package tecsup.edu.pe.lab10_heredia_daw.controladores;

import tecsup.edu.pe.lab10_heredia_daw.modelo.documents.Alumno;
import tecsup.edu.pe.lab10_heredia_daw.servicios.AlumnoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Map;

@Controller
@SessionAttributes("alumno")
public class AlumnoController {

    @Autowired
    private AlumnoService servicio;

    @RequestMapping(value = "/alumnos", method = RequestMethod.GET)
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de Alumnos");
        model.addAttribute("alumnos", servicio.listar());
        return "listarAlumnoView";
    }

    @RequestMapping(value = "/alumnos/form")
    public String crear(Map<String, Object> model) {
        Alumno alumno = new Alumno();
        model.put("alumno", alumno);
        model.put("titulo", "Formulario de Alumno");
        return "formAlumnoView";
    }

    @RequestMapping(value = "/alumnos/form/{id}")
    public String editar(@PathVariable("id") String id, Map<String, Object> model) {
        Alumno alumno = servicio.buscar(id);
        if (alumno == null) {
            return "redirect:/alumnos";
        }
        model.put("alumno", alumno);
        model.put("titulo", "Editar Alumno");
        return "formAlumnoView";
    }

    @RequestMapping(value = "/alumnos/form", method = RequestMethod.POST)
    public String guardar(@Valid Alumno alumno, BindingResult result, Model model, SessionStatus status) {
        if (result.hasErrors()) {
            model.addAttribute("titulo", "Formulario de Alumno");
            return "formAlumnoView";
        }
        servicio.grabar(alumno);
        status.setComplete();
        return "redirect:/alumnos";
    }

    @RequestMapping(value = "/alumnos/eliminar/{id}")
    public String eliminar(@PathVariable("id") String id) {
        if (id != null && !id.isEmpty()) {
            servicio.eliminar(id);
        }
        return "redirect:/alumnos";
    }
}
