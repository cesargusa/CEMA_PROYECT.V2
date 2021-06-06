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


           /*  usuario.save(new UsuarioEntity("cesargusa22@gmail.com","cersar","cesargusa","Cesar","Gutierrez","https://media.revistagq.com/photos/5ca5e040f552a1024132ac28/master/w_1200,c_limit/modelos_masculinos_mejor_pagados_2019__10941983.jpg","722709600","Zaragoza","España","Soy Cesar tengo 23 años y me gustaria ser modelo","Hombre",true));
            usuario.save(new UsuarioEntity("oiram@gmail.com","ambel1234","marioguti3","Mario","Gutierrez","https://parma.repubblica.it/images/2012/09/14/141819337-d98f658e-289c-4a0d-8f00-20d8c5063773.jpg","1234456545","Madrid","España","Soy Mario tengo en mi perfil ropa muy exclusiva y economica que puede interesarte","Hombre",true));
            usuario.save(new UsuarioEntity("jacintoq@gmail.com","jacinto","marioambel22","Jacinto","Aranda","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQypmIARGvqviv_DOyibN9WkTafMzftqdsbFA&usqp=CAU","12344565","Madrid","España","Soy Jacinto tengo ropa muy exclusiva y economica en mi perfil","Hombre",true));
            usuario.save(new UsuarioEntity("yahira99@gmail.com", "contrasena", "yahira99", "Yahira", "Hernandez", "https://i.vimeocdn.com/portrait/10108864_640x640", "72278212", "Madrid", "España", "Hola soy Yahira y me gustaria ser modelo", "Mujer", false));
            usuario.save(new UsuarioEntity("rafagarcia@gmail.com", "contrasena", "rafagarcia", "Rafa", "Garcia", "https://www.agenciaglobe.es/wp-content/uploads/2020/06/Agencia-de-Modelos-Globe-Carlos-Arrieta-2-jpg.jpg", "854245", "Canarias", "España", "Soy Rafael vivo en Canarias tengo en mi perfil ropa muy exclusiva y economica que puede interesarte", "Hombre", true));
            usuario.save(new UsuarioEntity("aymericguti@gmail.com", "contrasena", "aymericguti", "Aymeric", "Guti", "https://joseppons.com/formacion/wp-content/uploads/2020/02/Corte-tupe%CC%81.jpg", "884268", "Santander", "España", "Soy Aymeric vivo en Santander tengo en mi perfil ropa muy exclusiva y economica que puede interesarte", "Hombre", true));
            usuario.save(new UsuarioEntity("pedrocortes@gmail.com", "contrasena", "pedrocortes", "Pedro", "Cortes", "https://i.pinimg.com/originals/28/01/2a/28012a9f817ac252bc2d83037f3ba90b.jpg", "236874", "Bilbao", "España", "Soy Pedro vivo actualmente en Bibao tengo en mi perfil ropa muy exclusiva y economica que puede interesarte", "Hombre", true));
            usuario.save(new UsuarioEntity("antoniocampomares@gmail.com", "contrasena", "antoniocampo", "Antonio", "Campo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR654jMUNFPrYW0lJh3rXbPx7HbQ1N6pwd1teWhkn7EQ6A6Lwms-QJ8eO1RKFl1N3C1yto&usqp=CAU", "232896", "Zaragoza", "España", "Soy Antonio de Zaragoza tengo en mi perfil ropa muy exclusiva y economica que puede interesarte", "Hombre", true));
            usuario.save(new UsuarioEntity("macarenaperez@gmail.com", "contrasena", "macaperez", "Macarena", "Perez", "https://www.eltiempo.com/files/article_multimedia/uploads/2019/11/07/5dc434e900e5f.jpeg", "55482", "Valencia", "España", "Hola, soy Maca vivo en Valencia tengo en mi perfil ropa muy exclusiva y economica que puede interesarte", "Mujer", true));
            usuario.save(new UsuarioEntity("isabelgutierrez@gmail.com", "contrasena", "gutierrezisabel", "Isabel", "Gutierrez", "https://i.pinimg.com/originals/41/ff/2c/41ff2c75ae0e5263500c6b916572c1e1.jpg", "53641", "Barcelona", "España", "Bunas soy Isabel tengo 26 años vivo en Barcelona tengo en mi perfil ropa muy exclusiva y economica que puede interesarte", "Mujer", true));
            usuario.save(new UsuarioEntity("patriciarebollo@gmail.com", "contrasena", "patrirebo", "Patricia", "Rebo", "https://i.pinimg.com/originals/41/ff/2c/41ff2c75ae0e5263500c6b916572c1e1.jpg", "869521", "Huesca", "España", "Soy Patricia de Huesca me gustaria ser modelo, tengo en mi perfil ropa muy exclusiva y economica que puede interesarte ", "Mujer", true));
            usuario.save(new UsuarioEntity("teresaaznar@gmail.com", "contrasena", "teresaznar", "Teresa", "Aznar", "https://i.pinimg.com/originals/74/f8/ce/74f8ceea57b1e2bf9b7d36f3a33ddab8.jpg", "412542", "Madrid", "España", "Bunas soy Teresa tengo 24 años soy de Madrid tengo en mi perfil ropa muy exclusiva y economica que puede interesarte", "Mujer", true));
            usuario.save(new UsuarioEntity("miguelclavel@gmail.com", "contrasena", "miguelclavel", "Miguel", "Clavel", "https://2management.org/img/modelos/hombres/david-c/david-c-modelo-img-00.jpg", "857215", "Teruel", "España", "Bunas soy Miguel de Teruel tengo experiencia como modelo ademas tengo en mi perfil ropa muy exclusiva y economica que puede interesarte", "Hombre", true));
            usuario.save(new UsuarioEntity("carmenperal@gmail.com", "contrasena", "carmenperal", "Carmen", "Peral", "https://www.emprendedores.es/wp-content/uploads/2020/11/9-modelos-de-negocio-solidos-para-tu-idea-de-empresa-1024x675-1.jpg", "565895", "Madrid", "España", "Bunas soy Carmen de Madrid me gustaria vender alguna ropa que ya no utilizo", "Mujer", true));
            usuario.save(new UsuarioEntity("veronicagarcia@gmail.com", "contrasena", "verogarcia", "Veronica", "Garcia", "https://modelos.net/wp-content/uploads/2019/02/Primer-plano-jma-modelos.jpg", "7472658", "Huesca", "España", "Bunas soy Vero hay mucha ropa que no utilizo y me gustaria vender", "Mujer", true));
            usuario.save(new UsuarioEntity("simoncoral@gmail.com", "contrasena", "simoncoral", "Simon", "Coral", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYh2IRbaAke36fBAJeg_I6btBF9dWSBpN2B44ruRuqYGO23SrTpMlBt6-7HklLziwFpaY&usqp=CAU", "145987", "Almeria", "España", "Bunas soy Simon vivo en Almeria tengo en mi perfil ropa muy exclusiva y economica que puede interesarte", "Hombre", true));
            usuario.save(new UsuarioEntity("carlosmorales@gmail.com", "contrasena", "carlosmorales", "Carlos", "Morales", "https://media.revistagq.com/photos/5ca5e03ff552a173b332ac22/master/w_1200,c_limit/modelos_masculinos_mejor_pagados_2019__692265935.jpg", "123689", "Cadiz", "España", "Bunas soy Carlos tengo experiencia de Modelo en una agencia de modelos de Cadiz", "Hombre", true));
            usuario.save(new UsuarioEntity("cristianroy@gmail.com", "contrasena", "cristianroy", "Cristian", "Roy", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWgQuMN1qFPLWfbVR8ahW2h25YA6TMr0pa4A&usqp=CAU", "457869", "Malaga", "España", "Bunas soy Cristian de Malaga me gustaria ser modelo", "Hombre", true)); 
            usuario.save(new UsuarioEntity("abeldomin@gmail.com", "contrasena", "cristianroy", "Abel", "Dominguez", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWgQuMN1qFPLWfbVR8ahW2h25YA6TMr0pa4A&usqp=CAU", "4123123", "Sevilla", "España", "Bunas soy Abel soy modelo y me gustaria vender algunas cosas que ya no me pongo", "Hombre", true));  */

            /* usuario.save(new UsuarioEntity("cesargusa22@gmail.com","jajaxdxd","cesargusa","Cesar","Gutierrez","https://media.revistagq.com/photos/5ca5e040f552a1024132ac28/master/w_1200,c_limit/modelos_masculinos_mejor_pagados_2019__10941983.jpg","722709600","Zaragoza","España","Buenos dias","Hombre",true));
            usuario.save(new UsuarioEntity("marietelgmail.com","ambel1234","marioguti3","Mario","Gutierrez","https://parma.repubblica.it/images/2012/09/14/141819337-d98f658e-289c-4a0d-8f00-20d8c5063773.jpg","1234456545","Madrid","España","Buenas tardes","Hombre",true));
            usuario.save(new UsuarioEntity("marieteloqmail.comerevrerveevv","123","marioambel22","Marirevervreo","Gutierrezveveerv","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQypmIARGvqviv_DOyibN9WkTafMzftqdsbFA&usqp=CAU","12344565","Madrid","España","reuh9eruheuhvuherhvr0uhrvrhvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvferv","Hombre",true));
            usuario.save(new UsuarioEntity("yahira99@gmail.com", "contrasena", "yahira99", "Yahira", "Hernandez", "https://i.vimeocdn.com/portrait/10108864_640x640", "72278212", "Madrid", "España", "Hola me gusta el jamon", "Mujer", false));
            usuario.save(new UsuarioEntity("rafagarcia@gmail.com", "contrasena", "rafagarcia", "Rafa", "Garcia", "https://www.agenciaglobe.es/wp-content/uploads/2020/06/Agencia-de-Modelos-Globe-Carlos-Arrieta-2-jpg.jpg", "854245", "Canarias", "España", "Bunas soy Rafa", "Hombre", true));
            usuario.save(new UsuarioEntity("aymericguti@gmail.com", "contrasena", "aymericguti", "Aymeric", "Guti", "https://joseppons.com/formacion/wp-content/uploads/2020/02/Corte-tupe%CC%81.jpg", "884268", "Santander", "España", "Bunas soy Aymeric", "Hombre", true));
            usuario.save(new UsuarioEntity("pedrocortes@gmail.com", "contrasena", "pedrocortes", "Pedro", "Cortes", "https://i.pinimg.com/originals/28/01/2a/28012a9f817ac252bc2d83037f3ba90b.jpg", "236874", "Bilbao", "España", "Bunas soy Pedro", "Hombre", true));
            usuario.save(new UsuarioEntity("antoniocampomares@gmail.com", "contrasena", "antoniocampo", "Antonio", "Campo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR654jMUNFPrYW0lJh3rXbPx7HbQ1N6pwd1teWhkn7EQ6A6Lwms-QJ8eO1RKFl1N3C1yto&usqp=CAU", "232896", "Zaragoza", "España", "Bunas soy Antonio", "Hombre", true));
            usuario.save(new UsuarioEntity("macarenaperez@gmail.com", "contrasena", "macaperez", "Macarena", "Perez", "https://www.eltiempo.com/files/article_multimedia/uploads/2019/11/07/5dc434e900e5f.jpeg", "55482", "Valencia", "España", "Bunas soy Maca", "Mujer", true));
            usuario.save(new UsuarioEntity("isabelgutierrez@gmail.com", "contrasena", "gutierrezisabel", "Isabel", "Gutierrez", "https://i.pinimg.com/originals/41/ff/2c/41ff2c75ae0e5263500c6b916572c1e1.jpg", "53641", "Barcelona", "España", "Bunas soy Isabel", "Mujer", true));
            usuario.save(new UsuarioEntity("patriciarebollo@gmail.com", "contrasena", "patrirebo", "Patricia", "Rebo", "https://i.pinimg.com/originals/41/ff/2c/41ff2c75ae0e5263500c6b916572c1e1.jpg", "869521", "Barcelona", "España", "Bunas soy Isabel", "Mujer", true));
            usuario.save(new UsuarioEntity("teresaaznar@gmail.com", "contrasena", "teresaznar", "Teresa", "Aznar", "https://i.pinimg.com/originals/74/f8/ce/74f8ceea57b1e2bf9b7d36f3a33ddab8.jpg", "412542", "Madrid", "España", "Bunas soy Teresa", "Mujer", true));
            usuario.save(new UsuarioEntity("miguelclavel@gmail.com", "contrasena", "miguelclavel", "Miguel", "Clavel", "https://2management.org/img/modelos/hombres/david-c/david-c-modelo-img-00.jpg", "857215", "Teruel", "España", "Bunas soy Miguelito", "Hombre", true));
            usuario.save(new UsuarioEntity("carmenperal@gmail.com", "contrasena", "carmenperal", "Carmen", "Peral", "https://www.emprendedores.es/wp-content/uploads/2020/11/9-modelos-de-negocio-solidos-para-tu-idea-de-empresa-1024x675-1.jpg", "565895", "Madrid", "España", "Bunas soy Carmen", "Mujer", true));
            usuario.save(new UsuarioEntity("veronicagarcia@gmail.com", "contrasena", "verogarcia", "Veronica", "Garcia", "https://modelos.net/wp-content/uploads/2019/02/Primer-plano-jma-modelos.jpg", "7472658", "Huesca", "España", "Bunas soy Vero", "Mujer", true));
            usuario.save(new UsuarioEntity("simoncoral@gmail.com", "contrasena", "simoncoral", "Simon", "Coral", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYh2IRbaAke36fBAJeg_I6btBF9dWSBpN2B44ruRuqYGO23SrTpMlBt6-7HklLziwFpaY&usqp=CAU", "145987", "Almeria", "España", "Bunas soy Simon", "Hombre", true));
            usuario.save(new UsuarioEntity("carlosmorales@gmail.com", "contrasena", "carlosmorales", "Carlos", "Morales", "https://media.revistagq.com/photos/5ca5e03ff552a173b332ac22/master/w_1200,c_limit/modelos_masculinos_mejor_pagados_2019__692265935.jpg", "123689", "Cadiz", "España", "Bunas soy Carlos", "Hombre", true));
            usuario.save(new UsuarioEntity("cristianroy@gmail.com", "contrasena", "cristianroy", "Cristian", "Roy", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWgQuMN1qFPLWfbVR8ahW2h25YA6TMr0pa4A&usqp=CAU", "457869", "Malaga", "España", "Bunas soy Cristian", "Hombre", true)); 
            usuario.save(new UsuarioEntity("cristianroy@gmail.com", "contrasena", "cristianroy", "Cristian", "Roy", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWgQuMN1qFPLWfbVR8ahW2h25YA6TMr0pa4A&usqp=CAU", "457869", "New York", "Estados Unidos", "Bunas soy Cristian", "Hombre", true));  */

 

           /*  product.save(new ProductEntity("Sudadera Nike",40,"L","https://images.asos-media.com/products/sudadera-azul-marino-con-capucha-club-de-nike-plus/12495764-1-navy?$XXL$&wid=513&fit=constrain","Azul Marino","Usado","Nike","Hombre"));
            product.save(new ProductEntity("Pantalon Stradivarius",23,"M","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/elle-pantalon-negro-barato-stradivarius-c-1559142955.jpg?resize=480:*","Negro","Nuevo","Stradivarius","Mujer"));
            product.save(new ProductEntity("Pulsera Hoja",12,"","https://images.vinted.net/thumbs/f800/02_018b3_f86o378nKJ3wHreFGTpAmLmd.jpeg?1620891170-0a2fee3ac48c7e7ecbc3bb4a3df34f886022e348","Plata","Seminuevo","Bonito","Accesorios"));
            product.save(new ProductEntity("Camiseta Snipes",15.35,"M","https://www.snipes.es/dw/image/v2/BDCB_PRD/on/demandware.static/-/Sites-snse-master-eu/default/dwf079653a/1964803_P.jpg?sw=780&sh=780&sm=fit&sfrm=png","Rojo","Usado","Snipes","Hombre"));
            product.save(new ProductEntity("Cazadora North Face",170,"XL","https://http2.mlstatic.com/casaca-chaqueta-mujer-north-face-fibra-800-cintura-D_NQ_NP_800779-MPE27648121921_062018-F.jpg","Blanco","Seminuevo","North Face","Hombre"));
            product.save(new ProductEntity("Gorra Cock",14.99,"","https://images.vinted.net/thumbs/f800/03_01efa_LDVYwpnzsqVWMCpaR7cgV6Zi.jpeg?1620854606-bce823b927c7b04e2c7d70874659c92e3e2a0ba4","Rojo","Usado","Goorin Bros","Accesorios"));
            product.save(new ProductEntity("Cortavientos Adidas ",50,"M","https://images-na.ssl-images-amazon.com/images/I/713Y%2BqQdKmL._AC_UY879_.jpg","verde","Sin estrenar","Adidas","Mujer")); 
            product.save(new ProductEntity("Reloj Frederique Constant ",385,"","https://images.vinted.net/thumbs/f800/01_020b7_AHaFSNpxxZm4F37giymt23nR.jpeg?1618259987-eea1e599b05ed98bee30960645d268d2210ab874","Marron","Nuevo","Frederique Constant","Accesorios")); 
             product.save(new ProductEntity("Vestido croche Zara ",42,"XS","https://images.vinted.net/thumbs/f800/02_01ef8_gdf9CgsgM6rWmP3Zah5QRi31.jpeg?1604770191-0376fe1a1084027a73ad88e01de72608671d933f","Naranja","Seminuevo","Zara","Mujer")); 
            product.save(new ProductEntity("Polar Ralph Lauren ",50,"S","https://images.vinted.net/thumbs/f800/02_0242c_pmBLiHeDgRxKJHA96PQpcaLP.jpeg?1620198138-9117324c3a9eddc8294ba806776e718210925c9d","Blanco","Muy Usado","Ralph Lauren","Hombre")); 
            product.save(new ProductEntity("Zapatillas Converse Rosa ",60,"43","https://images.vinted.net/thumbs/f800/03_022ac_veqpxB6tJ3bCd2S7TunaH96s.jpeg?1620197871-d77af8547b38af89a9889ebbb05f3521b36b1cd5","Rosa","Nuevo","Converse","Mujer")); 
            product.save(new ProductEntity("Bolso Calvin Klein ",60,"/","https://images.vinted.net/thumbs/f800/02_01992_UV5i5mDazoVpNwgkLGKArVhJ.jpeg?1620197339-bfe8b8e0980c8f908919dc0bed67bef85d708457","Negro","Seminuevo","Calvin Klein","Accesorios")); 
            product.save(new ProductEntity("Gorra Nike ",18,"/","https://images.vinted.net/thumbs/f800/03_01ef5_mNkRQuLuaLof8959MjDJXnoJ.jpeg?1620849095-735f14be4f5f479e716c839cd020229128b4bbef","Amarillo","Muy Usado","Nike","Hombre")); 
            product.save(new ProductEntity("Chaqueta Chicago Bulls ",90,"S","https://images.vinted.net/thumbs/f800/03_003ff_UUiYop2EBaTgmKB2YU4Sqrji.jpeg?1620195273-c5c3e8292d61c8039d86653a26c9bcaeb809700c","Rojo","Nuevo","Chicago Bulls","Hombre")); 
            product.save(new ProductEntity("Zapatillas Jordan ",130,"44","https://images.vinted.net/thumbs/f800/03_022dc_TMU4iwjsJAsUmGtJ3GgL2icw.jpeg?1620198747-bdb87e9d47f5329def93f55b4d58ebafa3e6f5ea","Caramelo","Muy Usado","Jordan","Hombre")); 
            product.save(new ProductEntity("Blusa de topos Zara ",18.90,"S","https://images.vinted.net/thumbs/f800/03_00881_kaC6QJTXLLj2H4f94uebuzjZ.jpeg?1620200323-0b4c202aa0a56a357ed03b1a3112e9366b964383","Mostaza","Usado","Zara","Mujer")); 
            product.save(new ProductEntity("Gafas RayBan ",13,"","https://images.vinted.net/thumbs/f800/03_00913_TN18wDB3b9Gf5dyX5HAhqsBt.jpeg?1621185654-4e8bb23013616c3c64b4ee1e2d316de15c3065a9","Negro","Seminuevo","RayBan","Accesorios")); 
            product.save(new ProductEntity("Zapatillas Adidas Stan Smith ",44,"38","https://images.vinted.net/thumbs/f800/02_001ca_ZKRaJa5cRBKie3de6P6GA28e.jpeg?1620198312-d8b02972e05db93d18a0a0b1444ec5f9d1bc54bf","Blanco","Nuevo","Adidas","Mujer")); 
            product.save(new ProductEntity("Vestido Naranja H&M ",23,"S","https://images.vinted.net/thumbs/f800/03_003d1_JHbUHaJn3gKccmQfwXwuuxEn.jpeg?1620198677-2be312914ab375438a7fe9a16a5914654d93be99","Naranja","Muy Usado","H&M","Mujer")); 
            product.save(new ProductEntity("Collar Tous ",40,"","https://images.vinted.net/thumbs/f800/01_01232_yiV6SnYRVSKLUoARcuTFf7Pr.jpeg?1620071577-0da737bd31b0a225ce7dfe25cdb8623a1359ff0f","Plata","Muy Usado","Tous","Accesorios")); 
            product.save(new ProductEntity("Cortavientos Adidas ",50,"M","https://images-na.ssl-images-amazon.com/images/I/713Y%2BqQdKmL._AC_UY879_.jpg","Verde","Sin estrenar","Adidas","Hombre"));   */

