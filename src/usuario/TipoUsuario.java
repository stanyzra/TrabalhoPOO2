/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

/**
 *
 * @author aleix
 */
public class TipoUsuario {

    private Usuario usuario;

    public TipoUsuario(Usuario user) {
        this.usuario = user;
    }

    public TipoUsuario() {

    }

    public void menu() {
        this.usuario.menu();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
} 
