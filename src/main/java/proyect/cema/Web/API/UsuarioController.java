package proyect.cema.Web.API;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyect.cema.Services.UsuarioServices;
import proyect.cema.Services.Models.UsuarioDTO;

@RestController
@RequestMapping("/usuariosAPI")
public class UsuarioController {
    private final UsuarioServices usuarioServices;

    UsuarioController(UsuarioServices usuarioServices){
        this.usuarioServices=usuarioServices;
    }

    @GetMapping()
    public List<UsuarioDTO> GetAll(){
        return usuarioServices.GetAll();
    }
}
