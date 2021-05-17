package proyect.cema.Services.Models;

public class CategoriaDTO {
    private Long id;
    private String nombre_categoria;

    public CategoriaDTO() {
    }

    public CategoriaDTO(Long id, String nombre_categoria) {
        this.id = id;
        this.nombre_categoria = nombre_categoria;
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
