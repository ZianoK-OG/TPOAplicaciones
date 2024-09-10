package model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_usuario", discriminatorType = DiscriminatorType.STRING)
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombreUsuario;
    @Column(nullable = false, unique = true)
    private String mail;
    @Column(nullable = false)
    private String contrasena;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    @Column(nullable = false)
    private String tipoUsuario;


    public Usuario(String nombreUsuario, String mail, String contrasena,
                   String nombre, String apellido, Date fechaNacimiento,
                   String tipoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.mail = mail;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoUsuario = tipoUsuario;

    }

    public Usuario() {

    }

    // Getter para nombreUsuario
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    // Getter para mail
    public String getMail() {
        return mail;
    }

    // Getter para contrasena
    public String getContrasena() {
        return contrasena;
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Getter para apellido
    public String getApellido() {
        return apellido;
    }

    // Getter para fechaNacimiento
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    // Getter para tipoUsuario
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    // Getter para id
    public long getId() {
        return id;
    }
}
