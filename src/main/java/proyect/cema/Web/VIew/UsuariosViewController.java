package proyect.cema.Web.VIew;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import proyect.cema.Services.Models.UsuarioDTO;
import proyect.cema.Web.API.UsuarioController;

@Controller
public class UsuariosViewController {
    private final UsuarioController usuarioController;

    UsuariosViewController(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
    }

    @GetMapping("/usuariosControl")
    public ModelAndView GetAllUsuariosControl() {
        List<UsuarioDTO> allUsuarios = usuarioController.GetAll();
        ModelAndView mv = new ModelAndView("usuariosControl");
        mv.addObject("usuarios", allUsuarios);
        return mv;
    }
    @GetMapping("/usuariosControl/{id}")
    public ModelAndView GetUsuariosControlId(@PathVariable("id") Long id) {
        List<UsuarioDTO> allUsuarios = usuarioController.GetById(id);
        ModelAndView mv = new ModelAndView("usuariosControl");
        mv.addObject("usuarios", allUsuarios);
        return mv;
    }

    
    @GetMapping("/usuarios")
    public ModelAndView GetAllUsuarios() {
        List<UsuarioDTO> allUsuarios = usuarioController.GetAll();
        ModelAndView mv = new ModelAndView("usuarios");
        mv.addObject("usuarios", allUsuarios);
        return mv;
    }

    /* @GetMapping("/ususarios")
    public ModelAndView GetAllUsuarios(){
        List<UsuarioDTO> allUsuarios = usuarioController.GetAll();
        ModelAndView mv = new ModelAndView("usuarios");
        mv.addObject("usuarios", attributeValue)
    } */
}
