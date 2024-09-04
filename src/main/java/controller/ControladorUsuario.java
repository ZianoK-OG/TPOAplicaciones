package controller;

import service.Logeado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import static model.FactoriaUsuario.CrearUsuarioAdmin;
import static model.FactoriaUsuario.CrearUsuarioNormal;


@RestController
@RequestMapping("/api/usuario")
public class ControladorUsuario {

    @GetMapping("/normal")
    public static void registrarUsuario(String nombreUsuario, String mail, String contrasena, String nombre, String apellido, Date fechaNacimiento){
        CrearUsuarioNormal( nombreUsuario,  mail,  contrasena,  nombre,  apellido,  fechaNacimiento);
    }

    @GetMapping("/admin")
    public static void registrarAdministrador(String nombreUsuario, String mail, String contrasena, String nombre, String apellido, Date fechaNacimiento){
        CrearUsuarioAdmin( nombreUsuario,  mail,  contrasena,  nombre,  apellido,  fechaNacimiento);
    }

    @GetMapping("/{id}")
    public static void logearse(String credencial, String contrasena){

        if (credencial.contains("@")){
            Logeado.LogearMail( credencial,  contrasena);
        }
        else{
            Logeado.LogearUsuario( credencial,  contrasena);
        }

    }
}
