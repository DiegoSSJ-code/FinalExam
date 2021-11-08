/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.demop2bsegundo;

import gt.edu.umg.demop2bsegundo.dao.IpersonaDao;
import gt.edu.umg.demop2bsegundo.servicio.DepartamentoService;
import gt.edu.umg.demop2bsegundo.servicio.PersonaService;
import gt.edu.umg.demop2bsegundo.servicio.ProfesionService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Win10
 */

@Controller
public class ControladorInicio {
    @Autowired //sirve para inyectar dependecia de la clase dao
    private PersonaService personaService;
    @Autowired //sirve para inyectar dependecia de la clase dao
    private DepartamentoService departamentoService;
    @Autowired //sirve para inyectar dependecia de la clase dao
    private ProfesionService profesionService;
    //private IpersonaDao IpersonaDao;
    @GetMapping("/")
    public String inicio(Model model){
        var personas = personaService.listaPersonas();
        model.addAttribute("personas", personas);
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Persona persona){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Persona persona){
        personaService.guardar(persona);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{id_persona}")
    public String editar(Persona persona, Model model){
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }
    
    @GetMapping("/eliminar/{id_persona}")
    public String eliminar(Persona persona){
        personaService.eliminar(persona);
        return "redirect:/"; 
    }
    
    @GetMapping("/agregar_depto")
    public String agregar(Departamento depto){
        return "agregar_dep";
    }
    
    @PostMapping("/guardar_depto")
    public String guardar(Departamento depto){
        departamentoService.guardar(depto);
        return "redirect:/";
    }
    
    @GetMapping("/agregar_profesion")
    public String agregar(Profesion profesion){
        return "agregar_dep";
    }
    
    @PostMapping("/guardar_profesion")
    public String guardar(Profesion profesion){
        profesionService.guardar(profesion);
        return "redirect:/";
    }
}
