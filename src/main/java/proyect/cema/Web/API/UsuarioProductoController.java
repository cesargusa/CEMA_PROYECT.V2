package proyect.cema.Web.API;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyect.cema.Services.UsuarioProductoService;
import proyect.cema.Services.Models.UsuarioProductoDTO;

@RestController
@RequestMapping("/usuariosProductosAPI")
public class UsuarioProductoController {
    private final UsuarioProductoService usuarioProductoService;

    UsuarioProductoController(UsuarioProductoService usuarioProductoService){
        this.usuarioProductoService=usuarioProductoService;
    }

    @GetMapping()
    public List<UsuarioProductoDTO> GetAll(){
        return usuarioProductoService.GetAll();
    }

    @PostMapping
    public UsuarioProductoDTO AddUsuario(@RequestBody UsuarioProductoDTO usuario) {
        return usuarioProductoService.add(usuario);
    }

    @PutMapping("/{id}")
    public UsuarioProductoDTO UpdateUsuario(@RequestBody UsuarioProductoDTO usuario, @PathVariable("id") Long id) {
        return usuarioProductoService.update(id, usuario);
    }

    @GetMapping("/{id}")
    public List<UsuarioProductoDTO> GetById(@PathVariable("id") Long id) {
        return usuarioProductoService.getById(id);
    }

   

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable("id") Long id){
        usuarioProductoService.delete(id);
    }
}
