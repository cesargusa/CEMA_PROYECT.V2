package proyect.cema.Repositories.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import proyect.cema.Repositories.Entities.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Long>{
    
}
