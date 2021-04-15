package proyect.cema.Web.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import proyect.cema.Services.UsuarioServices;

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
}
