package Usuario;

import java.util.Date;

import static Usuario.FactoriaUsuario.CrearUsuarioAdmin;
import static Usuario.FactoriaUsuario.CrearUsuarioNormal;

public class ControladorUsuario {

    public static void registrarUsuario(String nombreUsuario, String mail, String contrasena, String nombre, String apellido, Date fechaNacimiento){
        CrearUsuarioNormal( nombreUsuario,  mail,  contrasena,  nombre,  apellido,  fechaNacimiento);
    }

    public static void registrarAdministrador(String nombreUsuario, String mail, String contrasena, String nombre, String apellido, Date fechaNacimiento){
        CrearUsuarioAdmin( nombreUsuario,  mail,  contrasena,  nombre,  apellido,  fechaNacimiento);
    }

    public static void logearse(String credencial, String contrasena){

        if (credencial.contains("@")){
            Logeado.LogearMail( credencial,  contrasena);
        }
        else{
            Logeado.LogearUsuario( credencial,  contrasena);
        }

    }
}
