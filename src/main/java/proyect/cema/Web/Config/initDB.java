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
    CommandLineRunner initDataBase(UsuarioRepository usuario, ProductRepository product){
        return args ->{

            usuario.save(new UsuarioEntity("cesargusa22@gmail.com","jajaxdxd","cesargusa","Cesar","Gutierrez","https://media-exp1.licdn.com/dms/image/C5603AQE6G74tLiVRyQ/profile-displayphoto-shrink_200_200/0/1562172815294?e=1620259200&v=beta&t=jBLAKOfxtuBQwR7W3LwA3YmQN0o_jV2WMfW20Ly9bB8","722709600","Zaragoza","España","","Hombre",true));
            usuario.save(new UsuarioEntity("marieteloquete@gmail.com","ambel1234","marioguti3","Mario","Gutierrez","https://parma.repubblica.it/images/2012/09/14/141819337-d98f658e-289c-4a0d-8f00-20d8c5063773.jpg","1234456545","Madrid","España","","Hombre",false));
            usuario.save(new UsuarioEntity("marieteloquete@gmail.comerevrerveevv","123","marioambel","Marirevervreo","Gutierrezveveerv","https://parma.repubblica.it/images/2012/09/14/141819337-d98f658e-289c-4a0d-8f00-20d8c5063773.jpg","123445654veevervrv5","Madrid","España","reuh9eruheuhvuherhvr0uhrvrhvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvverferv","Mujer",true));


            product.save(new ProductEntity("Sudadera Nike",40L,"L","https://images.asos-media.com/products/sudadera-azul-marino-con-capucha-club-de-nike-plus/12495764-1-navy?$XXL$&wid=513&fit=constrain","Azul Marino","Como nuevo","Nike","Hombre"));
            product.save(new ProductEntity("Pantalon Stradivarius",23L,"43","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/elle-pantalon-negro-barato-stradivarius-c-1559142955.jpg?resize=480:*","Negro","Sin estrenar","Stradivarius","Hombre"));
            product.save(new ProductEntity("Camiseta Snipes",15L,"M","https://www.snipes.es/dw/image/v2/BDCB_PRD/on/demandware.static/-/Sites-snse-master-eu/default/dwf079653a/1964803_P.jpg?sw=780&sh=780&sm=fit&sfrm=png","Rojo","En buen estado ","Snipes","Mujer"));
            product.save(new ProductEntity("Cazadora North Face",170L,"XL","https://http2.mlstatic.com/casaca-chaqueta-mujer-north-face-fibra-800-cintura-D_NQ_NP_800779-MPE27648121921_062018-F.jpg","blanca","Como nuevo","North Face","Hombre"));
            product.save(new ProductEntity("Cortavientos Adidas ",50L,"M","https://images-na.ssl-images-amazon.com/images/I/713Y%2BqQdKmL._AC_UY879_.jpg","verde","Sin estrenar","Adidas","Mujer"));
      
        };

    }


}
   

