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
    CommandLineRunner initDataBase(UsuarioRepository usuario){
        return args ->{
            usuario.save(new UsuarioEntity("cesarGUSANO22@gmail.com","jajaxdxd","Cesar","Gutierrez","722709600","Zaragoza","España",""));
            usuario.save(new UsuarioEntity("marieteloquete@gmail.com","ambel1234","Mario","Gutierrez","1234456545","Madrid","España",""));
        };

    }

    CommandLineRunner initDataBase(ProductRepository product){
        return args ->{
            product.save(new ProductEntity("Sudadera Nike",40,"L","imagen1","azul marino","Como nuevo","Nike"));
            product.save(new ProductEntity("Pantalon Stradivarius",23,"43","imagen2","negro","Sin estrenar","Stradivarius"));
            product.save(new ProductEntity("Camiseta Snipes",15,"M","imagen3","rojo","En buen estado ","Snipes"));
            product.save(new ProductEntity("Cazadora North Face",170,"XL","imagen4","blanca","Como nuevo","Nike"));
            product.save(new ProductEntity("Cortavientos Adidas ",50,"M","imagen5","verde","Sin estrenar","Adidas"));
        };

    }
}
