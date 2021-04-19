package proyect.cema.Web.API;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyect.cema.Services.Models.ProductDTO;
import proyect.cema.Services.Models.ProductServices;


@RestController
@RequestMapping("/productosAPI")
public class ProductController {
   
   
    private final ProductServices productServices;

    ProductController(ProductServices productServices){
        this.productServices=productServices;
    }

    @GetMapping()
    public List<ProductDTO> GetAll(){
        return productServices.GetAll();
    }

    @PostMapping
    public ProductDTO AddProduct(@RequestBody ProductDTO product){
        return productServices.add(product);
    }

    @PutMapping("/{id}")
    public ProductDTO UpdateProduct(@RequestBody ProductDTO product, @PathVariable("id") Long id){
        return productServices.update(id, product);
    }

    @GetMapping("/{id}")
    public List<ProductDTO> GetById(@PathVariable("id") Long id){
        return productServices.getById(id);
    }


}
