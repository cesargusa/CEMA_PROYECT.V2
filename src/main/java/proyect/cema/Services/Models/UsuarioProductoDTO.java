package proyect.cema.Services.Models;



public class UsuarioProductoDTO {
    private Long id;
    private Long usuarioId;
    private Long productoId;
    public UsuarioProductoDTO() {
    }
    public UsuarioProductoDTO(Long usuarioId, Long productoId) {
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
