package proyect.cema.Services.Models;


public class ProductDTO {
    private Long id;
    private String nombre_producto;
    private double precio;
    private String talla;
    private String imagenes;
    private String color;
    private String estado;
    private String marca;
    private String sexo;
   
   
    public ProductDTO() { }


   public ProductDTO(String nombre_producto, double precio, String talla, String imagenes, String color, String estado,
           String marca, String sexo) {
       this.nombre_producto = nombre_producto;
       this.precio = precio;
       this.talla = talla;
       this.imagenes = imagenes;
       this.color = color;
       this.estado = estado;
       this.marca = marca;
       this.sexo = sexo;
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





public double getPrecio() {
    return precio;
}


public void setPrecio(double precio) {
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


public String getSexo() {
    return sexo;
}


public void setSexo(String sexo) {
    this.sexo = sexo;
}



    

}