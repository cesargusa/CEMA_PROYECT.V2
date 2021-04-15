package proyect.cema.Web.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import proyect.cema.Repositories.Entities.UsuarioEntity;
import proyect.cema.Repositories.Interfaces.UsuarioRepository;

@Configuration
public class initDB {
    @Bean
    CommandLineRunner initDataBase(UsuarioRepository usuario){
        return args ->{
            usuario.save(new UsuarioEntity("cesargusa22@gmail.com","jajaxdxd","Cesar","Gutierrez","722709600","Zaragoza","España",""));
            usuario.save(new UsuarioEntity("marieteloquete@gmail.com","ambel1234","Mario","Gutierrez","1234456545","Madrid","España",""));
        };

    }
}
