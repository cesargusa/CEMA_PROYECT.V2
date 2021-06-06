package proyect.cema.Web.VIew;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import proyect.cema.Services.Models.CategoriaDTO;
import proyect.cema.Services.Models.ProductDTO;
import proyect.cema.Web.API.CategoriaController;
import proyect.cema.Web.API.ProductController;


@Controller
public class ProductViewController {
    private final ProductController productController;
    private final CategoriaController categoriaController;


    ProductViewController(ProductController productController, CategoriaController categoriaController){
        this.productController=productController;
        this.categoriaController=categoriaController;
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
     @RequestParam(name = "color", required = false, defaultValue = "") String color,
     @RequestParam(name = "categoria",required = false,defaultValue = "")String categoria
){
        List<ProductDTO> allProducts = productController.GetByName(nombre_producto,talla,marca,sexo,estado,color);
        List<ProductDTO> categoriaProducts = productController.c(categoria);
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("productos", allProducts);
        mv.addObject("categorias", categoriaProducts);
        return mv;
    } 
    @GetMapping("/categorias")
    public ModelAndView GetAllProducts(@RequestParam(name = "nombre_categoria",required = false,defaultValue = "")String nombre_categoria,
    @RequestParam(name = "nombre_producto", required = false, defaultValue = "") String nombre_producto,
     @RequestParam(name = "talla", required = false, defaultValue = "") String talla,
     @RequestParam(name = "marca", required = false, defaultValue = "") String marca,
     @RequestParam(name = "sexo", required = false, defaultValue = "") String sexo,
     @RequestParam(name = "estado", required = false, defaultValue = "") String estado,
     @RequestParam(name = "color", required = false, defaultValue = "") String color,
     @RequestParam(name = "categoria",required = false,defaultValue = "")String categoria){
        List<CategoriaDTO> allCategories = categoriaController.GetAll();
        List<ProductDTO> allProducts = productController.GetByName(nombre_producto, talla, marca, sexo, estado, color);

        ModelAndView mv = new ModelAndView("categorias");
        mv.addObject("categorias", allCategories);
        mv.addObject("productos", allProducts);

        return mv;
    } 
    @GetMapping("/categorias/{nombre_categoria}")
    public ModelAndView GetCategories(@PathVariable("nombre_categoria") String nombre_categoria){
        List<ProductDTO> allCategories = productController.c(nombre_categoria);

        ModelAndView mv = new ModelAndView("categorias");
        mv.addObject("cat", allCategories);

        return mv;
    } 

    @GetMapping("/DESC")
    public ModelAndView Desc(){
        List<ProductDTO> allProductsOrderByPrecioDESC = productController.GetOrderPriceDESC();
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("productos", allProductsOrderByPrecioDESC);
        return mv;
    }


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

    
    @GetMapping("/sube")
    public ModelAndView SubeProducto(){
        ModelAndView mv = new ModelAndView("sube");
        mv.addObject("productos", new ProductDTO());
        return mv;
    }

    @PostMapping("/crear-producto")
    public String Add(@ModelAttribute("productos") ProductDTO producto){
       productController.AddProduct(producto);
        return "redirect:/";
    }

    @GetMapping("/terminos-servicios")
    public ModelAndView TerminosServicios() {
        ModelAndView mv = new ModelAndView("terminosyservicios");
        return mv;
    }
}