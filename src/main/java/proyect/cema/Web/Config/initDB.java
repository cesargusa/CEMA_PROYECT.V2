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
            usuario.save(new UsuarioEntity("cesargusa22@gmail.com","jajaxdxd","Cesar","Gutierrez","https://media-exp1.licdn.com/dms/image/C5603AQE6G74tLiVRyQ/profile-displayphoto-shrink_200_200/0/1562172815294?e=1620259200&v=beta&t=jBLAKOfxtuBQwR7W3LwA3YmQN0o_jV2WMfW20Ly9bB8","722709600","Zaragoza","España",""));
            usuario.save(new UsuarioEntity("marieteloquete@gmail.com","ambel1234","Mario","Gutierrez","https://parma.repubblica.it/images/2012/09/14/141819337-d98f658e-289c-4a0d-8f00-20d8c5063773.jpg","1234456545","Madrid","España",""));
        };

    }
}
