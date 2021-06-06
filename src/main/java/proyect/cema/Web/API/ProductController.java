package proyect.cema.Web.API;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
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
            @RequestParam(name = "talla", required = false, defaultValue = "") String talla,
            @RequestParam(name = "marca", required = false, defaultValue = "") String marca,
            @RequestParam(name = "sexo", required = false, defaultValue = "") String sexo,
            @RequestParam(name = "estado", required = false, defaultValue = "") String estado,
            @RequestParam(name = "color", required = false, defaultValue = "") String color) {
        if (marca.equals("") && nombre_producto.equals("") && talla.equals("") && sexo.equals("") && estado.equals("")
                && color.equals("")) {
            return productServices.GetAll();
        } else {
            return productServices.getByName(nombre_producto, marca, talla, sexo, estado, color);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
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

    @GetMapping("/categorias/{nombre_categoria}")
    public List<ProductDTO> c(@PathVariable("nombre_categoria")String nombre_categoria) {
        return productServices.findByCategory(nombre_categoria);
    }

    @GetMapping("/usuarioproducto/{id}")
    public List<ProductDTO> UsuarioProducto(@PathVariable("id")Long id) {
        return productServices.findIdUsuarioProducti(id);
    }

}
