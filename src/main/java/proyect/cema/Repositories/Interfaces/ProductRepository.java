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

/*         OR precio = :precio OR talla = :talla OR marca = :marca"
 */        
        @Query(value = "SELECT p " 
        + "FROM Productos p "
        + "WHERE (:nombre_producto = '' OR nombre_producto LIKE %:nombre_producto%) "+
        " AND (:marca = '' OR marca LIKE %:marca%) " +
        " AND (:talla = '' OR talla =:talla)")
        Collection<ProductEntity> findByName(
        @Param("nombre_producto") String nombre_producto,
        @Param("marca") String marca,
        @Param("talla") String talla);
      
      /*   @Query(value = "SELECT p " 
        + "FROM Productos p "
        + " WHERE precio =:precio")
        Collection<ProductEntity> findByPrecio(
        @Param("precio")double precio);

 */
 /*     @Query(value = "SELECT p " + "FROM Productos p" + "WHERE precio = :precio")
        Collection<ProductEntity> findByPrice(
            @Param("precio") Long precio);
    

    @Query(value = "SELECT p " + "FROM Productos p" + "WHERE talla = :talla")
            Collection<ProductEntity> findByTalla(
                @Param("talla") String talla);


    @Query(value = "SELECT p " + "FROM Productos p" + "WHERE marca = :marca")
             Collection<ProductEntity> findByMarca(
                    @Param("marca") String marca); */
}