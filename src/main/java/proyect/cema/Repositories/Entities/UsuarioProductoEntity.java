package proyect.cema.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name = "UsuarioProducto")
@Table(name = "UsuarioProducto")
public class UsuarioProductoEntity {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private Long usuarioId;
    private Long productoId;
    public UsuarioProductoEntity() {
    }
    public UsuarioProductoEntity(Long usuarioId, Long productoId) {
        this.usuarioId = usuarioId;
        this.productoId = productoId;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }
    public Long getProductoId() {
        return productoId;
    }
    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }
    
    
}
