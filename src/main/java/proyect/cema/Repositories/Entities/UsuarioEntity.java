package proyect.cema.Repositories.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Usuarios")
@Table(name = "Usuarios")
public class UsuarioEntity {

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    
    @Column(name ="Email", unique = true, nullable = false,length = 50)
    private String email;
    @Column(name ="Contraseña", nullable = false, length = 10)
    private String contrasena;
    @Column(name ="Nombre", nullable = false, length = 50)
    private String nombre;
    private String apellido;
    private String imagen;
    private String telefono;
    private String ciudad;
    private String pais;
    private String descripcion;

    public UsuarioEntity() {
        
    }

    public UsuarioEntity(String email, String contrasena, String nombre, String apellido, String imagen,String telefono, String ciudad,
            String pais, String descripcion) {
        this.email = email;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.imagen=imagen;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.pais = pais;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
