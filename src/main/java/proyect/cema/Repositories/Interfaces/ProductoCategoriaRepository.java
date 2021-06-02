package proyect.cema.Repositories.Interfaces;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import proyect.cema.Repositories.Entities.ProductEntity;
import proyect.cema.Repositories.Entities.ProductoCategoriaEntity;

public interface ProductoCategoriaRepository extends JpaRepository<ProductoCategoriaEntity, Long> {
  
   
    
}
