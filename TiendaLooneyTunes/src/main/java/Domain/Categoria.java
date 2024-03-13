package Domain;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
@Data
@Entity
@Table(name = "categoria" )
public class Categoria implements Serializable { //serializacion porque se va almacenar ciertos datos en el disco
    private static final long serialVersionUID = 1L; //para poder hacer el ciclo de la sumatoria de la categoria.
    @Id //id categoria es la llave de la tabla categoria. 
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Los valores generados que estrategia usan, identico a la BD 
    @Column(name = "id_permisos") //decir cual es el nombre en la base de datos. Se hace la asociación 
    private long idpermisos;
    private boolean acceder_ubicacion;
    private String rutaImagen;
    private boolean activo;
    private boolean telefono;
    private boolean mensaje_text_whatsapp;
    public Categoria() {
    }
    public Categoria(boolean acceder_ubicacion, boolean activo, boolean telefono, boolean mensaje_text_whatsapp) {
        this.acceder_ubicacion = acceder_ubicacion;
        this.activo = activo;
        this.telefono = telefono;
        this.mensaje_text_whatsapp = mensaje_text_whatsapp;
    }
 

}