package proyect.cema.Web.VIew;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import proyect.cema.Services.Models.UsuarioDTO;
import proyect.cema.Web.API.UsuarioController;

@Controller
public class UsuariosViewController {
    private final UsuarioController usuarioController;

    UsuariosViewController(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
    }

  /*   @GetMapping("/usuariosControl")
    public ModelAndView GetAllUsuariosControl(@RequestParam(name = "usuario", required = false, defaultValue = "") String usuario) {
        List<UsuarioDTO> allUsuarios = usuarioController.GetByUser(usuario);
        ModelAndView mv = new ModelAndView("usuariosControl");
        mv.addObject("usuarios", allUsuarios);
        return mv;
    } */
    @GetMapping("/usuariosControl/{id}")
    public ModelAndView GetUsuariosControlId(@PathVariable("id") Long id) {
        List<UsuarioDTO> allUsuarios = usuarioController.GetById(id);
        ModelAndView mv = new ModelAndView("usuariosControl");
        mv.addObject("usuarios", allUsuarios);
        return mv;
    }

    
    @GetMapping("/usuarios")
    public ModelAndView GetAllUsuarios(@RequestParam(name = "usuario", required = false, defaultValue = "") String usuario,
    @RequestParam(name = "pais", required = false, defaultValue = "") String pais,
    @RequestParam(name = "sexo", required = false, defaultValue = "") String sexo){
    
        List<UsuarioDTO> usuariosFiltre = usuarioController.GetByUser(usuario,pais,sexo);
       
        ModelAndView mv = new ModelAndView("usuarios");
     
        mv.addObject("usuarios", usuariosFiltre);
        return mv;
    }
    @GetMapping("/usuarios/{id}")
    public ModelAndView GetUsuariosIdMostrar(@PathVariable("id") Long id) {
        List<UsuarioDTO> allUsuarios = usuarioController.GetById(id);
        ModelAndView mv = new ModelAndView("usuariosID");
        mv.addObject("usuarios", allUsuarios);
        return mv;
    }

    @GetMapping("/registro")
    public ModelAndView CrearUsuario() {
        ModelAndView mv = new ModelAndView("registro");
        mv.addObject("usuarios", new UsuarioDTO());
        return mv;
    }
    @GetMapping("/inicio-sesion")
    public ModelAndView InicioSesion() {
        ModelAndView mv = new ModelAndView("inicio-sesion");
        mv.addObject("usuarios", new UsuarioDTO());
        return mv;
    }


    @PostMapping("/crear-usuario")
    public String Add(@ModelAttribute("usuarios") UsuarioDTO usuario){
       usuarioController.AddUsuario(usuario);
        return "redirect:/usuarios";
    }

   
}
