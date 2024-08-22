package Usuario;

import java.util.Date;

public class UsuarioAdmin extends Usuario {
    public UsuarioAdmin(String nombreUsuario, String mail, String contrasena, String nombre, String apellido, Date fechaNacimiento) {
        super(nombreUsuario, mail, contrasena, nombre, apellido, fechaNacimiento, "admin");
    }
}
