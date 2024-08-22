package Usuario;

import java.util.Date;

public class UsuarioNormal extends Usuario {

    public UsuarioNormal(String nombreUsuario, String mail, String contrasena, String nombre, String apellido, Date fechaNacimiento) {
        super(nombreUsuario, mail, contrasena, nombre, apellido, fechaNacimiento, "normal");
    }
}
