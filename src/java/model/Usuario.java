/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author edisonarango
 */
public class Usuario {
    
    private String usuario;
    private int tipoUsuario;

    public Usuario(String usuario,  int tipoUsuario) {
        this.usuario = usuario;
        this.tipoUsuario = tipoUsuario;
    }

       
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
    
}
