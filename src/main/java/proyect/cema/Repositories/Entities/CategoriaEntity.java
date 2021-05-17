package proyect.cema.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Categoria")
@Table(name = "Categoria")
public class CategoriaEntity {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String nombre_categoria;

    
    public CategoriaEntity(Long id, String nombre_categoria) {
        this.id = id;
        this.nombre_categoria = nombre_categoria;
    }
    public CategoriaEntity() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre_categoria() {
        return nombre_categoria;
    }
    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    
}
