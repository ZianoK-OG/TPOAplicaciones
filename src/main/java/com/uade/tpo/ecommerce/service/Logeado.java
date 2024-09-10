package com.uade.tpo.ecommerce.service;

import com.uade.tpo.ecommerce.model.Usuario;
import com.uade.tpo.ecommerce.repository.UsuarioDAO;

public class Logeado {

    public static Usuario LogearMail(String mail, String password){
        return UsuarioDAO.getUsuarioMail(mail, password);
    }

    public static Usuario LogearUsuario(String usuario, String password){
        return UsuarioDAO.getUsuarioUsuario(usuario, password);
    }
}
