package Usuario;

import java.util.Date;

public abstract class Usuario {

    private String nombreUsuario;
    private String mail;
    private String contrasena;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
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


}
