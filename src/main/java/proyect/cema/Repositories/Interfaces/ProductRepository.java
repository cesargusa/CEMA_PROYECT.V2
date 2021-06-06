package proyect.cema.Repositories.Interfaces;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import proyect.cema.Repositories.Entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,Long>{
    

    @Query(value = "SELECT p " + "FROM Productos p " + "WHERE id = :id ")
    Optional<ProductEntity> findById(
        @Param("id") Long id);


        @Query(value = "SELECT p " 
        + "FROM Productos p "
        + "WHERE (:nombre_producto = '' OR nombre_producto LIKE %:nombre_producto%) "+
        " AND (:marca = '' OR marca LIKE %:marca%) " +
        " AND (:talla = '' OR talla =:talla)"+
        " AND (:sexo = '' OR sexo LIKE %:sexo%)" +
        " AND (:estado = '' OR estado LIKE %:estado%)"+
        " AND (:color = '' OR color LIKE %:color%)" )
        Collection<ProductEntity> findByName(
        @Param("nombre_producto") String nombre_producto,
        @Param("marca") String marca,
        @Param("talla") String talla,
        @Param("sexo") String sexo,
        @Param("estado") String estado,
        @Param("color") String color);


        @Query(value = "SELECT p FROM ProductoCategoria pc"
        +" INNER join Productos p on p.id = pc.productoId"
        +" INNER join Categoria c on c.id = pc.categoriaId"
        +" WHERE c.nombre_categoria =:nombre_categoria")
        Collection<ProductEntity> FindByCategory(@Param("nombre_categoria") String nombre_categoria);

        @Query(value = "SELECT p FROM Productos p"
        +" INNER join UsuarioProducto up on p.id = up.productoId"
        +" INNER join Usuarios u on u.id = up.usuarioId"
        +" WHERE u.id =:id")
        Collection<ProductEntity> UsuarioProducto(@Param("id") Long id);

        @Query(value = "SELECT p "+" FROM Productos p "+ " ORDER BY precio DESC")
        Collection<ProductEntity> orderPriceDESC();

        @Query(value = "SELECT p "+" FROM Productos p "+ " ORDER BY precio ASC")
        Collection<ProductEntity> orderPriceASC();

        

     
       
}