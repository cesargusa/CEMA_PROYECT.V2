package proyect.cema.Web.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import proyect.cema.Repositories.Entities.ProductEntity;
import proyect.cema.Repositories.Entities.UsuarioEntity;
import proyect.cema.Repositories.Interfaces.ProductRepository;
import proyect.cema.Repositories.Interfaces.UsuarioRepository;

@Configuration
public class initDB {
    @Bean
    CommandLineRunner initDataBase(UsuarioRepository usuario,ProductRepository product){
        return args ->{

            usuario.save(new UsuarioEntity("cesargusa22@gmail.com","jajaxdxd","Cesar","Gutierrez","https://media-exp1.licdn.com/dms/image/C5603AQE6G74tLiVRyQ/profile-displayphoto-shrink_200_200/0/1562172815294?e=1620259200&v=beta&t=jBLAKOfxtuBQwR7W3LwA3YmQN0o_jV2WMfW20Ly9bB8","722709600","Zaragoza","España",""));
            usuario.save(new UsuarioEntity("marieteloquete@gmail.com","ambel1234","Mario","Gutierrez","https://parma.repubblica.it/images/2012/09/14/141819337-d98f658e-289c-4a0d-8f00-20d8c5063773.jpg","1234456545","Madrid","España",""));

            product.save(new ProductEntity("Sudadera Nike",40,"L","imagen1","azul marino","Como nuevo","Nike"));
            product.save(new ProductEntity("Pantalon Stradivarius",23,"43","imagen2","negro","Sin estrenar","Stradivarius"));
            product.save(new ProductEntity("Camiseta Snipes",15,"M","imagen3","rojo","En buen estado ","Snipes"));
            product.save(new ProductEntity("Cazadora North Face",170,"XL","imagen4","blanca","Como nuevo","Nike"));
            product.save(new ProductEntity("Cortavientos Adidas ",50,"M","imagen5","verde","Sin estrenar","Adidas"));

        };

    }

   
}
