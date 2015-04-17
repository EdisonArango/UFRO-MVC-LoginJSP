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
    
    public Sesion (){
        sesionIniciada = false;
    }

    public boolean isSesionIniciada() {
        return sesionIniciada;
    }

    public String getUsuarioEnSesion() {
        return usuarioEnSesion;
    }
    
    
    public void usuarioLogueado(String usuario){
        sesionIniciada = true;
        usuarioEnSesion = usuario;
    }
    
    public void sesionFinalizada (){
        sesionIniciada = false;
        usuarioEnSesion = "";
    }
}
