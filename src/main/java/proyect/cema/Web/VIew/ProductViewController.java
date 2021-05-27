package proyect.cema.Web.VIew;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
    public ModelAndView GetAllProducts(@RequestParam(name = "nombre_producto", required = false, defaultValue = "") String nombre_producto,
     @RequestParam(name = "talla", required = false, defaultValue = "") String talla,
     @RequestParam(name = "marca", required = false, defaultValue = "") String marca,
     @RequestParam(name = "sexo", required = false, defaultValue = "") String sexo,
     @RequestParam(name = "estado", required = false, defaultValue = "") String estado,
            @RequestParam(name = "color", required = false, defaultValue = "") String color){
        List<ProductDTO> allProducts = productController.GetByName(nombre_producto,talla,marca,sexo,estado,color);
        ModelAndView mv = new ModelAndView("productosControl");
        mv.addObject("productos", allProducts);
        return mv;
    } 
    @GetMapping("/productosControl/{id}")
    public ModelAndView GetAProductsId(@PathVariable("id") Long id){
        List<ProductDTO> allProducts = productController.GetById(id);
        ModelAndView mv = new ModelAndView("productosControl");
        mv.addObject("productos", allProducts);
        return mv;
    } 
    @GetMapping("/")
    public ModelAndView Index(@RequestParam(name = "nombre_producto", required = false, defaultValue = "") String nombre_producto,
     @RequestParam(name = "talla", required = false, defaultValue = "") String talla,
     @RequestParam(name = "marca", required = false, defaultValue = "") String marca,
     @RequestParam(name = "sexo", required = false, defaultValue = "") String sexo,
     @RequestParam(name = "estado", required = false, defaultValue = "") String estado,
     @RequestParam(name = "color", required = false, defaultValue = "") String color
){
        List<ProductDTO> allProducts = productController.GetByName(nombre_producto,talla,marca,sexo,estado,color);
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("productos", allProducts);
        return mv;
    } 
    @GetMapping("/DESC")
    public ModelAndView Desc(){
        List<ProductDTO> allProductsOrderByPrecioDESC = productController.GetOrderPriceDESC();
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("productos", allProductsOrderByPrecioDESC);
        return mv;
    }
/*     @GetMapping("/BOYS")
    public ModelAndView Boys(){
        List<ProductDTO> allProductsOrderByHombres = productController.GetOrderHombres();
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("productos", allProductsOrderByHombres);
        return mv;
    }

    @GetMapping("/WOMENS")
    public ModelAndView Womens(){
        List<ProductDTO> allProductsOrderByMujeres = productController.GetOrderMujeres();
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("productos", allProductsOrderByMujeres);
        return mv;
    }

    @GetMapping("/ACCESORIOS")
    public ModelAndView Accesorios(){
        List<ProductDTO> allProductsOrderByAccesorios = productController.GetOrderAccesorios();
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("productos", allProductsOrderByAccesorios);
        return mv;
    } */

    @GetMapping("/ASC")
    public ModelAndView Asc(){
        List<ProductDTO> allProductsOrderByPrecioASC = productController.GetOrderPriceASC();
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("productos", allProductsOrderByPrecioASC);
        return mv;
    }

    @GetMapping("/productos/{id}")
    public ModelAndView GetProductosIdMostrar(@PathVariable("id") Long id) {
        List<ProductDTO> allProductos = productController.GetById(id);
        ModelAndView mv = new ModelAndView("productosID");
        mv.addObject("productos", allProductos);
        return mv;
    }

    @GetMapping("/aboutus")
    public ModelAndView AboutUs() {
        ModelAndView mv = new ModelAndView("about-us");
        return mv;
    }

    
    @GetMapping("/subetuproducto")
    public ModelAndView SubetuProducto() {
        ModelAndView mv = new ModelAndView("subetuproducto");
        return mv;
    }
}