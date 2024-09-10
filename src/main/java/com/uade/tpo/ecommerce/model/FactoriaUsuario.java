package com.uade.tpo.ecommerce.model;

import java.util.Date;

import com.uade.tpo.ecommerce.repository.UsuarioDAO;

public class FactoriaUsuario {

    public static Usuario CrearUsuarioNormal(String nombreUsuario, String mail, String contrasena, String nombre, String apellido, Date fechaNacimiento){

        Usuario user = new UsuarioNormal( nombreUsuario,  mail,  contrasena, nombre,  apellido, fechaNacimiento);
        UsuarioDAO.crear(user);
        return user;
    }

    public static Usuario CrearUsuarioAdmin(String nombreUsuario, String mail, String contrasena, String nombre, String apellido, Date fechaNacimiento){

        Usuario user = new UsuarioAdmin( nombreUsuario,  mail,  contrasena, nombre,  apellido, fechaNacimiento);
        UsuarioDAO.crear(user);
        return user;
    }
}
