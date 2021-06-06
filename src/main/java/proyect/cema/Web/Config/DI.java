package proyect.cema.Web.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import proyect.cema.Services.UsuarioServices;
import proyect.cema.Web.API.SendMailController;
import proyect.cema.Services.CategoriaService;
import proyect.cema.Services.MailService;
import proyect.cema.Services.ProductServices;
import proyect.cema.Services.ProductoCategoriaService;
import proyect.cema.Services.UsuarioProductoService;

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

    @Bean 
    MailService sendMailService(){
        return new MailService();
    }
    @Bean
    UsuarioProductoService createUsuarioProducto(){
        return new UsuarioProductoService();
    }

}
