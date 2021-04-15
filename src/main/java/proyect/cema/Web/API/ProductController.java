package proyect.cema.Web.API;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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
}
