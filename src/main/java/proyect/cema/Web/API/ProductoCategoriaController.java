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

import proyect.cema.Services.ProductoCategoriaService;
import proyect.cema.Services.Models.ProductoCategoriaDTO;

@RestController
@RequestMapping("/productosCategoriasAPI")
public class ProductoCategoriaController {
    private final ProductoCategoriaService productoCategoriaService;

    ProductoCategoriaController(ProductoCategoriaService productoCategoriaService){
        this.productoCategoriaService=productoCategoriaService;
    }

    @GetMapping()
    public List<ProductoCategoriaDTO> GetAll(){
        return productoCategoriaService.GetAll();
    }

    @PostMapping
    public ProductoCategoriaDTO AddUsuario(@RequestBody ProductoCategoriaDTO usuario) {
        return productoCategoriaService.add(usuario);
    }

    @PutMapping("/{id}")
    public ProductoCategoriaDTO UpdateUsuario(@RequestBody ProductoCategoriaDTO usuario, @PathVariable("id") Long id) {
        return productoCategoriaService.update(id, usuario);
    }

    @GetMapping("/{id}")
    public List<ProductoCategoriaDTO> GetById(@PathVariable("id") Long id) {
        return productoCategoriaService.getById(id);
    }

   

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable("id") Long id){
        productoCategoriaService.delete(id);
    }
   

}
