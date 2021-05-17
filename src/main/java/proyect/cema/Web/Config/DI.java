package proyect.cema.Web.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import proyect.cema.Services.UsuarioServices;
import proyect.cema.Services.CategoriaService;
import proyect.cema.Services.ProductServices;
import proyect.cema.Services.ProductoCategoriaService;

@Configuration
public class DI {
    @Bean
    ModelMapper createModelMapper(){
        return new ModelMapper();
    }
    @Bean
    UsuarioServices createUsuario(){
        return new UsuarioServices();
    }

    @Bean
    ProductServices createProduct(){
        return new ProductServices();
    }
    @Bean
    CategoriaService createCategoria(){
        return new CategoriaService();
    }

    @Bean
    ProductoCategoriaService createProductoCategoria(){
        return new ProductoCategoriaService();
    }
    
}
