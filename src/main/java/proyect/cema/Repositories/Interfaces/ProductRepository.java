package proyect.cema.Repositories.Interfaces;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import proyect.cema.Repositories.Entities.ProductEntity;
import proyect.cema.Repositories.Entities.UsuarioEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,Long>{
    

    @Query(value = "SELECT p " + "FROM Products p " + "WHERE id = :id ")
    Optional<ProductEntity> findById(
        @Param("id") Long id);


    @Query(value = "SELECT p " + "FROM Products p" + "WHERE nombre_producto = :nombre_producto")
    Collection<ProductEntity> findByName(
        @Param("nombre_producto") String nombre_producto);


     @Query(value = "SELECT p " + "FROM Products p" + "WHERE precio = :precio")
        Collection<ProductEntity> findByPrice(
            @Param("precio") Long precio);
    

    @Query(value = "SELECT p " + "FROM Products p" + "WHERE talla = :talla")
            Collection<ProductEntity> findByTalla(
                @Param("talla") String talla);


    @Query(value = "SELECT p " + "FROM Products p" + "WHERE marca = :marca")
             Collection<ProductEntity> findByMarca(
                    @Param("marca") String marca);
}