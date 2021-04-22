package proyect.cema.Web.API;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
            @RequestParam(name = "precio", required = false, defaultValue = "0") Long precio,
            @RequestParam(name = "talla", required = false, defaultValue = "") String talla,
            @RequestParam(name = "marca", required = false, defaultValue = "") String marca) {
        if (nombre_producto.equals("") && precio == 0 && talla.equals("") && marca.equals("")) {
            return productServices.GetAll();
        }

        if (!nombre_producto.equals("") && precio == 0 && talla.equals("") && marca.equals("")) {
            return productServices.getByName(nombre_producto,precio,talla,marca);

        }
        if (nombre_producto.equals("") && precio != 0 && talla.equals("") && marca.equals("")) {
            return productServices.getByName(nombre_producto,precio,talla,marca);

        }



       /*  if (!nombre_producto.equals("") && precio == 0) {
            return productServices.getByName(nombre_producto);

        }
        if (nombre_producto.equals("") && precio != 0) {
            return productServices.getByPrice(precio);

        }
        if (!nombre_producto.equals("") && precio != 0) {
            return productServices.getByPrice(precio);

        }
         */
        return null;

    }


   /*  @GetMapping()
    public List<ProductDTO> GetByPrice(
            @RequestParam(name = "precio", required = false, defaultValue = "0") Long precio) {
        if (precio == 0) {
            return productServices.GetAll();
        }
        if (precio != 0) {
            return productServices.getByPrice(precio);

        }
        return null;

    } */

}
