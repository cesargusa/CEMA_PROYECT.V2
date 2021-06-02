package proyect.cema.Repositories.Interfaces;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import proyect.cema.Repositories.Entities.CategoriaEntity;

public interface CategoriaRepository extends JpaRepository<CategoriaEntity,Long>{
    @Query(value = " SELECT c FROM Categoria c")
    Collection<CategoriaEntity> listCategorias();
}
