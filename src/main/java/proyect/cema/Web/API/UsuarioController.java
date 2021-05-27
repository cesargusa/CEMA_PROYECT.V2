package proyect.cema.Web.API;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import proyect.cema.Services.UsuarioServices;
import proyect.cema.Services.Models.UsuarioDTO;

@RestController
@RequestMapping("/usuariosAPI")
public class UsuarioController {
    private final UsuarioServices usuarioServices;

    UsuarioController(UsuarioServices usuarioServices) {
        this.usuarioServices = usuarioServices;
    }

    @PostMapping
    public UsuarioDTO AddUsuario(@RequestBody UsuarioDTO usuario) {
        return usuarioServices.add(usuario);
    }

    @PutMapping("/{id}")
    public UsuarioDTO UpdateUsuario(@RequestBody UsuarioDTO usuario, @PathVariable("id") Long id) {
        return usuarioServices.update(id, usuario);
    }

    @GetMapping("/{id}")
    public List<UsuarioDTO> GetById(@PathVariable("id") Long id) {
        return usuarioServices.getById(id);
    }

    @GetMapping("/inicio-sesion/{email}/{contrasena}")
    public List<UsuarioDTO> GetByEmail(@PathVariable("email") String email,
            @PathVariable("contrasena") String contrasena) {
        return usuarioServices.findUserEmail(email, contrasena);
    }

 /*    @GetMapping("/{usuario}")
    public List<UsuarioDTO> GetByUser(@RequestParam("usuario") String usuario) {
        return usuarioServices.findName(usuario);
    } */
    @GetMapping()
    public List<UsuarioDTO> GetByUser(
            @RequestParam(name = "usuario", required = false, defaultValue = "") String usuario
        ) {
        // MUESTRA TODO SI NO HAY FILTROS
        if (usuario.equals("")) {
            return usuarioServices.GetAll();
        }else{
            return usuarioServices.findName(usuario);
        } 
    }
    @DeleteMapping("/{id}")
    public void Delete(@PathVariable("id") Long id) {
        usuarioServices.delete(id);
    }
}
