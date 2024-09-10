package service;

import model.Usuario;
import model.UsuarioAdmin;
import model.UsuarioNormal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UsuarioRepository;

import java.util.Date;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioNormal crearCliente(String nombreUsuario, String mail, String contrasena,
                                      String nombre, String apellido, Date fechaNacimiento
    ) {
        UsuarioNormal cliente = new UsuarioNormal(nombreUsuario, mail, contrasena, nombre, apellido, fechaNacimiento);
        return (UsuarioNormal) usuarioRepository.save(cliente); // Aquí se guarda en la base de datos
    }

    public UsuarioAdmin crearAdministrador(String nombreUsuario, String mail, String contrasena,
                                           String nombre, String apellido, Date fechaNacimiento
    ) {
        UsuarioAdmin administrador = new UsuarioAdmin(nombreUsuario, mail, contrasena, nombre, apellido, fechaNacimiento);
        return (UsuarioAdmin) usuarioRepository.save(administrador); // Aquí se guarda en la base de datos
    }
}