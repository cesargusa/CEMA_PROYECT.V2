package proyect.cema.Services.Models;

public class ProductoCategoriaDTO {
    private Long id;
    private Long productoId;
    private Long categoriaId;

    public ProductoCategoriaDTO() {
    }

    public ProductoCategoriaDTO(Long productoId, Long categoriaId) {
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
