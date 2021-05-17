package proyect.cema.Web.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import proyect.cema.Repositories.Entities.CategoriaEntity;
import proyect.cema.Repositories.Entities.ProductEntity;
import proyect.cema.Repositories.Entities.ProductoCategoriaEntity;
import proyect.cema.Repositories.Entities.UsuarioEntity;
import proyect.cema.Repositories.Interfaces.CategoriaRepository;
import proyect.cema.Repositories.Interfaces.ProductRepository;
import proyect.cema.Repositories.Interfaces.ProductoCategoriaRepository;
import proyect.cema.Repositories.Interfaces.UsuarioRepository;

@Configuration
public class initDB {
    @Bean
    CommandLineRunner initDataBase(UsuarioRepository usuario, ProductRepository product, CategoriaRepository categoria
    , ProductoCategoriaRepository productoCategoria){
        return args ->{


             usuario.save(new UsuarioEntity("cesargusa22@gmail.com","jajaxdxd","cesargusa","Cesar","Gutierrez","https://media-exp1.licdn.com/dms/image/C5603AQE6G74tLiVRyQ/profile-displayphoto-shrink_200_200/0/1562172815294?e=1620259200&v=beta&t=jBLAKOfxtuBQwR7W3LwA3YmQN0o_jV2WMfW20Ly9bB8","722709600","Zaragoza","España","","Hombre",true));
            usuario.save(new UsuarioEntity("marietelgmail.com","ambel1234","marioguti3","Mario","Gutierrez","https://parma.repubblica.it/images/2012/09/14/141819337-d98f658e-289c-4a0d-8f00-20d8c5063773.jpg","1234456545","Madrid","España","","Hombre",false));
            usuario.save(new UsuarioEntity("marieteloqmail.comerevrerveevv","123","marioambel22","Marirevervreo","Gutierrezveveerv","https://parma.repubblica.it/images/2012/09/14/141819337-d98f658e-289c-4a0d-8f00-20d8c5063773.jpg","123445654veevervrv5","Madrid","España","reuh9eruheuhvuherhvr0uhrvrhvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvferv","Mujer",true));
            usuario.save(new UsuarioEntity("yahira99@gmail.com", "contrasena", "yahira99", "Yahira", "Hernandez", "https://i.vimeocdn.com/portrait/10108864_640x640", "72278212", "Madrid", "España", "Hola me gusta el jamon", "Mujer", true));


             product.save(new ProductEntity("Sudadera Nike",40,"L","https://images.asos-media.com/products/sudadera-azul-marino-con-capucha-club-de-nike-plus/12495764-1-navy?$XXL$&wid=513&fit=constrain","Azul Marino","Como nuevo","Nike","Hombre"));
            product.save(new ProductEntity("Pantalon Stradivarius",23,"M","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/elle-pantalon-negro-barato-stradivarius-c-1559142955.jpg?resize=480:*","Negro","Sin estrenar","Stradivarius","Mujer"));
            product.save(new ProductEntity("Pulsera Hoja",12,"","https://images.vinted.net/thumbs/f800/02_018b3_f86o378nKJ3wHreFGTpAmLmd.jpeg?1620891170-0a2fee3ac48c7e7ecbc3bb4a3df34f886022e348","Plata","Buen estadp","Bonito","Accesorios"));
            product.save(new ProductEntity("Camiseta Snipes",15.35,"M","https://www.snipes.es/dw/image/v2/BDCB_PRD/on/demandware.static/-/Sites-snse-master-eu/default/dwf079653a/1964803_P.jpg?sw=780&sh=780&sm=fit&sfrm=png","Rojo","En buen estado ","Snipes","Hombre"));
            product.save(new ProductEntity("Cazadora North Face",170,"XL","https://http2.mlstatic.com/casaca-chaqueta-mujer-north-face-fibra-800-cintura-D_NQ_NP_800779-MPE27648121921_062018-F.jpg","blanca","Como nuevo","North Face","Hombre"));
            product.save(new ProductEntity("Gorra Cock",14.99,"","https://images.vinted.net/thumbs/f800/03_01efa_LDVYwpnzsqVWMCpaR7cgV6Zi.jpeg?1620854606-bce823b927c7b04e2c7d70874659c92e3e2a0ba4","rojo","Sin estrenar","Goorin Bros","Accesorios"));
            product.save(new ProductEntity("Cortavientos Adidas ",50,"M","https://images-na.ssl-images-amazon.com/images/I/713Y%2BqQdKmL._AC_UY879_.jpg","verde","Sin estrenar","Adidas","Mujer")); 
            product.save(new ProductEntity("Reloj Frederique Constant ",385,"","https://images.vinted.net/thumbs/f800/01_020b7_AHaFSNpxxZm4F37giymt23nR.jpeg?1618259987-eea1e599b05ed98bee30960645d268d2210ab874","marron","Sin estrenar","Frederique Constant","Accesorios")); 
            product.save(new ProductEntity("Vestido croche Zara ",42,"XS","https://images.vinted.net/thumbs/f800/02_01ef8_gdf9CgsgM6rWmP3Zah5QRi31.jpeg?1604770191-0376fe1a1084027a73ad88e01de72608671d933f","naranja","Como Nuevo","Zara","Mujer")); 
            product.save(new ProductEntity("Polar Ralph Lauren ",50,"S","https://images.vinted.net/thumbs/f800/02_0242c_pmBLiHeDgRxKJHA96PQpcaLP.jpeg?1620198138-9117324c3a9eddc8294ba806776e718210925c9d","blanco","En buen estado","Ralph Lauren","Hombre")); 
            product.save(new ProductEntity("Zapatillas Converse Rosa ",60,"43","https://images.vinted.net/thumbs/f800/03_022ac_veqpxB6tJ3bCd2S7TunaH96s.jpeg?1620197871-d77af8547b38af89a9889ebbb05f3521b36b1cd5","rosa","En buen estado","Converse","Mujer")); 
            product.save(new ProductEntity("Bolso Calvin Klein ",60,"/","https://images.vinted.net/thumbs/f800/02_01992_UV5i5mDazoVpNwgkLGKArVhJ.jpeg?1620197339-bfe8b8e0980c8f908919dc0bed67bef85d708457","negro","En buen estado","Calvin Klein","Accesorios")); 
            product.save(new ProductEntity("Gorra Nike ",18,"/","https://images.vinted.net/thumbs/f800/03_01ef5_mNkRQuLuaLof8959MjDJXnoJ.jpeg?1620849095-735f14be4f5f479e716c839cd020229128b4bbef","Amarillo","En buen estado","Nike","Hombre")); 
            product.save(new ProductEntity("Chaqueta Chicago Bulls ",90,"S","https://images.vinted.net/thumbs/f800/03_003ff_UUiYop2EBaTgmKB2YU4Sqrji.jpeg?1620195273-c5c3e8292d61c8039d86653a26c9bcaeb809700c","rojo","Sin estrenar","Chicago Bulls","Hombre")); 
            product.save(new ProductEntity("Zapatillas Jordan ",130,"44","https://images.vinted.net/thumbs/f800/03_022dc_TMU4iwjsJAsUmGtJ3GgL2icw.jpeg?1620198747-bdb87e9d47f5329def93f55b4d58ebafa3e6f5ea","caramelo","Sin estrenar","Jordan","Hombre")); 
            product.save(new ProductEntity("Blusa de topos Zara ",18.90,"S","https://images.vinted.net/thumbs/f800/03_00881_kaC6QJTXLLj2H4f94uebuzjZ.jpeg?1620200323-0b4c202aa0a56a357ed03b1a3112e9366b964383","mostaza","En buen estado","Zara","Mujer")); 
            product.save(new ProductEntity("Gafas RayBan ",13,"","https://images.vinted.net/thumbs/f800/03_00913_TN18wDB3b9Gf5dyX5HAhqsBt.jpeg?1621185654-4e8bb23013616c3c64b4ee1e2d316de15c3065a9","Negro","En buen estado","RayBan","Accesorios")); 
            product.save(new ProductEntity("Camiseta Supreme ",55,"XL","https://images.vinted.net/thumbs/f800/01_01e8f_Yr7rEdmvVqjmjsYCYpwn8c4g.jpeg?1619855925-597f53d4066d68e5b05d64786bb4662c647c0751","rojo","Como nuevo","Supreme","Hombre")); 
            product.save(new ProductEntity("Zapatillas Adidas Stan Smith ",44,"38","https://images.vinted.net/thumbs/f800/02_001ca_ZKRaJa5cRBKie3de6P6GA28e.jpeg?1620198312-d8b02972e05db93d18a0a0b1444ec5f9d1bc54bf","blanco","Sin estrenar","Adidas","Mujer")); 
            product.save(new ProductEntity("Vestido Naranja H&M ",23,"S","https://images.vinted.net/thumbs/f800/03_003d1_JHbUHaJn3gKccmQfwXwuuxEn.jpeg?1620198677-2be312914ab375438a7fe9a16a5914654d93be99","naranja","En buen estado","H&M","Mujer")); 
            product.save(new ProductEntity("Collar Tous ",40,"","https://images.vinted.net/thumbs/f800/01_01232_yiV6SnYRVSKLUoARcuTFf7Pr.jpeg?1620071577-0da737bd31b0a225ce7dfe25cdb8623a1359ff0f","plata","Como nuevo","Tous","Accesorios")); 
            product.save(new ProductEntity("Cortavientos Adidas ",50,"M","https://images-na.ssl-images-amazon.com/images/I/713Y%2BqQdKmL._AC_UY879_.jpg","verde","Sin estrenar","Adidas","Hombre"));  
 
             


            product.save(new ProductEntity("Cortavientos Adidas ",50,"M","https://images-na.ssl-images-amazon.com/images/I/713Y%2BqQdKmL._AC_UY879_.jpg","verde","Sin estrenar","Adidas","Mujer"));  
            
            categoria.save(new CategoriaEntity(1L,"Sudaderas"));
            categoria.save(new CategoriaEntity(2L,"Camisetas"));
            categoria.save(new CategoriaEntity(3L,"Zapatillas"));
            categoria.save(new CategoriaEntity(4L,"Accesorios"));


            productoCategoria.save(new ProductoCategoriaEntity(1L, 1L, 5L));

        };
    

    }


}
   

