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

import proyect.cema.Services.CategoriaService;
import proyect.cema.Services.Models.CategoriaDTO;

@RestController
@RequestMapping("/categoriasAPI")
public class CategoriaController {
    
    private final CategoriaService categoriaService;

    CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping()
    public List<CategoriaDTO> GetAll(){
        return categoriaService.GetAll();
    }

    @PostMapping
    public CategoriaDTO AddUsuario(@RequestBody CategoriaDTO usuario) {
        return categoriaService.add(usuario);
    }

    @PutMapping("/{id}")
    public CategoriaDTO UpdateUsuario(@RequestBody CategoriaDTO usuario, @PathVariable("id") Long id) {
        return categoriaService.update(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable("id") Long id){
        categoriaService.delete(id);
    }
}
