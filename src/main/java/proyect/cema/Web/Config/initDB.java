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


        /*   usuario.save(new UsuarioEntity("cesargusa22@gmail.com","jajaxdxd","cesargusa","Cesar","Gutierrez","https://media-exp1.licdn.com/dms/image/C5603AQE6G74tLiVRyQ/profile-displayphoto-shrink_200_200/0/1562172815294?e=1620259200&v=beta&t=jBLAKOfxtuBQwR7W3LwA3YmQN0o_jV2WMfW20Ly9bB8","722709600","Zaragoza","España","","Hombre",true));
            usuario.save(new UsuarioEntity("marietelgmail.com","ambel1234","marioguti3","Mario","Gutierrez","https://parma.repubblica.it/images/2012/09/14/141819337-d98f658e-289c-4a0d-8f00-20d8c5063773.jpg","1234456545","Madrid","España","","Hombre",false));
            usuario.save(new UsuarioEntity("marieteloqmail.comerevrerveevv","123","marioambel22","Marirevervreo","Gutierrezveveerv","https://parma.repubblica.it/images/2012/09/14/141819337-d98f658e-289c-4a0d-8f00-20d8c5063773.jpg","123445654veevervrv5","Madrid","España","reuh9eruheuhvuherhvr0uhrvrhvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvferv","Mujer",true));
            usuario.save(new UsuarioEntity("yahira99@gmail.com", "contrasena", "yahira99", "Yahira", "Hernandez", "https://i.vimeocdn.com/portrait/10108864_640x640", "72278212", "Madrid", "España", "Hola me gusta el jamon", "Mujer", true));


            product.save(new ProductEntity("Sudadera Nike",40,"L","https://images.asos-media.com/products/sudadera-azul-marino-con-capucha-club-de-nike-plus/12495764-1-navy?$XXL$&wid=513&fit=constrain","Azul Marino","Como nuevo","Nike","Hombre"));
            product.save(new ProductEntity("Pantalon Stradivarius",23,"M","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/elle-pantalon-negro-barato-stradivarius-c-1559142955.jpg?resize=480:*","Negro","Sin estrenar","Stradivarius","Hombre"));
            product.save(new ProductEntity("Camiseta Snipes",15.35,"M","https://www.snipes.es/dw/image/v2/BDCB_PRD/on/demandware.static/-/Sites-snse-master-eu/default/dwf079653a/1964803_P.jpg?sw=780&sh=780&sm=fit&sfrm=png","Rojo","En buen estado ","Snipes","Mujer"));
            product.save(new ProductEntity("Cazadora North Face",170,"XL","https://http2.mlstatic.com/casaca-chaqueta-mujer-north-face-fibra-800-cintura-D_NQ_NP_800779-MPE27648121921_062018-F.jpg","blanca","Como nuevo","North Face","Hombre"));
            product.save(new ProductEntity("Cortavientos Adidas ",50,"M","https://images-na.ssl-images-amazon.com/images/I/713Y%2BqQdKmL._AC_UY879_.jpg","verde","Sin estrenar","Adidas","Mujer")); 
            product.save(new ProductEntity("Vestido croche Zara ",42,"XS","https://images.vinted.net/thumbs/f800/02_01ef8_gdf9CgsgM6rWmP3Zah5QRi31.jpeg?1604770191-0376fe1a1084027a73ad88e01de72608671d933f","naranja","Como Nuevo","Zara","Mujer")); 
            product.save(new ProductEntity("Polar Ralph Lauren ",50,"S","https://images.vinted.net/thumbs/f800/02_0242c_pmBLiHeDgRxKJHA96PQpcaLP.jpeg?1620198138-9117324c3a9eddc8294ba806776e718210925c9d","blanco","En buen estado","Ralph Lauren","Hombre")); 
            product.save(new ProductEntity("Zapatillas Converse Rosa ",60,"43","https://images.vinted.net/thumbs/f800/03_022ac_veqpxB6tJ3bCd2S7TunaH96s.jpeg?1620197871-d77af8547b38af89a9889ebbb05f3521b36b1cd5","rosa","En buen estado","Converse","Mujer")); 
            product.save(new ProductEntity("Bolso Calvin Klein ",60,"/","https://images.vinted.net/thumbs/f800/02_01992_UV5i5mDazoVpNwgkLGKArVhJ.jpeg?1620197339-bfe8b8e0980c8f908919dc0bed67bef85d708457","negro","En buen estado","Calvin Klein","Mujer")); 
            product.save(new ProductEntity("Chaqueta Chicago Bulls ",90,"S","https://images.vinted.net/thumbs/f800/03_003ff_UUiYop2EBaTgmKB2YU4Sqrji.jpeg?1620195273-c5c3e8292d61c8039d86653a26c9bcaeb809700c","rojo","Sin estrenar","Chicago Bulls","Hombre")); 
            product.save(new ProductEntity("Zapatillas Jordan ",130,"44","https://images.vinted.net/thumbs/f800/03_022dc_TMU4iwjsJAsUmGtJ3GgL2icw.jpeg?1620198747-bdb87e9d47f5329def93f55b4d58ebafa3e6f5ea","caramelo","Sin estrenar","Jordan","Hombre")); 
            product.save(new ProductEntity("Blusa de topos Zara ",18.90,"S","https://images.vinted.net/thumbs/f800/03_00881_kaC6QJTXLLj2H4f94uebuzjZ.jpeg?1620200323-0b4c202aa0a56a357ed03b1a3112e9366b964383","mostaza","En buen estado","Zara","Mujer")); 
            product.save(new ProductEntity("Camiseta Supreme ",55,"XL","https://images.vinted.net/thumbs/f800/01_01e8f_Yr7rEdmvVqjmjsYCYpwn8c4g.jpeg?1619855925-597f53d4066d68e5b05d64786bb4662c647c0751","rojo","Como nuevo","Supreme","Hombre")); 
            product.save(new ProductEntity("Zapatillas Adidas Stan Smith ",44,"38","https://images.vinted.net/thumbs/f800/02_001ca_ZKRaJa5cRBKie3de6P6GA28e.jpeg?1620198312-d8b02972e05db93d18a0a0b1444ec5f9d1bc54bf","blanco","Sin estrenar","Adidas","Mujer")); 
            product.save(new ProductEntity("Vestido Naranja H&M ",23,"S","https://images.vinted.net/thumbs/f800/03_003d1_JHbUHaJn3gKccmQfwXwuuxEn.jpeg?1620198677-2be312914ab375438a7fe9a16a5914654d93be99","naranja","En buen estado","H&M","Mujer")); 

            product.save(new ProductEntity("Cortavientos Adidas ",50,"M","https://images-na.ssl-images-amazon.com/images/I/713Y%2BqQdKmL._AC_UY879_.jpg","verde","Sin estrenar","Adidas","Mujer"));   */
      
        };

    }


}
   

