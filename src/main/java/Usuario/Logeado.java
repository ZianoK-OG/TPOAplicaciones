package Usuario;

public class Logeado {

    public static Usuario LogearMail(String mail, String password){
        return UsuarioDAO.getUsuarioMail(mail, password);
    }

    public static Usuario LogearUsuario(String usuario, String password){
        return UsuarioDAO.getUsuarioUsuario(usuario, password);
    }
}
