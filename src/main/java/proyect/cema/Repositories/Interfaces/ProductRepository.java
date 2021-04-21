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


    @Query(value = "SELECT p " + "FROM Productos p " + "WHERE nombre_producto LIKE %:nombre_producto%")
    Collection<ProductEntity> findByName(
        @Param("nombre_producto") String nombre_producto);
 

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