/* categoria.save(new CategoriaEntity("Mujeres","https://img.ltwebstatic.com/images3_pi/2021/04/01/1617245949e0b1217bed1bc05c4793b776d582c880_thumbnail_600x.webp"));
     categoria.save(new CategoriaEntity("Hombres","https://img.ltwebstatic.com/images3_pi/2021/03/26/16167308995815f2d1e37e211312bb277a0eaf8c00_thumbnail_600x.webp"));  
    categoria.save(new CategoriaEntity("Sudaderas","https://img.ltwebstatic.com/images3_pi/2020/12/22/1608617143339de2ec72e37485120b68fb618ffcc7_thumbnail_600x.webp"));
    categoria.save(new CategoriaEntity("Camisetas","https://img.ltwebstatic.com/images3_pi/2019/10/11/15707838107f3d39d193931dfa2cea95dbec0200b8_thumbnail_600x.webp"));
     categoria.save(new CategoriaEntity("Abrigos","https://img.ltwebstatic.com/images3_pi/2020/11/09/1604888212bf8d0077ab67f2ae94c04d11f71b1819_thumbnail_600x.webp"));
     categoria.save(new CategoriaEntity("Bañadores","https://img.ltwebstatic.com/images3_pi/2021/01/13/1610523880d4c7f27652fea3d31fa3e82a1222139f_thumbnail_600x.webp"));
categoria.save(new CategoriaEntity("Calcetines","https://img.ltwebstatic.com/images3_pi/2021/05/14/1620980706487e1d64398515cf88973bb70bd2a62a_thumbnail_600x.webp"));
    categoria.save(new CategoriaEntity("Zapatillas","https://img.ltwebstatic.com/images3_pi/2021/04/19/1618810391236a16fbd841b3d55b74cf749d2b13fb_thumbnail_600x.webp"));
     categoria.save(new CategoriaEntity("Accesorios","https://img.ltwebstatic.com/images3_pi/2020/08/06/159668543510dbd73504c030fa50486d3c4e0b74c7_thumbnail_600x.webp")); 
   categoria.save(new CategoriaEntity("Pantalones","https://img.ltwebstatic.com/images3_pi/2020/12/03/1606972375e1540d7b31f283215cf43fc5af4fd8cc_thumbnail_600x.webp")); 
         categoria.save(new CategoriaEntity("Vestidos","https://img.ltwebstatic.com/images3_pi/2021/02/23/16140507146167007569ce56098a5f2c9c66fa80b1_thumbnail_600x.webp")); 
         categoria.save(new CategoriaEntity("Nike","https://logos-marcas.com/wp-content/uploads/2020/04/Nike-Emblema.jpg")); 
          categoria.save(new CategoriaEntity("Stradivarius","https://logos-marcas.com/wp-content/uploads/2020/11/Stradivarius-Logo-2012-presente.jpg")); 
          categoria.save(new CategoriaEntity("Adidas","https://1000marcas.net/wp-content/uploads/2019/11/Adidas-logo.jpg")); 
          categoria.save(new CategoriaEntity("Calvin Klein","https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/CK_Calvin_Klein_logo.svg/821px-CK_Calvin_Klein_logo.svg.png"));
          categoria.save(new CategoriaEntity("Tous","https://www.feelingdaperfume.com/wp-content/uploads/2020/02/Tous.png"));  */



          /*   productoCategoria.save(new ProductoCategoriaEntity(1L, 3L)); 
            productoCategoria.save(new ProductoCategoriaEntity(1L, 13L)); 
            productoCategoria.save(new ProductoCategoriaEntity(1L, 2L));  
            productoCategoria.save(new ProductoCategoriaEntity(2L, 10L)); 
            productoCategoria.save(new ProductoCategoriaEntity(2L, 1L)); 
            productoCategoria.save(new ProductoCategoriaEntity(2L, 12L)); 
            productoCategoria.save(new ProductoCategoriaEntity(3L, 9L));
            productoCategoria.save(new ProductoCategoriaEntity(3L, 1L)); 
            productoCategoria.save(new ProductoCategoriaEntity(4L, 4L));
            productoCategoria.save(new ProductoCategoriaEntity(4L, 2L));  
            productoCategoria.save(new ProductoCategoriaEntity(5L, 5L)); 
            productoCategoria.save(new ProductoCategoriaEntity(5L, 2L)); 
            productoCategoria.save(new ProductoCategoriaEntity(6L, 9L)); 
            productoCategoria.save(new ProductoCategoriaEntity(6L, 2L));
            productoCategoria.save(new ProductoCategoriaEntity(7L, 3L));
            productoCategoria.save(new ProductoCategoriaEntity(7L, 1L));
            productoCategoria.save(new ProductoCategoriaEntity(7L, 14L));
            productoCategoria.save(new ProductoCategoriaEntity(8L, 9L));
            productoCategoria.save(new ProductoCategoriaEntity(8L, 2L));
            productoCategoria.save(new ProductoCategoriaEntity(9L, 1L));
            productoCategoria.save(new ProductoCategoriaEntity(9L, 11L));
            productoCategoria.save(new ProductoCategoriaEntity(10L, 2L));
            productoCategoria.save(new ProductoCategoriaEntity(10L, 4L));
            productoCategoria.save(new ProductoCategoriaEntity(11L, 1L));
            productoCategoria.save(new ProductoCategoriaEntity(11L, 8L));
            productoCategoria.save(new ProductoCategoriaEntity(12L, 1L));
            productoCategoria.save(new ProductoCategoriaEntity(12L, 9L));
            productoCategoria.save(new ProductoCategoriaEntity(12L, 15L));
            productoCategoria.save(new ProductoCategoriaEntity(13L, 12L));
            productoCategoria.save(new ProductoCategoriaEntity(13L, 2L));
            productoCategoria.save(new ProductoCategoriaEntity(13L, 9L));
            productoCategoria.save(new ProductoCategoriaEntity(14L, 3L));
            productoCategoria.save(new ProductoCategoriaEntity(14L, 2L));
            productoCategoria.save(new ProductoCategoriaEntity(15L, 8L));
            productoCategoria.save(new ProductoCategoriaEntity(15L, 2L));
            productoCategoria.save(new ProductoCategoriaEntity(15L, 12L));
            productoCategoria.save(new ProductoCategoriaEntity(16L, 4L));
            productoCategoria.save(new ProductoCategoriaEntity(16L, 1L));
            productoCategoria.save(new ProductoCategoriaEntity(17L, 9L));
            productoCategoria.save(new ProductoCategoriaEntity(17L, 1L));
            productoCategoria.save(new ProductoCategoriaEntity(19L, 8L));
            productoCategoria.save(new ProductoCategoriaEntity(19L, 2L));
            productoCategoria.save(new ProductoCategoriaEntity(19L, 2L));
            productoCategoria.save(new ProductoCategoriaEntity(19L, 14L));
            productoCategoria.save(new ProductoCategoriaEntity(20L, 1L));
            productoCategoria.save(new ProductoCategoriaEntity(20L, 11L));
            productoCategoria.save(new ProductoCategoriaEntity(21L, 1L));
            productoCategoria.save(new ProductoCategoriaEntity(21L, 9L));
            productoCategoria.save(new ProductoCategoriaEntity(21L, 16L));
            productoCategoria.save(new ProductoCategoriaEntity(22L, 2L));
            productoCategoria.save(new ProductoCategoriaEntity(22L, 3L));
            productoCategoria.save(new ProductoCategoriaEntity(22L, 14L));


 */


      

  
 
        };
    

    }


}
   

