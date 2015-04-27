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
public class Sesion {
    
    private boolean sesionIniciada;
    private String usuarioEnSesion;
    private int tipoUsuario;
    
    public Sesion (){
        sesionIniciada = false;
    }

    public boolean isSesionIniciada() {
        return sesionIniciada;
    }

    public String getUsuarioEnSesion() {
        return usuarioEnSesion;
    }
    
    
    public void usuarioLogueado(String usuario,int tipoUsuario){
        sesionIniciada = true;
        usuarioEnSesion = usuario;
        this.tipoUsuario = tipoUsuario;
    }
    
    public void sesionFinalizada (){
        sesionIniciada = false;
        usuarioEnSesion = "";
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
}
