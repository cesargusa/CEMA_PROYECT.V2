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
    private String imagen_categoria;
    private String url_categoria;

    
    
   
    public CategoriaEntity(String nombre_categoria, String imagen_categoria) {
    
        this.nombre_categoria = nombre_categoria;
        this.imagen_categoria = imagen_categoria;
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
    public String getImagen_categoria() {
        return imagen_categoria;
    }
    public void setImagen_categoria(String imagen_categoria) {
        this.imagen_categoria = imagen_categoria;
    }
    public String getUrl_categoria() {
        return url_categoria;
    }
    public void setUrl_categoria(String url_categoria) {
        this.url_categoria = "/categorias/"+nombre_categoria;
    }

    
}
