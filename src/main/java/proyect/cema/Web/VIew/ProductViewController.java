package proyect.cema.Web.VIew;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import proyect.cema.Services.Models.ProductDTO;
import proyect.cema.Web.API.ProductController;


@Controller
public class ProductViewController {
    private final ProductController productController;

    ProductViewController(ProductController productController){
        this.productController=productController;
    }

    @GetMapping("/productosControl")
    public ModelAndView GetAllProducts(){
        List<ProductDTO> allProducts = productController.GetAll();
        ModelAndView mv = new ModelAndView("productosControl");
        mv.addObject("productos", allProducts);
        return mv;
    }
}