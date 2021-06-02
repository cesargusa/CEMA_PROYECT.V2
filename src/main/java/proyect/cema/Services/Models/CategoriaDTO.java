package proyect.cema.Services.Models;

public class CategoriaDTO {
    private Long id;
    private String nombre_categoria;
    private String imagen_categoria;
    private String url_categoria;

    public CategoriaDTO() {
    }

   




    public CategoriaDTO (String nombre_categoria, String imagen_categoria) {
 
        this.nombre_categoria = nombre_categoria;
        this.imagen_categoria = imagen_categoria;
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
