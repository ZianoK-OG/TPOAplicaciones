package com.uade.tpo.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import com.uade.tpo.ecommerce.model.Usuario;
import com.uade.tpo.ecommerce.model.UsuarioAdmin;
import com.uade.tpo.ecommerce.model.UsuarioNormal;
import com.uade.tpo.ecommerce.service.Logeado;
import com.uade.tpo.ecommerce.service.UsuarioService;

import java.util.Date;

@RestController
@RequestMapping("/api/usuario")
public class ControladorUsuario {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/normal")
    public UsuarioNormal registrarUsuarioNormal(@RequestParam String nombreUsuario,
                                                @RequestParam String mail,
                                                @RequestParam String contrasena,
                                                @RequestParam String nombre,
                                                @RequestParam String apellido,
                                                @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fechaNacimiento)
    {
        return usuarioService.crearCliente(nombreUsuario, mail, contrasena, nombre, apellido, fechaNacimiento);
    }

    @PostMapping("/admin")
    public UsuarioAdmin registrarAdministrador(@RequestParam String nombreUsuario,
                                               @RequestParam String mail,
                                               @RequestParam String contrasena,
                                               @RequestParam String nombre,
                                               @RequestParam String apellido,
                                               @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fechaNacimiento
    ) {
        return usuarioService.crearAdministrador(nombreUsuario, mail, contrasena, nombre, apellido, fechaNacimiento);
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
