package proyect.cema.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "ProductoCategoria")
@Table(name = "ProductoCategoria")

public class ProductoCategoriaEntity {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private Long productoId;
    private Long categoriaId;

    public ProductoCategoriaEntity() {
    }

    public ProductoCategoriaEntity(Long id, Long productoId, Long categoriaId) {
        this.id = id;
        this.productoId = productoId;
        this.categoriaId = categoriaId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public Long getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Long categoriaId) {
        this.categoriaId = categoriaId;
    }
}