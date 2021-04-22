package proyect.cema.Repositories.Interfaces;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import proyect.cema.Repositories.Entities.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Long>{
    
    
    @Query(value = "SELECT p " + "FROM Usuarios p " + "WHERE id = :id ")
    Optional<UsuarioEntity> findById(
        @Param("id") Long id);


   /*  @Query(value = "SELECT p " + "FROM Usuarios p " + " WHERE nombre_producto LIKE %:nombre_producto% OR precio = :precio OR talla = :talla OR marca = :marca")
    Collection<UsuarioEntity> findByName(
        @Param("nombre_producto") String nombre_producto, @Param("precio") Long precio,@Param("talla") String talla, @Param("marca") String marca);
         */

   
    
/* 
    @Query(value = "SELECT p " + "FROM Productos p " + "WHERE talla = :talla")
            


    @Query(value = "SELECT p " + "FROM Productos p " + "WHERE marca = :marca")
              */
}
