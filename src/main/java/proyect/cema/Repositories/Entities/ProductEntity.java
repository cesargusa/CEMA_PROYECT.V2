package proyect.cema.Repositories.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Productos")
@Table(name = "Productos")

public class ProductEntity {
    
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String nombre_producto;
    private int precio;
    private String talla;
    private String imagenes;
    private String color;
    private String estado;
    private String marca;
    
    
    public ProductEntity() { }

    public ProductEntity(String nombre_producto, int precio, String talla, String imagenes, String color, String estado,
            String marca) {
        this.nombre_producto = nombre_producto;
        this.precio = precio;
        this.talla = talla;
        this.imagenes = imagenes;
        this.color = color;
        this.estado = estado;
        this.marca = marca;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNombre_producto() {
        return nombre_producto;
    }


    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }


    public int getPrecio() {
        return precio;
    }


    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public String getTalla() {
        return talla;
    }


    public void setTalla(String talla) {
        this.talla = talla;
    }


    public String getImagenes() {
        return imagenes;
    }


    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

}
