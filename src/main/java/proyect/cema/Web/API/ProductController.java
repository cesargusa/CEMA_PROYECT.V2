package proyect.cema.Web.API;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import proyect.cema.Services.Models.ProductDTO;
import proyect.cema.Services.ProductServices;

@RestController
@RequestMapping("/productosAPI")
public class ProductController {

    private final ProductServices productServices;

    ProductController(ProductServices productServices) {
        this.productServices = productServices;
    }

    @PostMapping
    public ProductDTO AddProduct(@RequestBody ProductDTO product) {
        return productServices.add(product);
    }

    @PutMapping("/{id}")
    public ProductDTO UpdateProduct(@RequestBody ProductDTO product, @PathVariable("id") Long id) {
        return productServices.update(id, product);
    }

    @GetMapping("/{id}")
    public List<ProductDTO> GetById(@PathVariable("id") Long id) {
      
            return productServices.getById(id);
        }
     
       
    
 
    
    @GetMapping()
    public List<ProductDTO> GetByName(
            @RequestParam(name = "nombre_producto", required = false, defaultValue = "") String nombre_producto,
            
           /*    @RequestParam(name = "precio", required = false, defaultValue = "0") double
              precio, */
             
            @RequestParam(name = "talla", required = false, defaultValue = "") String talla,
            @RequestParam(name = "marca", required = false, defaultValue = "") String marca) {
        // MUESTRA TODO SI NO HAY FILTROS
        if (marca.equals("") && nombre_producto.equals("") && talla.equals("")) {
            return productServices.GetAll();
        }

        //NOMBRE
        if (marca.equals("") && !nombre_producto.equals("") && talla.equals("")) {
            return productServices.getByName(nombre_producto, marca, talla);
        }
        if (!marca.equals("") && !nombre_producto.equals("") && talla.equals("")) {
            return productServices.getByName(nombre_producto, marca, talla);
        }
        if (marca.equals("") && !nombre_producto.equals("") && !talla.equals("")) {
            return productServices.getByName(nombre_producto, marca, talla);
        }
        //MARCA
        if (!marca.equals("") && nombre_producto.equals("") && talla.equals("")) {
            return productServices.getByName(nombre_producto, marca, talla);
        }
        if (!marca.equals("") && !nombre_producto.equals("") && talla.equals("")) {
            return productServices.getByName(nombre_producto, marca, talla);
        }

        if (!marca.equals("") && nombre_producto.equals("") && !talla.equals("")) {
            return productServices.getByName(nombre_producto, marca, talla);
        }
        //TALLAS
        if (marca.equals("") && nombre_producto.equals("") && !talla.equals("")) {
            return productServices.getByName(nombre_producto, marca, talla);
        }
        if (!marca.equals("") && nombre_producto.equals("") && !talla.equals("")) {
            return productServices.getByName(nombre_producto, marca, talla);
        }
        if (marca.equals("") && !nombre_producto.equals("") && !talla.equals("")) {
            return productServices.getByName(nombre_producto, marca, talla);
        }

        // MUESTRA TODO
        if (!marca.equals("") && !nombre_producto.equals("") && !talla.equals("")) {
            return productServices.getByName(nombre_producto, marca, talla);
        }
       /*  if(precio !=0 && marca.equals("") && nombre_producto.equals("") && talla.equals("")){
            productServices.getPrecio(precio);
        }
         */
        return null;

 
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
         productServices.delete(id);
    }

    @GetMapping("/DESC")
    public List<ProductDTO> GetOrderPriceDESC() {
        return productServices.orderByPrecioDESC();
    }
    @GetMapping("/ASC")
    public List<ProductDTO> GetOrderPriceASC() {
        return productServices.orderByPrecioaASC();
    }

    @GetMapping("/BOYS")
    public List<ProductDTO> GetOrderHombres(){
        return productServices.orderByHombres();
    }

    @GetMapping("/WOMENS")
    public List<ProductDTO> GetOrderMujeres(){
        return productServices.orderByMujeres();
    }

    @GetMapping("/ACCESORIOS")
    public List<ProductDTO> GetOrderAccesorios(){
        return productServices.orderByAccesorios();
    }

}
